package main.java.model;

import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

public class credRepo {
   
    HashMap<String, String> credRepo;
    ServletContext context;
    
    public credRepo(ServletRequest request) {
        this.context = request.getServletContext();
        
        if (context.getAttribute("credRepo") != null) {
            this.credRepo = (HashMap<String, String>) context.getAttribute("credRepo");
        }
        else {
            this.credRepo = new HashMap<>();
        }
    }    
    
    public void addCred(String username, String password) {
        this.credRepo.put(username, password);
        
        this.context.setAttribute("credRepo", this.credRepo);
    }    
    
    public Boolean validUser(String username, String password) {
        String validation = this.credRepo.get(username);
        
        if (validation.equals(password)) {
            return true;
        }
        else {
            return false;
        }
    }    
    
    public Boolean checkIfUserExists(String username) {
        if (this.credRepo.containsKey(username)) {
            return false;
        }
        else {
            return true;
        }
    }   
    
}
