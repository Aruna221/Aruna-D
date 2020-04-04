<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
   <link href='<c:url value="/resources/css/sample1.css"></c:url>' rel="stylesheet">
<script>
function validateForm()
{
if(document.form1.txt_username.value=="") {
alert("User Name should not be blank..");
document.form1.txt_username.focus();
return false;
} else if(document.form1.txt_password.value=="") {
alert("Password should not be blank");
document.form1.txt_password.focus();
return false;
}
if(document.form1.txt_companyname.value=="") {
alert("Companyname should not be blank..");
document.form1.txt_companyname.focus();
return false;
} else if(document.form1.txt_productname.value=="") {
alert("Productname should not be blank");
document.form1.txt_productname.focus();
return false;
} else if(document.form1.txt_price.value=="") {
alert("Price should not be blank");
document.form1.txt_price.focus();
return false;
}
}


</script>
</head>
</head>

<body>

<form:form id="form1" name="form1" modelAttribute="product" method="post" background-color="lucida Bright" action="register" onSubmit="return validateForm()">
<table width="80" height="250" border="0" align="left" >
<tr>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
</tr>
<tr>
<td><fieldset>
<center><h1>REGISTER</h1></center>
<table width="350" height="250" border="0" align="center">

<tr>
<td width="69">&nbsp;</td>
<td colspan="2"><b>Username</b></td>
<td colspan="3"><label> <form:input type="text"
name="txt_username" id="txt_username" path="username" />
</label></td>
<td width="56">&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td colspan="2"><b>Password</b></td>
<td colspan="3"><form:input type="password"
name="txt_password" id="txt_password" path="password" /></td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td colspan="2"><b>Companyname</b></td>
<td colspan="3"><form:input type="text" name="txt_companyname"
id="txt_companyname" path="companyname" /></td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td colspan="2"><b>Productname</b></td>
<td colspan="3"><form:input type="text" name="txt_productname"
id="txt_productname" path="productname" /></td>
<td>&nbsp;</td>
</tr>


<tr>
<td>&nbsp;</td>
<td colspan="2"><b>Price</b></td>
<td colspan="3"><form:input type="text" name="txt_price"
id="txt_price" path="price" /></td>
<td>&nbsp;</td>
</tr>
<tr>

<td>&nbsp;</td>
<td>&nbsp;</td>
<td width="60">&nbsp;</td>
<td width="68"><input type="submit" name="btn_submit"
id="btn_submit" value="Submit" /></td>
<td>&nbsp;</td>

</tr>
</table>

</fieldset></td>
</tr>
</table>

</form:form>
</body>
</html>