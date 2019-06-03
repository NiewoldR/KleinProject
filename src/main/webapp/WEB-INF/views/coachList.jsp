<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

      <link rel = "icon" type = "image/png" href = "http://groningengiants.nl/wp-content/uploads/2019/01/cropped-fullLogo-32x32.jpg">
      <!-- For apple devices -->
      <link rel = "apple-touch-icon" type = "image/png" href = "http://groningengiants.nl/wp-content/uploads/2019/01/cropped-fullLogo-32x32.jpg"/>

      <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

      <link rel="stylesheet" type="text/css" href='/resources/css/style.css'>

      <title>Coach List</title>
<style>







</style>


</head>

<body>
<div class="jumbotron">
        <div class="aboveline"><h1 class="display-4">Coach list</h1>
<p class="lead">Here is a list of all coaches</p>
            <hr class="my-4"></div></div>
<div class="container">
<table id="myTable">


    <!--When a header is clicked, run the sortTable function, with a parameter, 0 for sorting by names, 1 for sorting by country:-->
 <tr class="head">
 <th  class="th1" onclick="sortTable(0)">E-mail</th>
 <th  class="th2" onclick="sortTable(1)">Name</th>
 <th  class="th3" onclick="sortTable(2)">Coach Role</th>
 <th class="th4" >delete?</th>
 </tr>
    <c:forEach items="${coaches}" var="coach">

    <tr>
    <td class="td1">${coach.email}</td>
    <td class="td2">${coach.name}</td>
    <td class="td3">${coach.coachRole}</td>
    <td class="td4"><a href="deletecoach/${coach.id}">delete</a></td>
    </tr>


    </c:forEach>

  </table>
</td>
<script>
function sortTable(n) {
  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
  table = document.getElementById("myTable");
  switching = true;
  //Set the sorting direction to ascending:
  dir = "asc";
  /*Make a loop that will continue until
  no switching has been done:*/
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    rows = table.rows;
    /*Loop through all table rows (except the
    first, which contains table headers):*/
    for (i = 1; i < (rows.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*Get the two elements you want to compare,
      one from current row and one from the next:*/
      x = rows[i].getElementsByTagName("TD")[n];
      y = rows[i + 1].getElementsByTagName("TD")[n];
      /*check if the two rows should switch place,
      based on the direction, asc or desc:*/
      if (dir == "asc") {
        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch = true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
      //Each time a switch is done, increase this count by 1:
      switchcount ++;
    } else {
      /*If no switching has been done AND the direction is "asc",
      set the direction to "desc" and run the while loop again.*/
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
</script>



</body>
</html>

