package dao;

import java.io.Serializable;
import java.util.List;

import pojo.Product_Att;;

public interface Pro_AttDao {

	public void save(Object entity);  
	  
    public void update(Object entity);  
  
    public void delete(Serializable id);  
  
    public Product_Att findById(Serializable id);  
  
     
	public Product_Att findByName(String name);
	public List<Product_Att> findAtt(String sql);

}
