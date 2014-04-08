package dao;

import java.io.Serializable;
import java.util.List;

import pojo.Rating;;

public interface RatingDao 
{
	public void save(Object entity);  
	  
    public void update(Object entity);  
  
    public void delete(Serializable id);  
  
    public Rating findById(Serializable id);  
  
     
	public Rating findByName(String name);
	public List<Rating> findRating(String sql);

}
