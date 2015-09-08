<%-- 
    Document   : lab3Home
    Created on : Sep 6, 2015, 5:23:00 PM
    Author     : alex
--%>

<%@page import="model.ShapeStrategy"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 3</h1>

        <!--
        
            You really don't need to make any form because you can tell based 
            on the id of the submission button from each form or by testing for
            1 of each forms input elements.
        
            Best way to do this?
                + action="..?form =1" ,2 ...
                + pass an object selection down from the view
                + above
        
        
            HTML Ternary If ..PHP?
            No static variables?
        -->
        
        <% ShapeStrategy shape = (ShapeStrategy)request.getAttribute("shape");
                String nullReplacementValue = "0";
                String shapeClass = null;
                if(shape != null){
                    shapeClass = String.valueOf(shape.getClass()).substring(12);
                }
        %>
        
        <div id="rectangleContainer" >
            <form id="rectForm" name="rectForm" method="POST" action="trcCalc?shape=rectangle">

                <table id="rectTable">
                    <thead>Enter Width and Height for the area of a Rectangle</thead>
                    <tbody>
                        <tr>
                            <td>Enter Height</td>
                            <td><input id="height" name="rectHeight" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td>Enter Width</td>
                            <td><input id="width" name="rectWidth" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td><button id="rectSubmit" name="rectSubmit" type="submit"  /></td>
                            <td><span id="rectResult" name="rectResult">

                                    <%= (shapeClass != null && shapeClass.equals("Rectangle")) ?  shape : nullReplacementValue%>

                                </span></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>

        <div id="triangleContainer" >
            <form id="triangleForm" name="triangleForm" method="POST" action="trcCalc?shape=triangle">

                <table id="triangleTable">
                    <thead>Enter Width and Height for the area of a Rectangle</thead>
                    <tbody>
                        <tr>
                            <td>Enter Base</td>
                            <td><input id="triangleBase" name="triangleBase" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td>Enter Width</td>
                            <td><input id="triangleHeight" name="trianlgeHeight" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td><button id="triangleSubmit" name="triangleSubmit" type="submit"  /></td>
                            <td><span id="triangleResult" name="triangleResult"  >

                                        <%= (shapeClass != null && shapeClass.equals("Triangle")) ?  shape : nullReplacementValue%>
                                        
                                </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>

        <div id="circleContainer" >
            <form id="circleForm" name="circleForm" method="POST" action="trcCalc?shape=circle">

                <table id="circleTable">
                    <thead>Enter Width and Height for the area of a Rectangle</thead>
                    <tbody>
                        <tr>
                            <td>Enter Radius</td>
                            <td><input id="radius" name="radius" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td><button id="circleSubmit" name="circleSubmit" type="submit" /></td>
                            <td><span id="circleResult" name="circleResult">

                                    <%= (shapeClass != null && shapeClass.equals("Circle")) ?  shape : nullReplacementValue%>
                                    
                                </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
