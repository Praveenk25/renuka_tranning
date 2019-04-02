<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel = "stylesheet"
   type = "text/css"
   href = "cssStyling/homepage.css" />
<title>Add Doctor</title>
</head>
<body>
	<div align="center">
		<form name="form" action="<%=request.getContextPath()%>/AddDoctorServlet"
			method="get">
			<table>
				<tr>
					<td><b>DOCTOR NAME</b></td>
					<%-- Taking UserName for Login --%>
					<td><input type="text" name="doctorname" required="required"/></td>
				</tr>
				<tr>
					<td><b>DOCTOR SPECIALITY</b></td>
					<td><select name="doctorspeciality">
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
				<tr>
					<td><input type="submit" value="Save Doctor"></input></td>
				</tr>
			</table>
		</form>
	</div>
</body>

</body>
</html>