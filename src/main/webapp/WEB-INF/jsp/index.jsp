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

  <body>

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