package service;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_name;
import pojo.Product;
import pojo.Product_Att;

public interface ProductService 
{
	public void save(Object entity);  
	  
    public void update(Product entity);  
  
    public void delete(Serializable id);  
  
    public Product getById(Serializable id);  
  
    public List<Product> getBySQL(String sql, Product... params); 
    public List<Attribute_name> getAtt(String sql); 
    public Product DevelopserLogin(String name);
    public void saveatt(Object entity); 
    public void deleteatt(Serializable id);
    public List<Product_Att> getProAtt(String sql) ;
    public void saveproatt(Object entity);
    
    public void deleteproatt(Serializable id);
    
}
