<!-- EL IMPLICIT OBJECT::pageContext.request.contextPath
(http://localhost:8080/SpringHibIntegra)-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<head>
   <link href='<c:url value="/resources/css/sample5.css"></c:url>' rel="stylesheet">

</head>

<body>
	<form:form id="form1" name="form1" modelAttribute="product" method="post" action="view1">
		<center><table width="250" height="350" border="0" align="left">
			<tr>
				<td width="520">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
		  			<center><p><font face="Verdana" color="#F0F3F4" size="7">SEARCH</font></p>
		  			</center>
						<table width="59" border="0" align="left">
							<tr>
								<td colspan="8">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							<td colspan="8" style="color: red"><c:if
									test="${not empty result}">${result}</c:if></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td width="50">&nbsp;</td>
								<td width="114">id</td>
								<td colspan="17" style=color:"#F0F3F4"><label> 
<form:input type="text"	name="txt_id" id="txt_id" style=" width : 159px;" path="id" />
								</label></td>
								<td width="131">&nbsp;</td>
							</tr>
							<tr></tr><tr></tr>
							<tr>
							</tr>
							<tr>
							</tr>
							
							
							
							<tr></tr>
							<td>&nbsp;</td>
	              <td><a href="${pageContext.request.contextPath}/view">View??</a></td>
							<td colspan="11"><label> 
				
								<td width="109"><label></label></td>
								<td width="73"><label> 
							
	             
                        <input type="submit" name="btn_search" id="btn_search" value="search" />
								</label></td>
							</tr>
						</table>
					</fieldset></td>
			</tr>
		</table></center>
		
	</form:form>
</body>
</html>