package action;

import java.util.List;

import pojo.Developer;
import pojo.Product;
import pojo.Rating;
import pojo.User;
import service.RatingService;
import service.ProductService;
import util.SelectInputRecommender;
import util.TestDataGenerator;
public class RatingAction 
{
	public String hello;
	public Rating rating;
	public List<Rating> ratings;
	public Integer rid;
	public ProductService productservice;
	public int num_of_products;
	public int num_of_user_correlations;
	public int num_of_rolls;
	public List<Product> products;
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getNum_of_products() {
		return num_of_products;
	}
	public void setNum_of_products(int num_of_products) {
		this.num_of_products = num_of_products;
	}
	public int getNum_of_user_correlations() {
		return num_of_user_correlations;
	}
	public void setNum_of_user_correlations(int num_of_user_correlations) {
		this.num_of_user_correlations = num_of_user_correlations;
	}
	public int getNum_of_rolls() {
		return num_of_rolls;
	}
	public void setNum_of_rolls(int num_of_rolls) {
		this.num_of_rolls = num_of_rolls;
	}
	public ProductService getProductservice() {
		return productservice;
	}
	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public RatingAction() {
		// TODO Auto-generated constructor stub
	}
	private RatingService ratingservice;
	public RatingService getRatingservice() {
		return ratingservice;
	}
	public void setRatingservice(RatingService ratingservice) {
		this.ratingservice = ratingservice;
	}
	
	public String addRating()
	{
		rating.setDefaults("test");
		rating.setPid(1);
		rating.setUid(1);
		ratingservice.save(rating);
		return "success";
	}
	
	public String GetRate()
	{
		
		ratings= ratingservice.getBySQL("select r from Rating r");
		
		return "gsuccess";
	}
	public String RemoveRate()
	{
		ratingservice.delete(rid);
		return "gsucess";
	}
	public String Mydemo()
	{
		TestDataGenerator test = new TestDataGenerator( num_of_products, num_of_user_correlations, num_of_rolls );
		Developer dev = new Developer("dave", 0);
		SelectInputRecommender sir = new SelectInputRecommender(dev, test);
		//products =sir.recommend(new User(1), "");
		//for(int i=0;i<products.size();i++)
		//{
		//	products.get(i).setName("beer"+products.get(i).getId());
		//}
		/*for( Product p: sir.recommend(new User(1), "") )
		{
			System.out.println(p);
		}
		*/
		
		return "success";
	}
}
