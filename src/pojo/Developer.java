package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="developer")
public class Developer {

	/**
	 * @param args
	 */
	@Id
	@GeneratedValue
	int id;
	@Column(name="username")
	String username;
	
	public Developer()
	{}
	public Developer( String username, int id )
	{
		this.username = username;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
