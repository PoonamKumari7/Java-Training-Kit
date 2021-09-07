package techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LaptopPrice
 */
@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		 int price = 70000;
	
		 int quantity = Integer.parseInt(request.getParameter("laptop"));
		 pw.print("You have selected " + quantity+ " Laptop.");
		 
		 
		 int totalprice = quantity * price;
		 pw.print("\n\nTotal Price : " +totalprice);
	
		 pw.print("<a href = 'Cart'>  Go to cart</a>");
		 
		 String totprice = String.valueOf(totalprice);
	
		 Cookie cookie = new Cookie("laptopprice", totprice);
		 response.addCookie(cookie);
	
	
	
	
	}

}
