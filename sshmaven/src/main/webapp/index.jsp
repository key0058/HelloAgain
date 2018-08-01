<%--
  Created by IntelliJ IDEA.
  User: ChEN
  Date: 2018/7/30
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello Java Again</title>
  </head>
  <body>
    <h5>Login User</h5>
    <form action="login" method="post">
      Username:<input type="text" name="username" />
      Password:<input type="password" name="password" />
      <button type="submit">Sure</button>
    </form>
    <hr>
    <h5>Check User</h5>
    <form action="check" method="post">
      Username:<input type="text" name="username" />
      Password:<input type="password" name="password" />
      <button type="submit">Check</button>
    </form>
  </body>
</html>
