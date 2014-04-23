package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import pojo.Attribute_name;
import pojo.Attribute_value;
@Transactional
public class AttValueDaoImpl implements AttValueDao
{
	@PersistenceContext//META-INF/persistence.xml
	private EntityManager em; 
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}


	public void save(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void update(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	@Override
	public Attribute_value findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Attribute_value.class, id);  
	}

	@Override
	public Attribute_value findByName(String name) 
	{
		if(this.findAtt("select d from Attribute_value d where name = '"+name+"'").isEmpty())
		{
			Attribute_name product = new Attribute_name();
			product.setName(name);
			this.save(product);
		}
		return this.findAtt("select d from Attribute_value d where name = '"+name+"'").get(0);
	}

	@Override
	public List<Attribute_value> findAtt(String sql) 
	{
		List <Attribute_value> products = new ArrayList<Attribute_value>();
		
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

	

}
