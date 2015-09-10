<%-- 
    Document   : lab3Home
    Created on : Sep 6, 2015, 5:23:00 PM
    Author     : alex
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ShapeStrategy"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 3</h1>

        <!--
            You really don't need to make any form id because you can tell based 
            on the id of the submission button from each form or by testing for
            1 of each forms input elements.
        
            Best way to do this?
                + action="..?form =1" ,2 ...
                + pass an object selection down from the view
                + above
        
        
            HTML Ternary If ..PHP?
            No static variables?
        -->
 

        <div id="rectangleContainer" class="row">

            <form class="col-md-4 col-md-offset-1" id="rectForm" name="rectForm" method="POST" action="trcCalc?shape=rectangle">
                <table id="rectTable" clase="table">

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
                            <td><button id="rectSubmit" name="rectSubmit" type="submit" class="btn btn-default" >Submit</button></td>
                            <td><span id="rectResult" name="rectResult">

                                    <c:out value="${rectangle}" />
                                </span></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
                                <br>
        <div id="triangleContainer" class="row">
            <form class="col-md-4 col-md-offset-1" id="triangleForm" name="triangleForm" method="POST" action="trcCalc?shape=triangle">

                <table id="triangleTable" >
                    <thead>Enter Width and Height for the area of a Triangle</thead>
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
                            <td><button id="triangleSubmit" name="triangleSubmit" type="submit"  class="btn btn-primary">Submit</button></td>
                            <td><span id="triangleResult" name="triangleResult"  >

                                    <c:out value="${triangle}" />
                                </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
                                <br>
        <div id="circleContainer" >
            <form class="col-md-4 col-md-offset-1" id="circleForm" name="circleForm" method="POST" action="trcCalc?shape=circle">

                <table id="circleTable" >
                    <thead>Enter Width and Height for the area of a Circle</thead>
                    <tbody>
                        <tr>
                            <td>Enter Radius</td>
                            <td><input id="radius" name="radius" type="text" placeholder="0-9.." /></td>
                        </tr>
                        <tr>
                            <td><button id="circleSubmit" name="circleSubmit" type="submit" class="btn btn-danger">Submit</button></td>
                            <td><span id="circleResult" name="circleResult">

                                    <c:out value="${circle}" />
                                </span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </body>
</html>
