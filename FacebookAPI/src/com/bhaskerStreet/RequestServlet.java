package com.bhaskerStreet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.PageData;

import com.sun.security.ntlm.Client;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		out.write("request servlet has been called");
	
		String facebook_urlAuthorize_base=getServletConfig().getInitParameter("facebook_urlAuthorize_base");
		String facebook_urlGetToken_base=getServletConfig().getInitParameter("facebook_urlGetToken_base");
		String facebook_AppID=getServletConfig().getInitParameter("facebook_AppID");
		String facebook_AppSecret=getServletConfig().getInitParameter("facebook_AppSecret");
		
		//if(Page)
		String url=facebook_urlAuthorize_base+"?client_id="+facebook_AppID+"&redirect_uri=http://localhost/FacebookAPI/welcome.jsp"+"&scope=user_about_me";

		//HttpSession hs=request.getSession();

		
		
		response.sendRedirect(url);
		
		
		
		
		
		
		
		
		
	}

}
