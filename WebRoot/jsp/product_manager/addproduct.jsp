<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>
	
		<div id="areabox"></div>
	<p>Add the Product</p>
	<s:form action="addProduct.action" method="post">
			    <s:textfield id="id" name="product.id" cssStyle="display:none"/>
				<s:textfield id="name" label="name" name="product.name"/>
				<s:textfield id="developerid" name="product.dev_id" value="%{#session.user.id}" cssStyle="display:none"/>
				
				<s:submit  />
	</s:form>
	</div>
	
<%@include file="/commons/foot.jsp" %>