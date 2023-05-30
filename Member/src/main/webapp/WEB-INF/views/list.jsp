<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <<link rel="stylesheet" href=${pageContext.request.contextPath}/resources/list.css" />
        <title>Test</title>
    </head>
    <body>
        <h1>LIST</h1>
        <table>
            <thead>
                <tr>
                    <th>no</th><th>id</th><th>name</th><th>phone</th><th>gender</th><th>address</th>
                </tr>
            </thead>
            <tbody>
				${list}               
            </tbody>
        </table>
        <a href="/p3">메인으로</a>
    </body>
</html>