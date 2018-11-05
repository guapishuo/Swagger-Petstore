<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 瓜皮
  Date: 2018/11/4
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
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
        </ul>


</body>
</html>
