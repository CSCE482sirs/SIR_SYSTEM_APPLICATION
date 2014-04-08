package dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import pojo.Developer;;
@Transactional
public class DeveloperDaoImpl implements DeveloperDao
{

	public DeveloperDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@PersistenceContext//META-INF/persistence.xml
	private EntityManager em; 
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Developer findByName(String name) 
	{
		// TODO Auto-generated method stub
		if(this.findBySQL("select d from Developer d where username = '"+name+"'").isEmpty())
		{
			Developer developer = new Developer();
			developer.setUsername(name);
			this.save(developer);
		}
		return this.findBySQL("select d from Developer d where username = '"+name+"'").get(0);
	}

	@Override
	public void save(Developer entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	@Override
	public void update(Developer entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	@Override
	public Developer findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Developer.class, id);  
	}

	@Override
	public List<Developer> findBySQL(String sql, Developer... params) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Query query =  this.em.createQuery(sql);  
		        
		        return query.getResultList();  
	}

}
