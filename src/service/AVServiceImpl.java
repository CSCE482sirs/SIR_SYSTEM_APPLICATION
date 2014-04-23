package service;

import java.io.Serializable;
import java.util.List;
import dao.AttValueDao;
import pojo.Attribute_value;

public class AVServiceImpl implements AVService{

	private AttValueDao attvaluedao;
	
	
	public AttValueDao getAttvaluedao() {
		return attvaluedao;
	}

	public void setAttvaluedao(AttValueDao attvaluedao) {
		this.attvaluedao = attvaluedao;
	}

	@Override
	public void save(Attribute_value entity) 
	{
		// TODO Auto-generated method stub
		this.attvaluedao.save(entity);
	}

	@Override
	public void update(Attribute_value entity) {
		// TODO Auto-generated method stub
		this.attvaluedao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		this.attvaluedao.delete(id);
	}

	@Override
	public Attribute_value getById(Serializable id) 
	{
		// TODO Auto-generated method stub
		return this.attvaluedao.findById(id);
	}

	@Override
	public List<Attribute_value> getBySQL(String sql, Attribute_value... params) {
		// TODO Auto-generated method stub
		return this.attvaluedao.findAtt(sql);
	}

	@Override
	public Attribute_value DevelopserLogin(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
