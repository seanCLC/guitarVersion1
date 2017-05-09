<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询结果页面</title>
<style type="text/css">
table{border-collapse:collapse;}
table,tr,td{border:1px solid black;}
</style>
</head>
<body>
  <h3>查询结果：</h3>
  <table>
      <tr>
        <td>系列号</td>
        <td>种类</td>
        <td>价格</td>
        <td>制造者</td>
        <td>模型</td>
        <td>顶部材料</td>
        <td>底部材料</td>      
      </tr>
      <tr>
        <td>${requestScope.guitar.serialNumber}</td>
        <td>${requestScope.guitar.type}</td>
        <td>${requestScope.guitar.price}</td>
        <td>${requestScope.guitar.builder}</td>
        <td>${requestScope.guitar.model}</td>
        <td>${requestScope.guitar.backWood}</td>
        <td>${requestScope.guitar.topWood}</td>     
      </tr>
  </table>
  </body>
  </html>