<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/9/6
  Time: 下午1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <meta charset="utf-8">
    <title>无线点餐后台管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css" />
</head>
<body>
<div class="main">
    <div class="mainin">
        <h1>无线点餐后台管理</h1>
        <form action="/login" method="post">
            <div class="mainin1">
                <ul>
                    <li><span>用户名：</span><input name="username" type="text" id="loginName" placeholder="登录名" class="SearchKeyword"></li>
                    <li><span>密码：</span><input type="password" name="password" id="Possword" placeholder="密码" class="SearchKeyword2"></li>
                    <li><button class="tijiao" type="submit" >登录</button></li>
                </ul>
            </div>
        </form>
        <%--<div class="footpage"><span style="" font-family:arial;""="">Copyright ?</span>2016 <a href="http://www.mycodes.net/" target="_blank">源码之家</a> － 网聚卡车人的力量</div>--%>
    </div>
</div>
<img src="${pageContext.request.contextPath }/images/loading.gif" id="loading" style=" display:none;position:absolute;" />
<div id="POPLoading" class="cssPOPLoading">
    <div style=" height:110px; border-bottom:1px solid #9a9a9a">
        <div class="showMessge"></div>
    </div>
    <div style=" line-height:40px; font-size:14px; letter-spacing:1px;">
        <a onclick="puc()">确定</a>
    </div>
</div>
<%--<div style="text-align:center;">--%>
    <%--<p>更多源码：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>--%>
<%--</div>--%>
</body>
</html>
