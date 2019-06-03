<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <title>Position list</title>
</head>
<body>
  <jsp:include page="positionForm.jsp" />
  <hr>
  <table>
    <tr><td><th>Positionlist</th></td></tr>
 <tr><td>Position</td><td>Name</td><td>delete?</td></tr>
    <c:forEach items="${positions}" var="position">

    <tr><td>${position.playerPosition}</td><td>${position.positionName}</td><td><a href="deleteposition/${position.id}">delete</a></td></tr>
    </c:forEach>  

  </table>
</body>
</html>

