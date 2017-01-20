<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Dodaj sobu</title>
</head>
<body>

<h2><spring:message code="soba.naslov"/></h2>
<form:form method="POST" action="/VeliborBacujkov/addSoba.html">
   <table>
    <tr>
        <td><form:label path="brojKreveta"><spring:message code="soba.brojKreveta"/></form:label></td>
        <td><form:input path="brojKreveta" /></td>
    </tr>
    <tr>
        <td><form:label path="velicina"><spring:message code="soba.velicina"/></form:label></td>
        <td><form:input path="velicina" /></td>
    </tr>
    <tr>
        <td><form:label path="kupatilo"><spring:message code="soba.kupatilo"/></form:label></td>
        <td><form:checkbox path="kupatilo" /></td>
    </tr>
    <tr>
        <td><form:label path="tv"><spring:message code="soba.tv"/></form:label></td>
        <td><form:checkbox path="tv" /></td>
    </tr>
    <tr>
        <td><form:label path="klima"><spring:message code="soba.klima"/></form:label></td>
        <td><form:checkbox path="klima" /></td>
    </tr>
    <tr>
        <td><form:label path="cenaPoDanu"><spring:message code="soba.cenaPoDanu"/></form:label></td>
        <td><form:input path="cenaPoDanu" /></td>
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