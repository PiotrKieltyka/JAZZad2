package main.java.servlets;

import main.java.controller.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    AuthCTRL authentication = new AuthCTRL();
    LogCTRL login = new LogCTRL();
    
    public LoginUser() {
        super();        
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        try {
        
            if (request.getParameter("username") != "" && authentication.authUser(request, request.getParameter("username"), request.getParameter("password"))) {
                login.loginUser(request);
                response.sendRedirect("main_menu.jsp");	
            }
            else {            
                response.sendRedirect("login.jsp");
            }
        }
        catch (NullPointerException exception) {
            exception.printStackTrace();
            response.sendRedirect("login.jsp");
        }
    }
    
}
