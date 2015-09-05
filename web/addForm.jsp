<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Register new address</title>
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

<div><h1>Register new address</h1></div>
<p>
<div style="color:#CF3212">Don't leave any field empty</div>
</p>

<p>	
<form action = "RegisterAddress" method = "post">

	<table cellpadding="10"><tr>
		<td>What's your address type?</td>
                                <td>  		
                                <select name = "addressType">
    					<option value = "registered">Registered address</option>
   					<option value = "mailing">Mailing address</option>
                                        <option value = "work">Work address</option>  
   				</select>
   				</td>
		</tr><tr>
                <td>Where's this address?</td>
                                <td>  		
                                <select name = "voivodeship">
    					<option value = "Lower Silesian">Lower Silesian</option>
   					<option value = "Kuyavian-Pomeranian">Kuyavian-Pomeranian</option>
                                        <option value = "Lublin">Lublin</option>
                                        <option value = "Lubusz">Lubusz</option> 
                                        <option value = "Łódź">Łódź</option> 
                                        <option value = "Lesser Poland">Lesser Poland</option> 
                                        <option value = "Mazovian">Mazovian</option> 
                                        <option value = "Opole">Opole</option> 
                                        <option value = "Subcarpathian">Subcarpathian</option> 
                                        <option value = "Podlaskie">Podlaskie</option> 
                                        <option value = "Pomeranian">Pomeranian</option> 
                                        <option value = "Silesian">Silesian</option> 
                                        <option value = "Świętokrzyskie">Świętokrzyskie</option> 
                                        <option value = "Warmian-Masurian">Warmian-Masurian</option> 
                                        <option value = "Greater Poland">Greater Poland</option> 
                                        <option value = "West Pomeranian">West Pomeranian</option> 
   				</select>
   				</td>
		</tr><tr>    
		<td>City:</td>
                                <td>
                                        <input type="text" name="city" required/>
                                </td>
		</tr><tr>
		<td>Postal code:</td>
			<td>
				<input type="text" name="postalCode" required/>
			</td>
		</tr><tr>
		<td>Street:</td>
			<td>
				<input type="text" name="street" required/>
			</td>
                </tr><tr>
		<td>House number:</td>
			<td>
				<input type="text" name="houseNumber" required/>
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
	<a href='user_profile.jsp'>Back</a>
</p>

		</td>
		</tr>
	</table>
</body>
</html>