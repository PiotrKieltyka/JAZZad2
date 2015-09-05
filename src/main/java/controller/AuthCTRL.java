package main.java.controller;

import javax.servlet.ServletRequest;
import main.java.model.credRepo;

public class AuthCTRL {
    
    public AuthCTRL() {
        
    }
    
    public void storeCred(String username, String password, ServletRequest request) {
        credRepo credRepo = new credRepo(request);
        
        credRepo.addCred(username, password);
    }
    
    public boolean authUser(ServletRequest request, String username, String password) {
        credRepo credRepo = new credRepo(request);
       
        return credRepo.validUser(username, password);
    }
    
    public boolean usernameFree(ServletRequest request, String username) {
        credRepo credRepo = new credRepo(request);
        
        return credRepo.checkIfUserExists(username);
    }
    
}
