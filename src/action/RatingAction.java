package action;

import java.util.List;

import pojo.Rating;
import service.RatingService;
import service.ProductService;
public class RatingAction 
{
	public String hello;
	public Rating rating;
	public List<Rating> ratings;
	public Integer rid;
	public ProductService productservice;
	
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
}
