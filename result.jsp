<%@ page import="java.util.*" %> 
<jsp:directive.page contentType="text/html; charset=UTF-8" />
<%@ page import="org.apache.log4j.Logger" %>

<html>
<head>
	<title> Result page</title>
	<link rel='stylesheet' href='style/default.css' type='text/css'/>
</head>
<body>
	<h2> And We recommended for you: </h2>

<%
Logger logger = Logger.getLogger("result.jsp");
if(session.isNew()){
	logger.info("Create new session");
	out.println("<p> Welcome</p>");
} else{
	out.println("<p> Welcome Back </p>");
}
List<String> brands = (List<String>) request.getAttribute("brands");
if (brands.size() != 0){
	Iterator it = brands.iterator();
	while(it.hasNext()){
	   	out.print("<span class=\"brand\"> try " + it.next() + " </span><br>\n");
	}
} else{
	out.print("<span class=\"brand\"> Nothing </span><br>\n");
}

out.print("<br> Your browser is " + request.getHeader("User-Agent"));
%>

<br>
<a href="<%=response.encodeURL("index.html") %>" >selectbeer</a>

</body>
</html>