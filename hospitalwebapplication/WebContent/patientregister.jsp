<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
     <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/tablestyling.css" />
<title>Patient Registeration</title>
</head>
<body>
	<form name="form"
		action="<%=request.getContextPath()%>/PatientRegisterationServlet"
		method="get">
		<table align="center">
				<tr>
					<td><h1>Registration Form For Patient</h1></td>
				</tr>
				<table align="center">
				<tr>
					<td align='center'>Patient Name</td>
					<td><input type='text' name='patientName' required="required"
						maxlength="30"></td>
				</tr>
				<tr>
					<td align='center'>Patient Age</td>
					<td><input type='number' name='patientAge' required="required" min="0" max="110"></td>
				</tr>
				<tr>
					<td align='center'>Patient Gender</td>
					<td><input type="radio" name="patientGender"
						required="required" value="male"> Male
						<input type="radio" name="patientGender" value="female">Female
						<input type="radio" name="patientGender" value="other">Other</td>
				</tr>
				<tr>
					<td align='center'>Patient Disease</td>
					<td><select name="disease">
							<option value="General diseases">General diseases</option>
							<option value="Blood diseases">Blood diseases</option>
							<option value="Bone diseases">Bone diseases</option>
							<option value="Cardiovascular diseases">Cardiovascular
								diseases</option>
							<option value="Ear diseases">Ear diseases</option>
							<option value="Endocrine diseases">Endocrine diseases</option>
							<option value="Eye diseases">Eye diseases</option>
							<option value="Gastrointestinal diseases">Gastrointestinal
								diseases</option>
							<option value="Liver diseases">Liver diseases</option>
							<option value="Respiratory diseases">Respiratory
								diseases</option>
							<option value="Skin diseases">Skin diseases</option>
							<option value="Cancer diseases">Cancer diseases</option>
							<option value="Infectious diseases">Infectious diseases</option>
							<option value="Metabolic diseases">Metabolic diseases</option>
					</select></td>
				</tr>
			</table>
			</table>
			<br>
			<div align="center">
				<input type="submit" value="Save"></input>
				</div>
	</form>
</body>
</html>