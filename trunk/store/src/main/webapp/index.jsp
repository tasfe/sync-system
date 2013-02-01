<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@include file="/WEB-INF/jsp/common/_common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品同步信息</title>
<%@include file="/WEB-INF/jsp/common/_head.jsp" %>
<style type="text/css">
#main{margin-top:300px;} 
#main .title{text-align: left;}
#main .title{text-align: left;}
.sbutton{

}
</style>
</head>
<body>
	<div class="body">
		<div id="main">
			<div class="title">
				&nbsp;信息同步系统
			</div>
			<div id="loginDiv" >
				<div class="title">
					&nbsp;登录系统
				</div>
				<div>
					<table border="0" cellpadding="4">
						<tr>
							<td align="left">帐号</td><td><input type="text" /></td><td rowspan="2" valign="middle"><input style="height:50px; width:50px;" type="button" class="sbutton" value="登录"/></td>
						</tr>
						<tr> 
							<td align="left">密码</td><td><input type="text" /></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>