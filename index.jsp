<%@page language="java" contentType="text/html;charset=UTF-8" %>
<%@page import="java.util.*,code.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>24点游戏</title>
</head>
<body>
<form action="index.jsp" method="post">
  <h1>输入四个数字，计算出结果等于24的表达式：</h1>
  <div align="center">
    <p>数字A</p>
    <input type="text" name="A">
    <p>数字B</p>
    <input type="text" name="B">
    <p>数字C</p>
    <input type="text" name="C">
    <p>数字D</p>
    <input type="text" name="D">
    <p></p>
    <input type="submit" value="计算">
  </div>
</form>

  <%
    try{
        String a,b,c,d;
        a=(request.getParameter("A"));
        b=(request.getParameter("B"));
        c=(request.getParameter("C"));
        d=(request.getParameter("D"));
        //double []t={Double.parseDouble(a),Double.parseDouble(b),Double.parseDouble(c),Double.parseDouble(d)};
        //out.println(Game.solve24(t));
      }catch(Exception e){
        out.println("Something Wrong!!!");
      }
  %>
</body>
</html>