<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>


Hello, ${sessionScope.user.username} <br>
You are the ${developer.id}th developer in our system<br>
<a href="developerLogin?Developer_name=${session.user.username}">Main Page</a>
<a href = "/SIR_SYSTEM_APPLICATION/jsp/attributes/att_main.jsp">Attributes Page</a><br>
<s:property value="#session.user.name"/>

 <a href = "/SIR_SYSTEM_APPLICATION/jsp/developer/developerLogin.jsp">Login Out</a><br>
<hr>



		<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Last Page"><br><br>
		

		<s:url action="listAtt" id="descrsUrls">
		
		</s:url>
		<s:property value="#parameters.time[0]"/>
        
        <div style="width: 600px;border-style: solid">
        	<div style="text-align: right;">
    			<sx:a id="d" notifyTopics="/refresh">Refresh</sx:a>
    		</div>
    		<a href="addatt.jsp">Define Attributes</a>
    		<sx:div id="att_names" theme="ajax" href="%{descrsUrls}"  listenTopics="/refresh"/>
    		
        </div>
		 
        <br/>
		
		
	<s:property value="#request."></s:property>
    


<%@include file="/commons/foot.jsp" %>