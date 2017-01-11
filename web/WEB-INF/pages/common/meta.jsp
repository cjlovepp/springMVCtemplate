<%--
  Created by IntelliJ IDEA.
  User: chenjing
  Date: 2016/12/15
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path +"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="<%=basePath%>public/bootstrap/css/bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=basePath%>public/adminlte/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="<%=basePath%>public/adminlte/plugins/iCheck/square/blue.css">
    <!-- jQuery 2.2.3 -->
    <script src="<%=basePath%>public/adminlte/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <!-- Bootstrap 3.3.6 -->
    <script src="<%=basePath%>public/bootstrap/js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="<%=basePath%>public/adminlte/plugins/iCheck/icheck.min.js"></script>

