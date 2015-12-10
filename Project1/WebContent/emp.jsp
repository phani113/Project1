<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<title>Employee's List</title>
<c:if test="${list eq null}">
  "Employee Not Found"
</c:if>
<c:if test="${list ne null}">
<core:forEach items="${list}" var="val">
<tr>
<td> Employee Name          : ${val.name} <br> </td>  
<td> Employee Salary          : ${val.sal } <br> </td>
</tr><br>

</core:forEach>
</c:if>





</body>
</html>