<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Dodaj korisnika</title>
</head>
<body>

<h2>Dodaj korisnika</h2>
<form:form method="POST" action="/VeliborBacujkov/addKorisnik">
   <table>
    <tr>
        <td><form:label path="username">Username:</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td><form:label path="enabled">Enabled:</form:label></td>
        <td><form:checkbox path="enabled" /></td>
    </tr>
    <tr>
        <td><form:label path="korisnik_rola">Rola:</form:label></td>
        <td><form:input path="korisnik_rola" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="submit"/>"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>