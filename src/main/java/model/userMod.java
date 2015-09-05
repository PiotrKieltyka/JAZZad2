package main.java.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class userMod {

    String username;
    String email;
    String role;
    Boolean premium;

    public userMod(String username, String email, String role) {
	this.username = username;
	this.email = email;
	this.role = role;
        this.premium = false;
    }
	
    public String getUsername() {
	return username;
    }
	
    public void setUsername(String username) {
	this.username = username;
    }
	
    public String getEmail() {
	return email;
    }
    
    public Boolean getPremium() {
	return premium;
    }
	
    public void setEmail(String email) {
	this.email = email;
    }			
	
    public String getRole() {
	return role;
    }
	
    public void setRole(String role) {
	this.role = role;
    }
    
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }
    
    public void addUserToSession(HttpServletRequest request){
        HttpSession session = request.getSession();
            
        session.setAttribute("username", this.username);
        session.setAttribute("email", this.email);
        session.setAttribute("role", this.role);
        session.setAttribute("premium", this.premium);
    }    
	
}
