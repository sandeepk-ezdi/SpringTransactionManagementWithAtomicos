package com.ezdi.transaction.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import com.ezdi.transaction.aggregator.EzdiAggregatorService;
import com.ezdi.transaction.beans.EmployeeX;
import com.ezdi.transaction.beans.EmployeeY;
import com.ezdi.transaction.beans.EmployeeZ;
import com.ezdi.transaction.service.EmployeeXService;

@Component("hello")
public class AppServlet implements HttpRequestHandler {

	@Autowired
	EzdiAggregatorService aggragatorService; 
	
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
			aggragatorService.saveAllEmployees();
			response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Transaction!</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>ezDI-Distributed Transaction Example </h1>");
		        out.println("<h2>Congratulations!!!!!!!All employees are inserted Sucessfully!</h2>");
		        out.println("</body>");
		        out.println("</html>");
		} catch (Exception e) {
			response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Transaction!</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>ezDI-Distributed Transaction Example </h1>");
		        out.println("<h2>Oops!!!Transaction Rollback! Look like something went wrong</h2>");
		        out.println("</body>");
		        out.println("</html>");
			e.printStackTrace();
		}
		
	}

}
