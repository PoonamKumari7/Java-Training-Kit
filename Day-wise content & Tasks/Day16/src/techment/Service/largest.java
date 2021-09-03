package techment.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class largest
 */
@WebServlet("/largest")
public class largest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();
		pw.print("<br>==============Largest number================<br><br>");
		
		String whichCalculation = request.getParameter("large");
		//if (whichCalculation.equalsIgnoreCase("Find Greatest")) {
			
			String n1 = request.getParameter("n1");
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(request.getParameter("n2"));
			int num3 = Integer.parseInt(request.getParameter("n3"));
			
			if(num1 > num2 && num1 > num3)
			{
				pw.print("<br>"+num1 + " is the greatest number"+"/center");
			}
			else if (num2 > num3 && num2 > num1) {
					
				pw.print(num2 + " is the greatest number");
				}
			else if (num3 > num1 && num3 > num2) {
				
				pw.print(num3 + " is the greatest number");
			}
			
			}
}
