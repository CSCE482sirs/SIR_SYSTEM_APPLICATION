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
		      
		      <td width="20%" height="37" align="center"><b>id</b></td>
		      <td width="40%" height="37" align="center"><b>name</b></td>
              <td width="40%" height="37" align="center"><b>value</b></td>
          </tr>
          <!-- data -->
        <s:if test="products.size > 0"> 
		<s:iterator value="products" >
			 
			<tr id="1" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
		      
	          <td align="center" vAlign="middle"><s:property value="id" /></td>
	          <td align="center" vAlign="middle"><s:property value="name" /></td>
	          <td align="center" vAlign="middle"><s:property value="value" /></td>
	          <td>
					<s:url id="removeUrls" action="deleteatt">
						<s:param name="aid" value="anid" />
					</s:url>
					
					
			  </td>
	     	  
	          
			
         </s:iterator>
		</s:if>	
		
        <!-- 在列表数据为空的时候，要显示的提示信息 -->
	    
	    
	   <s:if test="products.size == 0">  
	    <tr>
	    	<td colspan="7" align="center" bgcolor="#EFF3F7" class="TableBody1" onmouseover="this.bgColor = '#DEE7FF';" onmouseout="this.bgColor='#EFF3F7';">
	    	No Data Now.
	    	</td>
	    </tr>
	    </s:if>
	    
      </table>
          

      
      
         
     
</center>
