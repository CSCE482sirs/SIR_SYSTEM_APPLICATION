package service;

import java.io.Serializable;
import java.util.List;

import pojo.Rating;
import dao.RatingDao;

public class RatingServiceImpl implements RatingService
{

	
	
	private RatingDao ratingdao;

		

	

	public RatingDao getRatingdao() {
		return ratingdao;
	}

	public void setRatingdao(RatingDao ratingdao) {
		this.ratingdao = ratingdao;
	}

	@Override
	public void save(Rating entity) {
		// TODO Auto-generated method stub
		ratingdao.save(entity);
	}

	@Override
	public void update(Rating entity) {
		// TODO Auto-generated method stub
		ratingdao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		ratingdao.delete(id);
	}

	@Override
	public Rating getById(Serializable id) {
		// TODO Auto-generated method stub
		return (Rating) ratingdao.findById(id);  
	}

	@Override
	public List<Rating> getBySQL(String sql, Rating... params) {
		// TODO Auto-generated method stub
		return ratingdao.findRating(sql);  
	}

	
	


}
