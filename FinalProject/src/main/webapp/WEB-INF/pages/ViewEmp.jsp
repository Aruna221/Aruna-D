<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false"%>
  <head>
   <link href='<c:url value="/resources/css/sample1.css"></c:url>' rel="stylesheet">
</head>
<body>
  <h1><font face="licida Bright" color="#1C2833" align="right">Product List</font></h1>
		  
<table border="9" width="70%" align="center">  

<tr><th>id</th><th>companyname</th><th>price</th><th>productname</th><th>Delete::</th><th>Update::</th></tr>    
  <!-- emps === model attribute in controller -->
  
   <c:forEach var="emp11" items="${emps}">   
   <tr>  
   <td>${emp11.id}</td>  
   <td>${emp11.companyname}</td> 
   <td>${emp11.price}</td>  
   <td>${emp11.productname}</td>
        <td>
        <!-- 1.onclick javascript event 2.confirm similar to alert but takes OK CANCEL BUTTONS -->
       <a href="deleteemps/${emp11.id}" onclick="if(!(confirm('Are you sure you want to delete this employee?'))) return false">Delete</a></td>
       <td>  
       <a href="updateemps/${emp11.id}" onclick="if(!(confirm('Are you sure you want to update this employee?'))) return false">Update</a></td>
      
        
   </tr>
    </c:forEach>  
          
    
   </table>
    <h3><a href="login">Logout</a></p></h3> <h4><a href="search">Search</a></p></h4> 
   </body>