package dao;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_name;
import pojo.Product;

public interface AttDao {

	public void save(Object entity);  
	  
    public void update(Object entity);  
  
    public void delete(Serializable id);  
  
    public Attribute_name findById(Serializable id);  
  
     
	public Attribute_name findByName(String name);
	public List<Attribute_name> findAtt(String sql);

}
