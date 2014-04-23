package dao;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_value;
import pojo.Product;

public interface AttValueDao {

	public void save(Object entity);  
	  
    public void update(Object entity);  
  
    public void delete(Serializable id);  
  
    public Attribute_value findById(Serializable id);  
  
     
	public Attribute_value findByName(String name);
	public List<Attribute_value> findAtt(String sql);

}
