package main.java.model;

import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class userRepo {

    HashMap<String, userMod> userRepo;
    ServletContext context;
	
    public userRepo(HttpServletRequest request){
        this.context = request.getServletContext();
        
        if (context.getAttribute("userRepo") != null) {
            this.userRepo = (HashMap<String, userMod>) context.getAttribute("userRepo");
        }
        else {
            this.userRepo = new HashMap<String, userMod>();
        }
    }
	
    public void addUser(String username, userMod user, HttpServletRequest request){
        this.userRepo.put(username, user);
                
        this.context.setAttribute("userRepo", this.userRepo);
    }		

    public HashMap<String, userMod> getUserRepository() {
	return userRepo;
    }

    public void setUserRepository(HashMap<String, userMod> userRepo) {
	this.userRepo = userRepo;
    }	
	
}
