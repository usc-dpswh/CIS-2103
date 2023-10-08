/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import employee.version5.*;
import employee.version4.*;
import employee.version3.*;

/**
 *
 * @author User
 */
public class Name {
    private String firstName;
    private String lastName;
    private String middleInitial;

    public Name() {
    }
    
    public Name firstName(String mainFirstName){
        this.firstName = mainFirstName;
        return this;
    }
    
    public Name lastName(String mainLastName) {
        this.lastName = mainLastName;
        return this;
    }
    
    public Name middleInitial(String mainMiddleInitial) {
        this.middleInitial = mainMiddleInitial;
        return this;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String newFirst){
        this.firstName = newFirst;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String newLast){
        this.lastName = newLast;
    }
    
    public String getMiddleInitial(){
        return middleInitial;
    }
    
    public void setMiddleInitial(String newMiddle){
        this.middleInitial = newMiddle;
    }
    
    @Override
    public String toString() {
        StringBuilder fullName = new StringBuilder();
        
        if (firstName != null) {
            fullName.append(this.firstName);
        }
        
        if (middleInitial != null) {
            fullName.append(" ").append(middleInitial).charAt(0);
        }
        
        if (lastName != null) {
            fullName.append(" ").append(this.lastName);
        }
        
        return fullName.toString();
//        return "Name{" + "firstName=" + firstName + ", lastName=" + lastName + ", middleInitial=" + middleInitial + '}';
    }

    

    
    
}
