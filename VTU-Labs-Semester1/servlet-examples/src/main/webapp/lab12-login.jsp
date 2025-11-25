<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		create below table 
		create table login(userid int, password varchar(20));
		enter below details in the table
		
		mysql> insert into login values(1234, "admin@123");
		Query OK, 1 row affected (0.00 sec)
		
		mysql> insert into login values(4567, "welcome@123");
		Query OK, 1 row affected (0.00 sec)
		
		mysql> commit;
		Query OK, 0 rows affected (0.00 sec)
	 -->
	 <h2>Login Form</h2>
	 <form action = "lab12-validate.jsp">
	 	<label>Enter userid</label>
	 	<input type = "number" name = "userid"> <br />
	 	<label>Enter password</label>
		<input type = "password" name = "pass"> <br />
		<input type = "submit" value = "Login" />
	 </form>
</body>
</html>