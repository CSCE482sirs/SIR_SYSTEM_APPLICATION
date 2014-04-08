package service;

import java.io.Serializable;
import java.util.List;

import dao.DeveloperDao;
import pojo.Developer;;

public class DeveloperServiceImpl implements DeveloperService
{

	public DeveloperServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private DeveloperDao dao;

	

	public DeveloperDao getDao() {
		return dao;
	}

	public void setDao(DeveloperDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(Developer entity) {
		// TODO Auto-generated method stub
		dao.save(entity);
	}

	@Override
	public void update(Developer entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Developer getById(Serializable id) {
		// TODO Auto-generated method stub
		return (Developer) dao.findById(id);  
	}

	@Override
	public List<Developer> getBySQL(String sql, Developer... params) {
		// TODO Auto-generated method stub
		return dao.findBySQL(sql, params);  
	}  
	
	@Override
	public Developer DevelopserLogin(String name) 
	{
		Developer developer;
		
		
		return (Developer) this.getDao().findByName(name);
	}



	

}
