package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product  implements Comparable<Product>
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="dev_id")
	private Integer dev_id;
	@Column(name="name")
	private String name;
	@Column(name="defaults")
	private String defaults;
	
	//value of possibility
	@Column(name="value")
	public double value;
	
	
	
	public Product(  ){}
	public Product( String name, int id )
	{
		this.name = name;
		this.id = id;
		value = 1.0;
	}
	
	
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return ((Double)this.value).compareTo(o.value);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean result = false;
        if (obj instanceof Product) {
        	Product product = (Product)(obj);
        	result =  (this.id == product.id );
        }
        return result;
	}
	
	@Override
	public String toString()
	{
		return name + ":" + value; 
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer pid) {
		this.id = pid;
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
	public Integer getDev_id() {
		return dev_id;
	}
	public void setDev_id(Integer dev_id) {
		this.dev_id = dev_id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
