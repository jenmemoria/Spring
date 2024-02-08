<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ex01 - 두 정수의 사칙연산</h1>
<hr>

<form method="POST">
	<p>
		<input type="number" name="n1" min="0" max="100">
		<select name="operator" required>
			<option value="">== 연산자 선택 ==</option> <!-- 옵션에 빈 문자열을 넣으면 선택안한 걸로 간주한다. -->
			<option value="PLUS">+</option>
			<option value="MINUS">-</option>
			<option value="MULTI">*</option>
			<option value="DIVIDE">/</option>
		</select>
		<input type="number" name="n2" min="0" max="100">
		<input type="submit" value="=">
	</p>
</form>

</body>
</html>