package util;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import pojo.Developer;
import pojo.Product;
import pojo.User;/**
 * 
 */

/**
 * @author Chris
 *
 */
public class SelectInputRecommender {

	/**
	 * @param args
	 */
	Developer dev;
	DatabaseInterfaceBase data;
	
	public SelectInputRecommender( Developer dev, DatabaseInterfaceBase data )
	{
		this.dev = dev;
		this.data = data;
	}
	
	public List<Product> recommend( User user, String args ,Map<Product, Double> user_col_vect)
	{
		List<Product> products = data.get_products(dev); 
		Map<Product, Map<Product, Double>> pro_col_vects = data.get_products_collaborative_vectors(dev, products);
		//Map<Product, Double> user_col_vect = data.get_user_collaborative_vector(dev, products, user);
		do_cosine_sim( products, user_col_vect, pro_col_vects );
		Collections.sort(products);
		Collections.reverse(products);
		return products;
	}
	
	private <T> void do_cosine_sim( List<Product> products, Map<T, Double> user_vect, Map<Product, Map<T, Double >> product_vects )
	{
		List<Product> products_tmp = data.get_products(dev);
		for( Product product: product_vects.keySet() )
		{
			Map< T, Double > product_vect = product_vects.get( product );
			if( product_vect.size() != 0 )
			{
				double product_sum_of_squares = 0.0;
				double user_sum_of_squares = 0.0;
				double dot_product = 0.0;
				for (T x: user_vect.keySet() )
				{
					int id = ((Product) x).getId();
					Product pro = products_tmp.get(id);
					
					if( product_vect.containsKey(pro) )
					{
						double user_value = user_vect.get(x);
						double product_value = product_vect.get(pro);
						//System.out.print( "("+user_value+","+product_value+")" );
						dot_product += user_value*product_value;
						user_sum_of_squares += user_value*user_value;
						product_sum_of_squares += product_value*product_value;
					}
				}
				//System.out.print("\n");
				dot_product /= ( Math.sqrt( user_sum_of_squares )*( Math.sqrt(product_sum_of_squares ) ) );
				product.value *= dot_product;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDataGenerator test = new TestDataGenerator( 20, 20, 2 );
		Developer dev = new Developer("dave", 0);
		SelectInputRecommender sir = new SelectInputRecommender(dev, test);
		//for( Product p: sir.recommend(new User(1), "") )
		{
			//System.out.println(p);
		}
	}
}
