<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>
	
		
		
	<br>	
	<p>create your attributes</p>
	<s:form action="addatt.action" method="post">
			    <s:textfield id="anid" name="att_name.anid" cssStyle="display:none"/>
				<s:textfield id="avid" label="value_id" name="att_name.avid" value = "1"/>
				
				<s:textfield id="name" label="name" name="att_name.name"/>
				<s:textfield id="dev_id" label="dev_id" name="att_name.dev_id" value="%{#session.user.id}" cssStyle="display:none" />
				<s:textfield id="weight" label="weight" name="att_name.weight"/>
				
				<s:textfield id="default" label="default" name="att_name.defaults"/>
				
				<s:submit  />
	</s:form>
	
	
<%@include file="/commons/foot.jsp" %>