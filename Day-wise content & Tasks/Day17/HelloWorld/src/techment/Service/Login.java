package techment.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Hello Servlet called");
		
		PrintWriter out = response.getWriter();
		out.print("hello this is my first servlet");
		
		String name = request.getParameter("u");
		String pass = request.getParameter("p");
		
		int nameLength = name.length();
		
		System.out.println("your name is " +name +" size of name is "+nameLength);
		out.print("your name is " +name + "size of the name is "+ nameLength);
		
		
	}

}
