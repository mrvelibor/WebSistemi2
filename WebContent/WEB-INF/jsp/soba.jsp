<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="soba.naslov"/></title>
</head>
<body>

<h2><spring:message code="soba.naslov"/></h2>
   <table>
    <tr>
        <td><spring:message code="soba.brojKreveta"/></td>
        <td>${brojKreveta}</td>
    </tr>
    <tr>
        <td><spring:message code="soba.velicina"/></td>
        <td>${velicina}</td>
    </tr>
    <tr>
        <td><spring:message code="soba.kupatilo"/></td>
        <td>${kupatilo}</td>
    </tr>
    <tr>
        <td><spring:message code="soba.klima"/></td>
        <td>${klima}</td>
    </tr>
    <tr>
        <td><spring:message code="soba.tv"/></td>
        <td>${tv}</td>
    </tr>
    <tr>
        <td><spring:message code="soba.cenaPoDanu"/></td>
        <td>${cenaPoDanu}</td>
    </tr>
</table>  
</body>
</html>