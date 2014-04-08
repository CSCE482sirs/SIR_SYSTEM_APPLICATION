<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@include file="/commons/head.jsp" %>


Hello, ${sessionScope.user.username} <br>
You are the ${session.user.id}th developer in our system<br>
<a href="developerLogin?Developer_name=${session.user.username}">Main Page</a>
<a href = "/SIR_SYSTEM_APPLICATION/jsp/attributes/att_main.jsp">Attributes Page</a><br>
<s:property value="#session.user.name"/>

 <a href = "/SIR_SYSTEM_APPLICATION/jsp/developer/developerLogin.jsp">Login Out</a><br>
<hr>



		<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Last Page"><br><br>
		

		<s:url action="listproatt" id="descrsUrls">
		  <s:param name="pid">${product.id}</s:param>
		</s:url>
		<s:property value="#parameters.time[0]"/>
        
        <div style="width: 600px;border-style: solid">
        <p>Product:${product.name}</p>
        
        <p><a href="#">Input Data</a>  |  <a href="listproatt_data.action?pid=${product.id}">Show The Product data</a>  |  
        <a href="../attributes/addatt.jsp">Define Attributes</a></p>
        
        <s:form action="addProAtt.action" method="post">
			    <s:textfield id="pro_att_id" name="pro_att.pro_att_id" cssStyle="display:none"/>
			    <s:textfield name="pro_att.pro_id" value ="%{product.id}" cssStyle="display:none"></s:textfield>
				<s:textfield name="pro_att.pro_name" value ="%{product.name}" cssStyle="display:none"></s:textfield>
				<!--<s:textfield id="att_id" label="att_id" name="pro_att.att_id" />
				<s:textfield id="att_name" label="att_name" name="pro_att.att_name" />-->
				   
    			<s:iterator value="att_names" status="st">
				<tr>
				<td><input type="checkbox" name="pro_att.att_id" value="<s:property  value="anid"/>"><s:property  value="name"/>
				
				</td>
				
				
				</tr>
				</s:iterator>
				<s:textfield id="att_name"  name="pro_att.att_name" value = ""/>
				<sx:submit notifyTopics="/refresh" />
				
			</s:form>
        	<div style="text-align: right;">
    			<sx:a id="d" notifyTopics="/refresh">Refresh</sx:a>
    		</div>
    		
    		<sx:div id="proatt" theme="ajax" href="%{descrsUrls}"  listenTopics="/refresh"/>
    		
        </div>
		 
        <br/>
		
		
	<s:property value="#request."></s:property>
    


<%@include file="/commons/foot.jsp" %>