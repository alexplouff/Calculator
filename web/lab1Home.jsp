<%-- 
    Document   : lab1
    Created on : Sep 4, 2015, 8:24:44 PM
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form id="rectangleForm" action="cc?lab=1" method="POST">
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
                        <td><input type="submit" id="submissionButton" name="submissionButton" value="lab1"/></td>
                        <td></td>
                    </tr>
                </table>
                
            </fieldset>
        </form>
        
    </body>
</html>
