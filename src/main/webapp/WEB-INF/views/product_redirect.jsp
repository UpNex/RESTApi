<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Product Details</title>
</head>
<body>
<h1>
	Product Info 
</h1>

<P> <!-- <a href="intent:#Intent;action=com.hp.linkreadersdksample.test;package=com.hp.linkreadersdksample;">Get Details</a></P>-->
<!-- <a href="myapp://path">Get details</a> -->

<a href="intent://com.hp.linkreadersdksample/#Intent;scheme=launch;package=com.hp.linkreadersdksample;S.content=WebContent;end">Open Application</a>
</body>
</html>
