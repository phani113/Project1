<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>   
<title>HOME</title>  
<form:form action="get.form" method="post" commandName="department">

Department Name=<form:input path="dept_Name"/><br>
<input type="submit" value="Get Employee's"><br><br>
</form:form>
</body>
</html>