<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<script type="text/javascript">
	function test(){
		alert($("#username").val());
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/product!loginCheck',
			data:{name:$("#username").val()},
			success:function(data){
				$("#msg").html(data.result);		
			}
		});
	}

</script>
<body>
	<form action="login" method="post" onsubmit="">
	用户名：<input type="text" id="username" name="username" onblur="test();"><div style="color:red" id="msg"></div>
	密码：<input type="password" name="password">
	<input type="submit" value="提交">
</form>
</body>
</html>