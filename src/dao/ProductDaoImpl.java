package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import pojo.Attribute_name;
import pojo.Product;
@Transactional
public class ProductDaoImpl implements ProductDao{

	public ProductDaoImpl() 
	{
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

	
	public Product findByName(String name) 
	{
		// TODO Auto-generated method stub
		if(this.findBySQL("select d from Product d where name = '"+name+"'").isEmpty())
		{
			Product product = new Product();
			product.setName(name);
			this.save(product);
		}
		return this.findBySQL("select d from Product d where name = '"+name+"'").get(0);
	}

	public void save(Object entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void update(Product entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		em.remove(this.findById(id));
	}

	
	public Product findById(Serializable id) {
		// TODO Auto-generated method stub
		return this.em.find(Product.class, id);  
	}

	public List<Attribute_name> findAtt(String sql)
	{
		List <Product> products = new ArrayList<Product>();
		
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
	public List<Product> findBySQL(String sql, Product... params) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List <Product> products = new ArrayList<Product>();
		
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
