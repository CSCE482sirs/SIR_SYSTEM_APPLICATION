<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>

Hello, ${sessionScope.user.username} <br>
You are the ${developer.id}th developer in our system<br>
<a href="developerLogin?Developer_name=${session.user.username}">Main Page</a>
<s:property value="#session.user.name"/>

 <a href = "/SIR_SYSTEM_APPLICATION/jsp/developer/developerLogin.jsp">Login Out</a><br>
<hr>
<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Last Page"><br>
<br>
			
			
<s:url  action="listProducts" id="descrsUrls">
		
		</s:url>
		<s:property value="#parameters.time[0]"/>
        
        <div id ="myproducts" style="width: 100%;border-style: solid">
        
			<s:form action="addProduct.action" method="post">
			    <s:textfield id="id" name="product.id" cssStyle="display:none"/>
				<s:textfield id="name" label="Add Product" name="product.name"/>
				<s:textfield id="developerid" name="product.dev_id" value="%{#session.user.id}" cssStyle="display:none"/>
				
				<sx:submit notifyTopics="/refresh" />  
			</s:form>
        	<div style="text-align: right;">
    			<sx:a id="p" notifyTopics="/refresh">Refresh </sx:a>
    		</div>
    		
    		 
    		    <a href = "/SIR_SYSTEM_APPLICATION/jsp/attributes/att_main.jsp">Attributes Page</a><br>
    		
    		<sx:div id="products" theme="ajax" href="%{descrsUrls}"  listenTopics="/refresh"/>
    		
        </div>
		 
        <br/>
		
	<s:property value="#request."></s:property>
    


<%@include file="/commons/foot.jsp" %>