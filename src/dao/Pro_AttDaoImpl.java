package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import pojo.Product_Att;;

@Transactional
public class Pro_AttDaoImpl implements Pro_AttDao{

	public Pro_AttDaoImpl() {
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
	public Product_Att findByName(String name) 
	{
		// TODO Auto-generated method stub
		/*if(this.findAtt("select d from Attribute_name d where name = '"+name+"'").isEmpty())
		{
			Product_Att product = new Product_Att();
			product.setName(name);
			this.save(product);
		}
		return this.findAtt("select d from Attribute_name d where name = '"+name+"'").get(0);*/
		return null;
	}

	public void save(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void update(Product_Att entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	
	public Product_Att findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Product_Att.class, id);  
	}

	public List<Product_Att> findAtt(String sql)
	{
		List <Product_Att> products = new ArrayList<Product_Att>();
		
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
	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	
	
}
