<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>表达验证</title>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript">
	function formcheck(){
		var url="formcheck";
		var params="userid="+userid.value+"&userpwd="+userpwd.value;
		sendRequest(url.params,"POST",showresult);
}
function showresult(){
	if(httpRequest.readyState==4){
		if(httpRequest.Status==200){
			var info=httpRequest.responseTest;
			result.innerHTML=info;
		}
	}
}
</script>
</head>
<body>
	请输入用户名：<input type="text" name="userid" onblur="formcheck()"/><br/>
	请输入密码：<input type="password" name="userpwd"/><br/>
	<input type="button" value="登录" onclick="formcheck()"/>
	<div id="result"></div>
</body>
</html>