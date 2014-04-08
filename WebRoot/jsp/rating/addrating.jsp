<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>
	
		<div id="areabox"></div>
	<p>create your rating</p>
	<s:form action="addRating.action" method="post">
			    <s:textfield id="rid" name="rating.rid" cssStyle="display:none"/>
				<s:textfield id="uid" label="user_id" name="rating.uid" value = "1"/>
				
				<s:textfield id="pid" label="product_id" name="rating.pid"/>
				<s:textfield id="att_value" label="att_value" name="rating.att_value" />
				
				<s:textfield id="default" label="default" name="rating.defaults"/>
				
				<s:submit  />
	</s:form>
	</div>
	
<%@include file="/commons/foot.jsp" %>