<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%><%@
page import="cn.common.util.Config"%><%
	Config configObj = Config.instance();
	request.setAttribute("ROOT", configObj.getHost());
%>
<link rel="stylesheet" id="css" type="text/css" href="${ROOT}/css/reset.css"/>
<link rel="stylesheet" id="css" type="text/css" href="${ROOT}/css/common.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.0.min.js"></script>