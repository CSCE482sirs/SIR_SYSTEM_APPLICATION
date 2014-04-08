package dao;
import java.io.Serializable;
import java.util.List;

import pojo.Developer;
public interface DeveloperDao
{
	public void save(Developer entity);  
	  
    public void update(Developer entity);  
  
    public void delete(Serializable id);  
  
    public Developer findById(Serializable id);  
  
    public List<Developer> findBySQL(String sql, Developer... params);  
	public Developer findByName(String name);

}
