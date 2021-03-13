<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       
     <html>

        <head>
            <title>Courses </title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        	<form action ="student" method="post"><button type="submit" class="btn btn-danger" name="student">Student</button></form>
                                    
                    </div>

                    
                </nav>
   		 </header>
            <br>
           <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Courses</h3>
                    
                    
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Course Name</th>
                                <th>Assign</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="course" items="${listCourse}">

                                <tr>
                                    <td>
                                        <c:out value="${course.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${course.name}" />
                                    </td>
                                    <td>
                                    	<form action ="student" method="post"><input type="hidden" name="courseName" value="${course.name}" /><button type="submit" class="btn btn-danger" name="assign">Assign</button></form>
                                    </td>
                                    
                                 </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
  </body>

</html>
