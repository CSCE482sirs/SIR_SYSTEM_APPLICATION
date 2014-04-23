<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page   import= "java.util.Date "%> 
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="style/oa.css" rel="stylesheet" type="text/css">
<script language="javascript" src="script/public.js"></script>
<title>Product</title>
</head>
<BODY bgColor=#dee7ff leftMargin=0 background="" topMargin=0 marginheight="0" marginwidth="0">

<center>
      
      <p>${product.name}</p>
      <table width="100%" border="0" cellPadding="0" cellSpacing="1" bgcolor="#6386d6">
          
          <!-- data -->
        
       
		
		
        
	    
	
	    
      </table>
          
	  
       
      <table width="100%" border="0" cellPadding="0" cellSpacing="1" bgcolor="#6386d6">
      	  <tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
			<s:iterator value="pro_atts" >
				 
				
			      
		          <td width="20%" align="center" vAlign="middle"><s:property value="att_name" /></td>
		         
		          
		     	  
		          
				
	         </s:iterator>
         	<td width="10%" align="center" vAlign="middle"></td>
         </tr>
         <tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
         	<s:iterator value="att_values">
         	
	         	 
				 
					  <td width="10%" align="center" vAlign="middle">
					    <table>
						  <s:iterator value="value">
						  	 <tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
						    	<td width="10%" align="center" vAlign="middle">
						    		<s:property value="att_value"/>
						    	</td>
						    	
						    </tr>
						    
						  </s:iterator>
						 </table>
						 
					  </td>
					  
					  <s:if test="key == att_values.size()-1">  
					  <td>
				  	  <table>
						  <s:iterator value="value">
						  	 <tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
						    	<td width="10%" align="center" vAlign="middle">
							    	
							    	<s:url id="addRating" action="addRating">
										<s:param name="rating.values" value="att_value" />
										
									</s:url>
									<sx:a href="%{addRating}" targets="rating">Like</sx:a>
									
						    	</td>
						    	
						    </tr>
						    
						  </s:iterator>
						 </table>
					  </td>
					  </s:if>
			</s:iterator>
			
       	 </tr>
      </table>
      
         
     
</center>
