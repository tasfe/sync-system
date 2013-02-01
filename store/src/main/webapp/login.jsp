<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="/WEB-INF/jsp/include.jsp"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user login</title>
</head>
<body>
请登录：<br>
<form method="post" action="${pageContext.request.contextPath}/user/login.do">
	用户账号:<input type="text" name="username" /><br/>
	用户密码：<input type="text" name="password" /><br/>
	<input type="submit"> <input type="reset">
</form>
</body>
</html>