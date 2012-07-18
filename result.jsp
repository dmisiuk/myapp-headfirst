<%@ page import="java.util.*" %> 

<html>
<head>
	<title> Result page</title>
	<link rel='stylesheet' href='style/default.css' type='text/css'/>
</head>
<body>
	<h2> And We recommened you: </h2>

<%
List<String> brands = (List<String>) request.getAttribute("brands");
if (brands != null){
	Iterator it = brands.iterator();
	while(it.hasNext()){
	   	out.print("<span class=\"brand\"> try " + it.next() + " </span><br>");
	}
}
%>

</body>
</html>