package dao;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_name;
import pojo.Product;;

public interface ProductDao 
{

	public void save(Object entity);  
	  
    public void update(Product entity);  
  
    public void delete(Serializable id);  
  
    public Product findById(Serializable id);  
  
    public List<Product> findBySQL(String sql, Product... params);  
	public Product findByName(String name);
	public List<Attribute_name> findAtt(String sql);
}
