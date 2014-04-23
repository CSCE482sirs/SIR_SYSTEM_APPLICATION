<jsp:directive.page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"/>
<jsp:directive.include file="/commons/head.jsp"/>
	
		
		
	<br/>	
	<p>Selection</p>
	<s:form action="Mydemo.action" method="post">
			    <s:textfield id="anid" label= "number of products" name="num_of_products" />
				<s:textfield id="avid" label="number of user correlations" name="num_of_user_correlations" />
				
				<s:textfield id="name" label="number of rolls" name="num_of_rolls"/>
				
				
				<s:submit/>
	</s:form>
	
	
<jsp:directive.include file="/commons/foot.jsp"/> 