package com.JSP_Project.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JSP_Project.Model.EmployeeService;

@WebServlet("/getEmployeeDetails")
public class Home_controller extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService empService = new EmployeeService();
		request.setAttribute("employeeDetails", empService.getEmployeDetailsEmployees());
		RequestDispatcher rd = request.getRequestDispatcher("EmpDetails.jsp");
		rd.forward(request, response);
	}

}
