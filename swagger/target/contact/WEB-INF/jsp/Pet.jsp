<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 瓜皮
  Date: 2018/11/4
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物</title>
</head>
<body>
<form action="/" method="post" >
    <input type="text" name="petId" placeholder="编号">
    <input type="text" name="petName" placeholder="宠物名称">
    <input type="number" name="petPrice" placeholder="价格">
    <select name="petStatus">
        <option>状态</option>
        <option>可用</option>
        <option>已售出</option>
        <option>待定</option>
    </select>
    <input type="submit" value="添加">
</form>
<form action="/selectPetId" method="get">
    <input type="number" name="petId" placeholder="请输入编号">
    <input type="submit">
</form>

<table>

    <tr>
        <th>编号</th>
        <th>宠物名称</th>
        <th>价格</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${pets}" var="pet">
    <tr>
        <td>${pet.petId}</td>
        <td><a href="//selectByPrimaryKey?petId=${pet.petId}">${pet.petName}</a></td>
        <td>${pet.petPrice}</td>
        <td>${pet.petStatus}</td>
        <td><a href="/del/${pet.petId}">删除</a></td>

    </tr>
    </c:forEach>

</table>
</body>
</html>
