package service;

import java.io.Serializable;
import java.util.List;

import pojo.Attribute_name;
import pojo.Product;
import pojo.Product_Att;
import dao.AttDao;
import dao.Pro_AttDao;
import dao.ProductDao;

public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	private AttDao attdao;
	private Pro_AttDao proattdao;
	
	public Pro_AttDao getProattdao() {
		return proattdao;
	}
	public void setProattdao(Pro_AttDao proattdao) {
		this.proattdao = proattdao;
	}
	public AttDao getAttdao() {
		return attdao;
	}
	public void setAttdao(AttDao attdao) {
		this.attdao = attdao;
	}
	private ProductDao productdao;
	public ProductDao getProductdao() {
		return productdao;
	}
	public void setProductdao(ProductDao productdao) {
		this.productdao = productdao;
	}
	
	
	@Override
	public void save(Object entity) {
		// TODO Auto-generated method stub
		productdao.save(entity);
	}

	@Override
	public void update(Product entity) {
		// TODO Auto-generated method stub
		productdao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		productdao.delete(id);
	}

	@Override
	public Product getById(Serializable id) {
		// TODO Auto-generated method stub
		return (Product) productdao.findById(id);  
	}

	@Override
	public List<Product> getBySQL(String sql, Product... params) {
		// TODO Auto-generated method stub
		return productdao.findBySQL(sql, params);  
	}  
	
	@Override
	public Product DevelopserLogin(String name) 
	{
		Product product;
		
		
		return (Product) this.productdao.findByName(name);
	}
	@Override
	public List<Attribute_name> getAtt(String sql) 
	{
		// TODO Auto-generated method stub
		return attdao.findAtt(sql);
	}

	public void saveatt(Object entity)
	{
		attdao.save(entity);
	}
	public void deleteatt(Serializable id)
	{
		attdao.delete(id);
	}
	public List<Product_Att> getProAtt(String sql) 
	{
		return proattdao.findAtt(sql);
	}
	public void saveproatt(Object entity)
	{
		proattdao.save(entity);
	}
	
	public void deleteproatt(Serializable id)
	{
		proattdao.delete(id);
	}
	
}
