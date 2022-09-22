<%@page import="com.JSP_Project.Entity.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.JSP_Project.Model.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Employee> empDetails = (List<Employee>) request.getAttribute("employeeDetails");
%>
<table>
	<tr>
		<th>Id</th>
		<th>Employee Name </th>
		<th>Employee Address </th>
		<th>Employee Contact No </th>
		<th>Age </th>
		<th>Salary </th>
		<th>Bonus </th>
		<th>Leave </th>
	</tr>
	<% for(int i = 0; i < empDetails.size(); i++) { %>
        <tr>      
            <td><%=empDetails.get(i).getId()%></td>
            <td><%=empDetails.get(i).getEmpName()%></td>
            <td><%=empDetails.get(i).getEmpAddress()%></td>
            <td><%=empDetails.get(i).getEmpContactNo()%></td>
            <td><%=empDetails.get(i).getAge()%></td>
            <td><%=empDetails.get(i).getSalary()%></td>
            <td><%=empDetails.get(i).getBonus()%></td>
            <td><%=empDetails.get(i).getLeave()%></td>
        </tr>
    <% } %>
</table>
</body>
</html>