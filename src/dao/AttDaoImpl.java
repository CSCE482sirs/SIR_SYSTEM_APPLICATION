package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import pojo.Attribute_name;
import pojo.Attribute_name;;
@Transactional
public class AttDaoImpl implements AttDao{

	public AttDaoImpl() {
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

	
	public Attribute_name findByName(String name) 
	{
		// TODO Auto-generated method stub
		if(this.findAtt("select d from Attribute_name d where name = '"+name+"'").isEmpty())
		{
			Attribute_name product = new Attribute_name();
			product.setName(name);
			this.save(product);
		}
		return this.findAtt("select d from Attribute_name d where name = '"+name+"'").get(0);
	}

	public void save(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void update(Attribute_name entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	
	public Attribute_name findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Attribute_name.class, id);  
	}

	public List<Attribute_name> findAtt(String sql)
	{
		List <Attribute_name> products = new ArrayList<Attribute_name>();
		
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
