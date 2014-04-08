package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;


import pojo.Rating;
@Transactional
public class RatingDaoImpl implements RatingDao{

	@PersistenceContext//META-INF/persistence.xml
	private EntityManager em; 
	
	
	public EntityManager getEm() {
		return em;
	}

	public Rating findByName(String name) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void update(Rating entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	
	public Rating findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Rating.class, id);  
	}

	public List<Rating> findRating(String sql)
	{
		List <Rating> products = new ArrayList<Rating>();
		
		Query query =  this.em.createQuery(sql);  
        /*if(query.getResultList().isEmpty())
        {
        	Product Product = new Product();
        	Product.setName("example");
        	products.add(Product);
        	return products;
        }*/
        return query.getResultList();  
		
	}

	@Override
	public void update(Object entity) 
	{
		// TODO Auto-generated method stub
		
	}
	

}
