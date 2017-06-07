<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
  <title>Hello World Example</title>
</head>
<body>
<h1>Hello World Example</h1>

<form action="hello">
  <a href="countyAdd.jsp"> Add County</a><br/><br/>
  <a href="countyDelete.jsp">Delete County</a><br/>
  <a href="countyUpdate.jsp">Update County</a><br/>

  <label for="name">Enter your name</label><br/>
  <input type="text" name="name"/>
  <br/>
  <br/>
  <label for="countyCode">Search and Enter your County Code?</label><br/>
  <input type="text" name="countyCode"/>
  <input type="submit" value="Submit"/>
</form>
</body>
</html>