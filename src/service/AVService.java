package service;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_value;;

public interface AVService {

	public void save(Attribute_value entity);  
	  
    public void update(Attribute_value entity);  
  
    public void delete(Serializable id);  
  
    public Attribute_value getById(Serializable id);  
  
    public List<Attribute_value> getBySQL(String sql, Attribute_value... params); 
    
    public Attribute_value DevelopserLogin(String name);
}


