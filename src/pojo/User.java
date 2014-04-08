package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="defaults")
	private String defaults;
	
	public User( int id )
	{
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer uid) {
		this.id = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefaults() {
		return defaults;
	}
	public void setDefaults(String defaults) {
		this.defaults = defaults;
	}
	
}
