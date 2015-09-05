package main.java.servlets;

import main.java.controller.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    RegCTRL registration = new RegCTRL();
    
    public RegisterAddress() {
        super();        
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        if (request.getParameter("action") != null && request.getParameter("action").equals("delete")) {
            registration.deleteAddress(request);
            response.sendRedirect("user_profile.jsp");
        }
        else {            
            registration.changeAddress(request);
            response.sendRedirect("user_profile.jsp");
        }
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        registration.registerNewAddress(request);
        response.sendRedirect("user_profile.jsp");
    }
    
}
