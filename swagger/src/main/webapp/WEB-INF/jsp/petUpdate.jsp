<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/pet/update" method="post" >
    <input type="text" name="petId" value="${pet.petId}" readonly>
    <input type="text" name="petName" value="${pet.petName}">
    <input type="number" name="petPrice" value="${pet.petPrice}">
    <select name="petStatus" >
        <option value="">状态</option>
        <option>可用</option>
        <option>已售出</option>
        <option>待定</option>
    </select>
    <input type="submit" value="修改">
</form>

</body>
</html>
