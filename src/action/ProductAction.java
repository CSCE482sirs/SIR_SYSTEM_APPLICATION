package action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Preparable;

import pojo.Attribute_name;
import pojo.Developer;
import pojo.Product;
import pojo.Product_Att;
import service.ProductService;
public class ProductAction implements Preparable,ServletRequestAware
{

	private Product product;
	private List<Product> products;
	private ProductService productservice;
	private List<Attribute_name> att_names;
	private Product_Att pro_att;
	private List<Product_Att> pro_atts;
	private Attribute_name att_name;
	private Integer pid;
	private Integer aid;
	private Integer developer_id;
	private String pname;
	private Integer pro_att_id;
	
	
	public Integer getPro_att_id() {
		return pro_att_id;
	}

	public void setPro_att_id(Integer pro_att_id) {
		this.pro_att_id = pro_att_id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Product_Att getPro_att() {
		return pro_att;
	}

	public void setPro_att(Product_Att pro_att) {
		this.pro_att = pro_att;
	}

	public List<Product_Att> getPro_atts() {
		return pro_atts;
	}

	public void setPro_atts(List<Product_Att> pro_atts) {
		this.pro_atts = pro_atts;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getDeveloper_id() {
		return developer_id;
	}

	public void setDeveloper_id(Integer developer_id) {
		this.developer_id = developer_id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public List<Attribute_name> getAtt_names() {
		return att_names;
	}

	public void setAtt_names(List<Attribute_name> att_names) {
		this.att_names = att_names;
	}

	public Attribute_name getAtt_name() {
		return att_name;
	}

	public void setAtt_name(Attribute_name att_name) {
		this.att_name = att_name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	public ProductAction() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String addProduct()
	{
		productservice.save(this.product);
		return execute();
	}
	
	
	public String listProducts()
	{
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		Developer developer = new Developer();
		developer = (Developer) session.getAttribute("user");
		developer_id = developer.getId();
		this.products = productservice.getBySQL("select p from Product p where dev_id = "+developer_id);
		
		return "success";
		
	}
	public String listAtt()
	{
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		Developer developer = new Developer();
		developer = (Developer) session.getAttribute("user");
		this.att_names = productservice.getAtt("select a from Attribute_name a where dev_id="+developer.getId());
		return "success";
	}
	
	public String addAtt()
	{
		
		
		productservice.saveatt(att_name);
		return "success";
	}
	
	public String removeproduct()
	{
		productservice.delete(pid);
		
		
		return execute();
	}
	public String removepatt()
	{
		productservice.deleteatt(aid);
		return "success";
	}
	
	public String listproatt()
	{
		this.pro_atts=productservice.getProAtt("select a from Product_Att a where pro_id = "+pid+"" );
		return "success";
	}
	public String listproatt_data()
	{
		this.pro_atts=productservice.getProAtt("select a from Product_Att a where pro_id = "+pid+"" );
		product = productservice.getById(pid);
		return "success";
	}
	public String addProAtt()
	{
		
		
		productservice.saveproatt(pro_att);
		return "success";
	}
	public String display_proatt()
	{
		
		product = productservice.getById(pid);
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		Developer developer = new Developer();
		developer = (Developer) session.getAttribute("user");
		this.att_names = productservice.getAtt("select a from Attribute_name a where dev_id="+developer.getId());
		return "success";
	}
	
	public String remove_proatt()
	{
		productservice.deleteproatt(pro_att_id);
		return "success";
	}
	@SuppressWarnings("unchecked")
	public String execute()
	{
		listProducts();
		return "gsuccess";
	}
	
	
}
