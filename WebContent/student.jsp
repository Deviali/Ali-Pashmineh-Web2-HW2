<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
</head>
<body>
	<header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        	<form action ="student" method="post"><button type="submit" class="btn btn-danger" name="list">Course List</button></form>
                                    
                    </div>

                    
                </nav>
    </header>
	<div class="container col-md-5">
        <div class="card">
           <div class="card-body">
                        
                <form action="student" method="post">
					<caption>
                      <h2>Registration  </h2>
                    </caption>
                   <fieldset class="form-group">
                       <label> First Name</label> <input type="text" placeholder="First Name" class="form-control" name="fname" required="required">
                   </fieldset>

                   <fieldset class="form-group">
                       <label> Last Name</label> <input type="text" placeholder="Last Name"  class="form-control" name="lname" required="required">
                   </fieldset>
                   
                   <fieldset class="form-group">
                       <label> City</label> <input type="text" placeholder="City"  class="form-control" name="city" required="required">
                   </fieldset>
                   
                   <fieldset class="form-group">
                       <label> Age</label> <input type="text" placeholder="Age"  class="form-control" name="age" required="required">
                   </fieldset>
                   
                   <fieldset class="form-group">
                       <label> Country</label> 
                   		<select name="country" class="form-control">
						    <option value="">Select Country</option>
						    <option value="russia">Russia</option>
						    <option value="azerbaijan">Azerbaijan</option>
						    <option value="iran">Iran</option>
						</select>
                   </fieldset>
                   
                   <fieldset class="form-group">
                       <label> Gender:  </label> <br/>
                  		<input type="radio" name="gender" value="Male">Male
        	     		<input type="radio" name="gender"  value="Female">Female
    				</fieldset>
                   
                  
                <button type="submit" class="btn btn-success" name="save">Save</button>
             </form>
          </div>
        </div>
     </div>
	

</body>
</html>