package main.java.servlets;

import main.java.controller.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    AuthCTRL authentication = new AuthCTRL();
    RegCTRL registration = new RegCTRL();
    
    public RegisterUser() {
        super();        
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        if (authentication.usernameFree(request, request.getParameter("username"))) {
            registration.registerNewUser(request);
            response.sendRedirect("main_menu.jsp");
        }
        else {            
            response.sendRedirect("register.jsp");
        }        		
    }
    
}
