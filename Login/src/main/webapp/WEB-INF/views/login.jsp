<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href=${pageContext.request.contextPath}>
        <title>Test</title>
    </head>
    <body>
    <h1>JOIN</h1>
        <form action="insert_action">
            <input type="text" placeholder="name">
            <input type="password"placeholder="phone"/>
            <input type="text"placeholder="address"/>
            <input type="submit" value="입력 완료"/>
        </form>
    </body>
</html>