<%-- 
    Document   : triangleArea
    Created on : Sep 4, 2015, 9:17:32 PM
    Author     : alex
--%>

<%@page import="model.Rectangle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            Rectangle rectangle = (Rectangle)request.getAttribute("rectangle");
            if(rectangle != null){
                
                out.println("<div id='pageContainer'> ");
                out.println("<p id='triangleResults' >");
                out.println(rectangle);
                out.println("</p>");
                out.println("</div>"); //pageContainer div
                
                
            }
        
        %>
        
        
        
        
    </body>
</html>
