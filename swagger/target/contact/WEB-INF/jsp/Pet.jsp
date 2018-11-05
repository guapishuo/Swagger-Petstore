<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物</title>
</head>
<script>
    $('#file').change(function(){
        $('#em').text($('#file').val());
    });
    var file = $('#file'),
        aim = $('#em');
    file.on('change', function( e ){
        //e.currentTarget.files 是一个数组，如果支持多个文件，则需要遍历
        var name = e.currentTarget.files[0].name;
        aim.text( name );
    });
</script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<body>

<form action="/pet" method="post" >
    <div class="col-xs-2">
         <input class="form-control" type="number" name="petId" placeholder="编号">
    </div>
    <div class="col-xs-2">
        <input class="form-control" type="file" id="file" name="petJpg" >
    </div>
    <div class="col-xs-2">
        <input class="form-control" type="text" name="petName" placeholder="宠物名称">
    </div>
    <div class="col-xs-2">
        <input class="form-control" type="number" name="petPrice" placeholder="价格">
    </div>
    <div class="col-xs-2">
            <select class="form-control" name="petStatus">
                <option>状态</option>
                <option>可用</option>
                <option>已售出</option>
                <option>待定</option>
            </select>
    </div>
    <input type="submit" class="btn btn-success" value="添加">
</form>

<form action="/pet/selectByPrimaryKey" method="get">
    <div class="col-xs-2">
        <input class="form-control"  type="number" name="petId" placeholder="请输入编号">
    </div>
    <input  class="btn btn-success" type="submit" value="查询">
</form>

<table class="table table-striped">

    <tr>
        <th>编号</th>
        <th>宠物名称</th>
        <th>宠物照片</th>
        <th>价格</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${pets}" var="pet">

    <tr>
        <td>${pet.petId}</td>
        <td><a href="/pet/selectByPrimaryKey?petId=${pet.petId}">${pet.petName}</a></td>
        <c:if test="${pet.petJpg !=null}">
            <td><img height="50" width="70" src= "../img/${pet.petJpg}"></td>
        </c:if>
        <c:if test="${pet.petJpg ==null}">
            <td><p style="color: red">图片未上传</p></td>
        </c:if>
        <td>${pet.petPrice}</td>
        <td>${pet.petStatus}</td>
        <td><a class="btn btn-danger" href="/pet/del/${pet.petId}">删除</a></td>
    </tr>

    </c:forEach>

</table>
</body>
</html>
