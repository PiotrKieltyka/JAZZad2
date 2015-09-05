package main.java.servlets;


import main.java.model.*;
import java.util.HashMap;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class TestShowcase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestShowcase() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {                
        response.getWriter().println("Hello!");
            
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();
        
        credRepo credentials = new credRepo(request);
        System.out.println("Object 'credentials' reference in TestShowcase class is " + Integer.toHexString(System.identityHashCode(credentials)));
            
            //System.out.println("Servlet is called " + getServletName());
            //System.out.println("Username: " + session.getAttribute("username"));
            //System.out.println("Email: " + session.getAttribute("email"));
            //System.out.println("User role: " + session.getAttribute("role"));  
            
        HashMap<String, userMod> userRepo = (HashMap<String, userMod>) context.getAttribute("userRepo");
        userMod user = userRepo.get(session.getAttribute("username"));
            
        response.getWriter().println("User from list is called " + user.getUsername());
        response.getWriter().println("User from POST is called " + request.getParameter("username"));
        response.getWriter().println("User from session is called " + session.getAttribute("username"));
        response.getWriter().println("User role is " + session.getAttribute("role"));
        response.getWriter().println("User is Premium? " + session.getAttribute("premium"));
        response.getWriter().println("Number of users is " + userRepo.size());
                       
        HashMap<String, String> credRepo = (HashMap<String, String>) context.getAttribute("credRepo");
        
        response.getWriter().println("Size of credRepo is " + credRepo.size());
                
        response.getWriter().println(credentials.checkIfUserExists((String) session.getAttribute("username")));
        response.getWriter().println(credRepo.containsKey(session.getAttribute("username")));
        
               
        if (credRepo.containsKey(session.getAttribute("username"))) {
            response.getWriter().println("if equals true");
        }
        else {
            response.getWriter().println("if equals false");
        }
               
        HashMap<String, addMod> addRepo = (HashMap<String, addMod>) context.getAttribute("addRepo");
        addMod registered_address = addRepo.get(session.getAttribute("username") + "_registered");
        
        response.getWriter().println(registered_address.getCity());        
        response.getWriter().println(addRepo.keySet());
        
        }
        
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	               
		
	}
}
