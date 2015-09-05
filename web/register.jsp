<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Register new account</title>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Arimo:light">
    <style>
	      body {
    	    font-family: 'Arimo', serif;
        	font-size: 20px;
      		}
    </style>
</head>
<body>
	<table width="500px" align="center" style="margin-top:15px">
		<tr>
		<td>

<div><h1>Register new account</h1></div>
<p>
<div style="color:#CF3212">After register you are logged in</div>
</p>

<p>	
<form action = "RegisterUser" method = "post">

	<table cellpadding="10"><tr>
		<td>Your username:</td>
			<td>
				<input type="text" name="username" required/>
			</td>
		</tr><tr>
		<td>Enter your email:</td>
		<td>
			<input type="email" name="email" required/>
		</td>
	</tr><tr>
		<td>Your password:</td>
			<td>
				<input type="password" name="password" required/>
			</td>
		</tr><tr>
		<td>Confirm your password:</td>
			<td>
				<input type="password" name="password_confirm" required/>
			</td>
		</tr><tr>

		<td>What role do you preffer?</td>
				<td>  		
     				<select name = "role">
    					<option value = "user">Standard user</option>
   					<option value = "admin">System administrator</option>          
   				</select>
   				</td>
   			</tr><tr>
			<td colspan="2">
				<input type="submit" value="Register" />
			</td>
		</tr>
	</table>
		
</form>
</p>

<p>
	<a href='index.jsp'>Back</a>
</p>

		</td>
		</tr>
	</table>
</body>
</html>