<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/9
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HttpSession sessions=request.getSession();
    sessions.getAttribute("user");
    String msg=(String)request.getAttribute("msg");
    if (msg!=null){
%>
    <h1><%=msg%></h1>
<%=sessions%>
<%
    }
%>
<div>
    <strong> welcome,${sessionScope.user.userName}! </strong>
</div>
</body>
</html>
