<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href=${pageContext.request.contextPath}/resources/join.css" />
        <title>Test</title>
    </head>
    <body>
    <h1>JOIN</h1>
        <form action="insert_action">
        	<input type="text" placeholder="ID" name="id" />
            <input type="password" placeholder="패스워드" name="pwd" />
            <input type="password"placeholder="패스워드 확인" name="pwd2" />
            <input type="radio"placeholder="sex" name="male" />남</label>
            <input type="radio"placeholder="sex" name="femal" />여</label>
            <input type="text"placeholder="이름" name="name" />
            <input type="text"placeholder="연락처" name="phone" />
            <input type="text"placeholder="주소" name="address" />
            <input type="submit" value="입력 완료"/>
        </form>
    </body>
</html>