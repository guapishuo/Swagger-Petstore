<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${pet.petName}</h1>
    <ul>
        <li>编号：${pet.petId}</li>
        <li>状态：${pet.petStatus}</li>
        <li>价格：${pet.petPrice}</li>

        <c:if test="${pet.petJpg !=null}">
            照片：<img height="200" width="200" src="../img/${pet.petJpg}"/>
        </c:if>
        <c:if test="${pet.petJpg == null}">
        <p>照片未上传</p>
        </c:if>
    </ul>
    <a href="/pet">返回宠物首页</a>
</body>
</html>
