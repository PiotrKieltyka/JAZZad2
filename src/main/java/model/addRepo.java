package main.java.model;

import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class addRepo {
    
    HashMap<String, addMod> addRepo;
    ServletContext context;
    
    public addRepo(HttpServletRequest request){
        this.context = request.getServletContext();
        
        if (context.getAttribute("addRepo") != null) {
            this.addRepo = (HashMap<String, addMod>) context.getAttribute("addRepo");
        }
        else {
            this.addRepo = new HashMap<String, addMod>();
        }
    }
    
    public void addAddress(String username, String addressType, addMod address){
        String addressId = username + "_" + addressType;
        this.addRepo.put(addressId, address);
        
        this.context.setAttribute("addRepo", this.addRepo);
    }
    
    public void setAddress (String username, String addressType, HttpServletRequest request) {
        String addressId = username + "_" + addressType;
        
        addMod address = this.addRepo.get(addressId);
        
        address.setVoivodeship(request.getParameter("voivodeship"));
        address.setCity(request.getParameter("city"));
        address.setPostalCode(request.getParameter("postalCode"));
        address.setStreet(request.getParameter("street"));
        address.setHouseNumber(request.getParameter("houseNumber"));
        
        this.addRepo.put(addressId, address);
        
        this.context.setAttribute("addRepo", this.addRepo);
    }
    
    public void removeAddress(HttpServletRequest request) {
        this.addRepo.remove(request.getParameter("addressId"));
        
        this.context.setAttribute("addRepo", this.addRepo);
    } 
    
    public Boolean containsAddress (String addressId) throws NullPointerException {
        return this.addRepo.containsKey(addressId);
    }
    
}
