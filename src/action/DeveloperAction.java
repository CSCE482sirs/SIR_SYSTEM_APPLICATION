package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Preparable;
import pojo.Developer;
import pojo.Product;
import pojo.User;
import service.DeveloperService;
import util.SelectInputRecommender;
import util.TestDataGenerator;

public class DeveloperAction implements Preparable,ServletRequestAware
{

	Developer developer;
	DeveloperService developserservice;
	String Developer_name;
	
	public DeveloperService getDevelopserservice() {
		return developserservice;
	}

	public void setDevelopserservice(DeveloperService developserservice) {
		this.developserservice = developserservice;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	
	public String getDeveloper_name() {
		return Developer_name;
	}

	public void setDeveloper_name(String developer_name) {
		Developer_name = developer_name;
	}

	public DeveloperAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String DeveloperLogin()
	{
		
		
		
		developer = developserservice.DevelopserLogin(Developer_name);
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		session.setAttribute("user", developer);
		
		return "success";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare() throws Exception 
	{
		// TODO Auto-generated method stub
		
	}

}
