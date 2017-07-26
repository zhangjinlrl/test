 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>

<body>
<script type="text/javascript">
	function test(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/product!login',
			success:function(data){
				alert(data.result);
				var jsonObj=eval("("+data.result+")");
				$.each(jsonObj,function(i, json){
					alert(json.name);
				});
			}
		});
	}

</script>
<input type="submit" name="username" onclick="test()"><div id="msg"></div>

</body>
</html>