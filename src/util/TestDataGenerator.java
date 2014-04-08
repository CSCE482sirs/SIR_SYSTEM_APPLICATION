package util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;
import pojo.Product;
import pojo.Developer;
import pojo.User;
/**
 * 
 */

/**
 * @author Chris
 *
 */


class UserStory
{
	public Product product;
	public double value;
	public UserStory( Product product , int num_of_rolls, Map<Product, Map<Product, Double>> actual_chances )
	{
		this.product = product;
		this.value = 0.0;
	}
}

public class TestDataGenerator implements DatabaseInterfaceBase
{
	SIR_Config config;
	Map<Product, Map<Product, Double > > actual_chances;
	
	List<Product> gen_products;
	Map<Product, Map<Product, Double> > gen_product_collaborative_vectors;
	Map<Product, Map<String, Double> > gen_product_content_vectors;
	Map<Product, Double> gen_user_collaborative_vector;
	Map<String, Double> gen_user_content_vector;
	
	public TestDataGenerator( int num_of_products, int num_of_user_correlations, int num_of_rolls )
	{
		config = new SIR_Config();
		createProducts( num_of_products );
		createActualChances();
		//createUserStories( num_of_user_correlations, num_of_rolls );
	}
	
	private void createProducts( int num_of_products )
	{
		gen_products = new ArrayList<Product>();
		for( int i = 0; i < num_of_products; i++ )
		{
			gen_products.add( new Product( ""+i, i ) );
		}
	}
	
	private void createActualChances()
	{
		actual_chances = new HashMap<Product, Map<Product, Double> >();
		for( int i = 0; i < gen_products.size(); i++ )
		{
			Product product = gen_products.get(i);
			Map< Product, Double > temp_chances = new HashMap< Product, Double >();
			for( int j = 0; j < gen_products.size(); j++ )
			{
				Product compare_to = gen_products.get(j);
				if( j > i )
				{
					temp_chances.put( compare_to, Math.random() );
				}
				else if ( j < i )
				{
					double chance = actual_chances.get(compare_to).get(product);
					temp_chances.put( compare_to, chance );
				}
				else
				{
					temp_chances.put( compare_to, 1.0 );
				}
			}
			actual_chances.put(product, temp_chances );
		}
	}

	/*private void createUserStories( int num_of_user_correlations, int num_of_rolls )
	{
		for( int i = 0; i < num_of_user_correlations; i++ )
		{
			
		}
	}*/
	@Override
	public SIR_Config getConfig(Developer dev) {
		// TODO Auto-generated method stub
		return config;
	}
	@Override
	public List<Product> get_products(Developer Dev) {
		// TODO Auto-generated method stub
		return gen_products;
	}
	@Override
	public Map<Product, Map<Product, Double>> get_products_collaborative_vectors(
			Developer dev, Collection<Product> products) {
		// TODO Auto-generated method stub
		return actual_chances;//gen_product_collaborative_vectors;
	}
	@Override
	public Map<Product, Map<String, Double>> get_products_content_vector(
			Developer dev, Collection<Product> products) {
		// TODO Auto-generated method stub
		return gen_product_content_vectors;
	}
	@Override
	public Map<Product, Double> get_user_collaborative_vector(Developer dev,
			Collection<Product> products, User user) {
		// TODO Auto-generated method stub
		gen_user_collaborative_vector = new HashMap<Product, Double>();
		for( Product p: gen_products )
		{
			 gen_user_collaborative_vector.put( p, Math.random() );
		}
		return gen_user_collaborative_vector;
	}
	@Override
	public Map<String, Double> get_user_content_vector(Developer dev, User user) {
		// TODO Auto-generated method stub
		return gen_user_content_vector;
	}
}
