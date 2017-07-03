<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Shape</title>
</head>
<body>
<h1> ASCII SHAPE !!! </h1>
<h3><a href="<spring:url value="/" /> ">  New Shape </a></h3>
<c:forEach var="i" begin="0" end="${fn:length(shape)}" step="1">
<c:if test="${fn:substring(shape, i, i + 1) == ' '}">&nbsp; </c:if>
<c:if test="${fn:substring(shape, i, i + 1) == 'n'}"><br></c:if>
  <c:if test="${fn:substring(shape, i, i + 1) == '*'}"><c:out value="${fn:substring(shape, i, i + 1)}" /> </c:if>
        
</c:forEach>
      
</body>
</html>