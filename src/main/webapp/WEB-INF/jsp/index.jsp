<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MyHtml5.html</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <style>
    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }

    td, th {
      border: 1px solid #dddddd;
      text-align: center;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
    </style>

  </head>

<<<<<<< HEAD
  <body>
=======
  <body class="container-fluid">

 <nav class="black">
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">
      <img src="/images/saflogo.jpg" width="150">
      </a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="/pagetwo">Page2</a></li>
        <li><a href="badges.html">Components</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
    </div>
  </nav>


     <table>
          <thead>
            <tr>
            <th>ID</th>
                <th>Region</th>
                <th>Tower ID</th>
                <th>Site Name</th>
                <th>Cell Type</th>
                <th>Field Engineer</th>
                <th>Telephone Number</th>
            </tr>
          </thead>

          <tbody>
   <c:forEach var="sitess" items="${sites}">
   <tr>
   <td>${sitess.id}</td>
   <td>${sitess.region}</td>
   <td>${sitess.tower_id}</td>
   <td>${sitess.site_name}</td>
   <td>${sitess.cell_type}</td>
   <td>${sitess.field_engineer}</td>
   <td>${sitess.telephone_number}</td>
   </tr>


   </c:forEach>
          </tbody>
        </table>

>>>>>>> a0ad67fe3c46ef9edd46dce34770079e6fa03a51

  <table>
  <tr>
  <th>ID</th>
  <th>CELL_TYPE</th>
    <th>FIELD_ENGINEER</th>
      <th>REGION</th>
        <th>SITE_NAME</th>
          <th>TELEPHONE_NUMBER</th>
            <th>TOWER_ID</th>
  </tr>
  </table>


<script type="text/javascript" src="/resources/js/jquery.js"></script>
  </body>
</html>