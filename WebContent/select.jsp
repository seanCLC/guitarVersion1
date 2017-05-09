<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Guitar查询</title>
<style type="text/css">
label{width:80px; display:inline-block; margin-bottom:10px;}
input[type="submit"],input[type="reset"]{height:35px; font-size:24px;margin-left:20px;}
</style>
</head>

<body>
<h3>Guitar查询</h3>
<form action="searchGuitar ">
<label>系列号</label><input type="text" name="serialNum" /><br/>
<label>种类</label><input type="text" name="type" /><br/>
<label>价格</label><input type="text" name="price" /><br/>
<label>制造者</label><input type="text" name="builder" /><br/>
<label>模型</label><input type="text" name="model" /><br/>
<label>顶部材质</label><input type="text" name="topWood" /><br/>
<label>背面材质</label><input type="text" name="backWood" /><br/>

<input type="submit" value="查询" />
<input type="reset" value="清空" onclick="clearUp();" />
</form>
</body>

<script type="text/javascript">
</script>
</html>