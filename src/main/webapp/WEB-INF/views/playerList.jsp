<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <title>player list</title>
</head>
<body>
  <jsp:include page="playersForm.jsp" />
  <hr>
  <table>
    <tr><td><th>Playerslist</th></td></tr>
 <tr><td>E-mail</td><td>Name</td><td>delete?</td></tr>
    <c:forEach items="${players}" var="player">

    <tr><td>${player.email}</td><td>${player.name}</td><td><a href="delete/${player.id}">delete</a></td></tr>
    </c:forEach>  

  </table>
</body>
</html>

