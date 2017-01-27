<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Novi korisnik</title>
</head>
<body>

<h2>Novi korisnik</h2>
   <table>
    <tr>
        <td>Username:</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>Password:</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>Enabled:</td>
        <td>${enabled}</td>
    </tr>
</table>  
</body>
</html>