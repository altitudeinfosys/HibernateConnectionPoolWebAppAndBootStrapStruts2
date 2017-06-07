<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>County Insert</title>
</head>
<body>
<form action="addCounty">
Enter County Information:
<br/>
<br/>
    <label for="cntyCd">Enter your County Code</label><br/>
    <s:textfield name="cntyCd" label="cntyCd" />

<br/>
<br/>
    <label for="cnty">Enter your County name</label><br/>
    <s:textfield name="cnty" label="cnty" />


<br/>
<br/>
<input type="submit" value="Submit"/>
</form>
</body>
</html>