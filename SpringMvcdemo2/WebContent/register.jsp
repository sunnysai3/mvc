<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="register" action="checkRegister.obj">
enter first name:<form:input path="firstName"/><br/>
enter last name:<form:input path="lastName"/><br/>
gender:<form:radiobutton path="gender" value="m" label="m"/>
<form:radiobutton path="gender" value="f" label="f"/>
enter eMail:<form:input path="email"/><br/>
 <%-- enter skillSet:<form:checkbox  path="skillset" value="java" label="java"/>
<form:checkbox  path="skillset" value="struts" label="struts"/>
<form:checkbox  path="skillset" value="spring" label="spring"/>
<form:checkbox  path="skillset" value="hibernate" label="hibernate"/>
select your city:
<form:select path="city">
<form:option value="blr" label="banglore"/>
<form:option value="mys" label="mysore"/>
<form:option value="chn" label="chennai"/> 
</form:select>  --%>
<input type="submit" value="register"/>
</form:form> 
</body>
</html>