<%--
  Created by IntelliJ IDEA.
  User: ChEN
  Date: 2018/7/22
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Hello Java Again</title>
  </head>
  <body>
    <h1>JChEN world.</h1>

    <jsp:useBean id="people" class="com.jchen.main.Person" scope="page">
      <jsp:setProperty name="people" property="age" value="12" />
      <jsp:setProperty name="people" property="name" value="chen" />
      <jsp:getProperty name="people" property="name" />
      <hr>
      <jsp:getProperty name="people" property="age" />
    </jsp:useBean>

    <s:form action="loginAction.action">
      <s:textfield name="person.username" key="user" />
      <s:textfield name="person.password" key="pwd" />
      <s:submit key="login" />
    </s:form>

    <form action="helloAction.action" method="post">
      Username:<input type="text" name="person.username" />
      Password:<input type="password" name="person.password" />
      <button type="submit">Sure</button>
    </form>
  </body>
</html>
