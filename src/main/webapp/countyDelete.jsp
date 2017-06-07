<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Delete County</title>
</head>
<body>
<form action="deleteCounty">
    Enter County Information:
    <br/>
    <br/>
    <label for="cntyCd">Enter your County Code</label><br/>
    <s:textfield name="cntyCd" label="cntyCd" />

    <input type="submit" value="Submit"/>
</form>

</body>
</html>
