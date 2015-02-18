package com.Cookies;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class Validation extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
		   res.setContentType("text/html");
		   PrintWriter out = res.getWriter();
		   
		   String user = req.getParameter("User");
		   String pass = req.getParameter("Password");
		   
		   
		   if(user.equals("Java")&&pass.equals("Java"))
		   {
			   out.println("Sucessfull Login!!!!!!!");
			   Cookie c = new Cookie("User",user);
			   res.addCookie(c);
			   
			   RequestDispatcher rd = getServletContext().getRequestDispatcher("/WelCome.html");
			   rd.forward(req, res);
		   }
		   else
		   {
			   out.println("Try Again!!!!!!!");
			   RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
			   rd.include(req,res);
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
