<%-- 
    Document   : Lab2Home
    Created on : Sep 4, 2015, 9:53:31 PM
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
        
        <form id="rectangleForm" action="cc?lab=2" method="POST">
            <fieldset style="width:35vw;"><legend>Area of a Rectangle</legend>
                
                <table>
                    <thead>Enter Width and Height</thead>
                    <tr>
                        <td>Width</td>
                        <td>Height</td>
                    </tr>
                    <tr>
                        <td><input type="text" id="base" name="base" /></td>
                        <td><input type="text" id="height" name="height" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" id="submissionButton" name="submissionButton"/></td>
                        <td></td>
                    </tr>
                </table>
                
            </fieldset>
        </form>
        
        <%
            Rectangle rectangle = (Rectangle)request.getAttribute("rectangle");
            if(rectangle != null){
                
                out.println("<p id='triangleResults' >");
                out.println(rectangle);
                out.println("</p>");
            }
            else {
                out.println();
            }
        
        %>
        
    </body>
</html>
