<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person information</title>
</head>
<form action="/login" id="frmSignin">
<body>
로그인아이디: ${person.loginid}<br>
비밀번호: ${person.passcode}<br>
비밀번호확인: ${person.passcode2}<br>
실명: ${person.name}<br>
모바일번호: ${person.mobile}<br>
<input type="submit" value="확인">
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</html>