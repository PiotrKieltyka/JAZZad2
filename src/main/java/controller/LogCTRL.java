package main.java.controller;

import main.java.model.*;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class LogCTRL {
    
    public LogCTRL () {
        
    }    
    
    public void loginUser(HttpServletRequest request) {
        ServletContext context = request.getServletContext();
        HashMap<String, userMod> userRepo = (HashMap<String, userMod>) context.getAttribute("userRepo");
        userMod user = userRepo.get(request.getParameter("username"));
        
        user.addUserToSession(request);
    }
    
}
