<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"/>
<script src="js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<form action="login.do" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">用户名</label>
    <input type="text"  class="btn btn-primary" name="name"  placeholder="请输入用户名">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="pwd" placeholder="请输入密码">
  </div>

  <button type="submit" class="btn btn-success">提交</button>
</form>
</body>
</html>