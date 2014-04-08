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
      
      
      <table width="100%" border="0" cellPadding="0" cellSpacing="1" bgcolor="#6386d6">
          <!-- title -->
	      <tr bgcolor="#EFF3F7" class="TableBody1">
		      
		      <td width="15%" height="37" align="center"><b>name</b></td>
		      <td width="15%" height="37" align="center"><b>operation</b></td>
              
          </tr>
          <!-- data -->
        <s:if test="products.size > 0"> 
		<s:iterator value="products" >
			 
			<tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
		      
	         
	          <td align="center" vAlign="middle"> <a href = "/SIR_SYSTEM_APPLICATION/jsp/product_manager/display_proatt.action?pid=<s:property value="id" />&pname=<s:property value="name" />"><s:property value="name" /></a> </td>
	          
	     	  <td align="center" vAlign="middle">
					<s:url id="removeUrls" action="removeproduct">
						<s:param name="pid" value="id" />
					</s:url>
					<sx:a href="%{removeUrls}" notifyTopics="/refresh">Remove</sx:a>
					
			  </td>
	          
			
         </s:iterator>
		</s:if>	
		
       
	    
	    
	   <s:if test="products.size == 0">  
	    <tr>
	    	<td colspan="7" align="center" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
	    	No Data Now.
	    	</td>
	    </tr>
	    </s:if>
	    
      </table>
          

      
      
         
     
</center>
