<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>IT355</title>
<style type="text/css">
body {
	background-color: lightblue;
}
</style>
</head>
<body>
	<h1>
		Web Sistemi 2
	</h1>
    <h2>${message}</h2>
    <sec:authorize access="hasRole('ROLE_USER')">
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
        <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
        <script>function formSubmit() {document.getElementById("logoutForm").submit(); }</script>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>Vase korisnicko ime je : ${pageContext.request.userPrincipal.name} |
                <a href="javascript:formSubmit()">Logout</a>
            </h2>
			<p><a href="soba.html">Dodaj sobu</a></p>
        </c:if>
    </sec:authorize>    
    <sec:authorize access="!hasRole('ROLE_USER')">
        <a href="login">Log in</a>
    </sec:authorize>
</body>
</html>