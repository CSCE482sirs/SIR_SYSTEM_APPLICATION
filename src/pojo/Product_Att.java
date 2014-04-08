package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_att")
public class Product_Att 
{
	@Id
	@GeneratedValue
	private Integer pro_att_id;
	@Column(name="pro_id")
	private Integer pro_id;
	@Column(name="pro_name")
	private String pro_name;
	@Column(name="att_id")
	private Integer att_id;
	@Column(name="att_name")
	private String att_name;
	@Column(name="defaults")
	private String defaults;
	
	
	public Integer getPro_att_id() {
		return pro_att_id;
	}
	public void setPro_att_id(Integer pro_att_id) {
		this.pro_att_id = pro_att_id;
	}
	public Integer getPro_id() {
		return pro_id;
	}
	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public Integer getAtt_id() {
		return att_id;
	}
	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}
	public String getAtt_name() {
		return att_name;
	}
	public void setAtt_name(String att_name) {
		this.att_name = att_name;
	}
	public String getDefaults() {
		return defaults;
	}
	public void setDefaults(String defaults) {
		this.defaults = defaults;
	}
	
	/*
	@OneToMany
	@JoinColumns
	({
		@JoinColumn(name="att_id",referencedColumnName="att_id",nullable=false),
		@JoinColumn(name="product_id" ,referencedColumnName="pro_id",nullable=false)
	})
	private Attribute_value att_vaule;
	
	
	public Attribute_value getAtt_vaule() {
		return att_vaule;
	}
	public void setAtt_vaule(Attribute_value att_vaule) {
		this.att_vaule = att_vaule;
	}*/

}
