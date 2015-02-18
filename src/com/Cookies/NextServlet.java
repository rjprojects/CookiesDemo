package com.Cookies;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
 * Servlet implementation class NextServlet
 */
public class NextServlet extends HttpServlet 
{
	   public void goPost(HttpServletRequest req,HttpServletResponse res)
	   {
		   try
		   {
				   
		    res.setContentType("text/html");
		    PrintWriter out = res.getWriter();
		    String name = req.getParameter("name");
		    Cookie allCookie[] = req.getCookies();
		    for(int i=0;i<allCookie.length;i++)
		    {
		    	out.println(allCookie[i].getName());
				out.println(":"+allCookie[i].getValue());
		    }
		    
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   
	   }
}
