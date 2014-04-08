package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="attribute_value")
public class Attribute_value 
{
	@Id
	@GeneratedValue
	private Integer avid;
	@Column(name = "att_id")
	private Integer att_id;
	@Column(name = "product_id")
	private Integer product_id;
	@Column(name = "att_value")
	private String att_value;
	public Integer getAvid() {
		return avid;
	}
	public void setAvid(Integer avid) {
		this.avid = avid;
	}
	public Integer getAtt_id() {
		return att_id;
	}
	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getAtt_value() {
		return att_value;
	}
	public void setAtt_value(String att_value) {
		this.att_value = att_value;
	}
	
	
}
