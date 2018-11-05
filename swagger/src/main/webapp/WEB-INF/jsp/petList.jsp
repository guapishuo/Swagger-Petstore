
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
        照片：<img src="../img/${pet.petJpg}"/>
    </ul>
    <a href="/pet">返回宠物首页</a>
</body>
</html>
