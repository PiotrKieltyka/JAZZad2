package main.java.controller;

import main.java.model.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RegCTRL {
        
    public RegCTRL(){
		
    }
	
    public void registerNewUser(HttpServletRequest request) {
        userMod user  = new userMod(request.getParameter("username"), request.getParameter("email"), request.getParameter("role"));
        userRepo repository = new userRepo(request);
        credRepo credentials = new credRepo(request);
        
        repository.addUser(user.getUsername(), user, request);
        
        user.addUserToSession(request);
        
        credentials.addCred(request.getParameter("username"), request.getParameter("password"));
    }
    
    public void registerNewAddress (HttpServletRequest request) {
        addMod address = new addMod(request.getParameter("addressType"), request.getParameter("voivodeship"), request.getParameter("city"), request.getParameter("postalCode"), request.getParameter("street"), request.getParameter("houseNumber"));
        addRepo repository = new addRepo(request);
        
        HttpSession session = request.getSession();
        
        repository.addAddress((String) session.getAttribute("username"), request.getParameter("addressType"), address);    
    }    
    
    public void changeAddress (HttpServletRequest request) {
        HttpSession session = request.getSession();
        addRepo repository = new addRepo(request);
        
        String username = (String) session.getAttribute("username");
        String addressType = request.getParameter("addressType").trim();               
        
        repository.setAddress(username, addressType, request);
    }
    
    public void deleteAddress (HttpServletRequest request) {
        addRepo repository = new addRepo(request);
        
        repository.removeAddress(request);
    }
	
}
