<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="springMybatis">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=basePath%>framework/angular-1.4.3/angular/angular.js" type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>index.module.js" type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>controller.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<div ng-controller="indexController as vm">
		{{vm.name}}
	</div>
</body>
</html>