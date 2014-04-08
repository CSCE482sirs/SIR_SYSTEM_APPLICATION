package service;

import java.io.Serializable;
import java.util.List;

import pojo.Developer;

public interface DeveloperService
{

	public void save(Developer entity);  
	  
    public void update(Developer entity);  
  
    public void delete(Serializable id);  
  
    public Developer getById(Serializable id);  
  
    public List<Developer> getBySQL(String sql, Developer... params); 
    
    public Developer DevelopserLogin(String name);
}
