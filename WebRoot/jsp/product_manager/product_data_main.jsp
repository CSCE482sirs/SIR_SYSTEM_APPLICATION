<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>

<script>
function getText(value)
{
	document.getElementById("att_name").value=value;
	
}
</script>



Hello, ${sessionScope.user.username} <br>
You are the ${session.user.id}th developer in our system<br>
<a href="developerLogin?Developer_name=${session.user.username}">Main Page</a>
<a href = "/SIR_SYSTEM_APPLICATION/jsp/attributes/att_main.jsp">Attributes Page</a><br>
<s:property value="#session.user.name"/>

 <a href = "/SIR_SYSTEM_APPLICATION/jsp/developer/developerLogin.jsp">Login Out</a><br>
<hr>



		<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Last Page"><br><br>
		
		
		<p>
        <a href="../rating/ratingMain.jsp">Show Rating</a>  | 
       <a href="../recomend.action?pid=<%=request.getParameter("pid")%>">Recommend</a>
        </p>
		
		<s:url action="listproatt_data" id="descrsUrls">
		  <s:param name="pid"><%=request.getParameter("pid")%></s:param>
		</s:url>
		<s:property value="#parameters.time[0]"/>
        
        <div style="width: 600px;border-style: solid">
       
        <s:form action="addProAtt.action" method="post">
			    <s:textfield id="pro_att_id" name="pro_att.pro_att_id" cssStyle="display:none"/>
			   
				
		</s:form>
        <div style="text-align: right;">
    			<sx:a id="d" notifyTopics="/refresh">Refresh</sx:a>
    	</div>
    		
    	<sx:div id="proatt" theme="ajax" href="%{descrsUrls}"  listenTopics="/refresh"/>
    		
        </div>
		 
        <br/>
		
		
	<s:property value="#request."></s:property>
    


<%@include file="/commons/foot.jsp" %>