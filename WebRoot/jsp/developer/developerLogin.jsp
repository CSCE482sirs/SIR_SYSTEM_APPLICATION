<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>
	
		<div id="areabox"></div>
	<p>Please enter your name</p>
	
	<s:form action="developerLogin.action">
			    
				<s:textfield id="Developer_name" label="developer name" name="Developer_name"/>
				
				<s:submit  />
				</s:form>
	
<%@include file="/commons/foot.jsp" %>