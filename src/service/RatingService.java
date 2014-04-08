package service;

import java.io.Serializable;
import java.util.List;

import pojo.Rating;;

public interface RatingService {

	public void save(Rating entity);  
	  
    public void update(Rating entity);  
  
    public void delete(Serializable id);  
  
    public Rating getById(Serializable id);  
  
    public List<Rating> getBySQL(String sql, Rating... params); 
    
    

}
