<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hhhhh</title>
</head>
<body>
<h1>hiiiii home page</h1>

<%
String s = (String) request.getAttribute("name");
List<Integer> al = (List<Integer>) request.getAttribute("num");
%>

<%= (s != null) ? s : "No name found" %>

<% 
if (al != null) {
    for(Integer l : al){
        out.print(l + "<br>"); // Adding line breaks for better readability
    }
} else {
    out.print("List is null");
}
%>

</body>
</html>
