package com.Cookies;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class AnotherServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String name= req.getParameter("name");
			String city = req.getParameter("city");
			req.setAttribute("name", name);
			//req.setAttribute("City", city);
			Cookie c [] = req.getCookies();
			for(int i=0;i<c.length;i++)
			{
			   out.println(c[i].getName());
			   out.println(":"+c[i].getValue());
			}
			Cookie c1 = new Cookie("name",name); 
			res.addCookie(c1);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("\next");
			rd.forward(req, res);
			
		}
		catch(Exception e)
		{
			
		}
	}
	

}
