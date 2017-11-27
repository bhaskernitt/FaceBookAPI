package com.bhaskerStreet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetToken
 */
@WebServlet("/GetToken")
public class GetToken extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetToken() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs=request.getSession();
		
		
		String facebook_urlGetToken_base=getServletConfig().getInitParameter("facebook_urlGetToken_base");
		String facebook_AppID=getServletConfig().getInitParameter("facebook_AppID");
		String facebook_AppSecret=getServletConfig().getInitParameter("facebook_AppSecret");
		
		String url=facebook_urlGetToken_base+ "?client_id=" + facebook_AppID+ "&client_secret=" + facebook_AppSecret
		+ "&redirect_uri=" + "http://localhost/FacebookAPI/welcome.jsp"+
		 "&code=" + hs.getAttribute("code");

		String access=com.api.client.GetToken.getToken(url);
		
		Writer er=response.getWriter();
		er.write(access);
		
		hs.setAttribute("access_token", access);
		
		//return;
		response.sendRedirect("http://localhost/FacebookAPI/getDetails.jsp");
		}
	
	

}
