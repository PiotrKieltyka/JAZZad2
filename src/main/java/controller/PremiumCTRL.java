package main.java.controller;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import main.java.model.userMod;

public class PremiumCTRL {
    
    public PremiumCTRL() {
        
    }
    
    public void changePremium (HttpServletRequest request) {
        ServletContext context = request.getServletContext();
        HashMap<String, userMod> userRepo = (HashMap<String, userMod>) context.getAttribute("userRepo");
        userMod user = userRepo.get(request.getParameter("username"));
        
        if (request.getParameter("premium").equals("yes")) {
            user.setPremium(true);
        }
        else {
            user.setPremium(false);
        }
        
        HttpSession session = request.getSession();
        
        if (request.getParameter("username").equals(session.getAttribute("username"))) {
            user.addUserToSession(request);
        } 
    }
    
}
