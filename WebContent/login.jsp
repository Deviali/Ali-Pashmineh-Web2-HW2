
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
</head>
<body>
	
<!-- 	<header> -->
<!--      	<nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato"> -->
<!--         	<div> -->
<!--              	<a href="" class="navbar-brand"> Cabinat App </a> -->
<!--             </div> -->

<!--          </nav> -->
<!--      </header> -->
     <br>
     <div class="container col-md-5">
        <div class="card">
           <div class="card-body">
                        
                <form action="login" method="post">
					<caption>
                      <h2>Login  </h2>
                    </caption>
                   <fieldset class="form-group">
                       <label> Email</label> <input type="email" placeholder="Email" class="form-control" name="email" required="required">
                   </fieldset>

                   <fieldset class="form-group">
                       <label> Password</label> <input type="password" placeholder="Password"  class="form-control" name="password" required="required">
                   </fieldset>
                   
                  
                <button type="submit" class="btn btn-success">Login</button>
             </form>
             <br/><br/>
             <p>Don`t have any account <a href="<%=request.getContextPath()%>/registration.jsp" style="color:dodgerblue">Click Here</a>.</p>
          </div>
        </div>
     </div>
        	

</body>
</html>