package models;

import java.io.Serializable;

/**
 *
 * @author 792268
 */
public class User implements Serializable {
    
    private String email;
    private int active;
    private String firstName;
    private String lastName;
    private String password;
    private int role;
    
    public User() {
        
    }
    
    public User(String email, int active, String firstName, String lastName, String password, int role) {
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getActive() {
        return active;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getRole() {
        return role;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setActive(int active) {
        this.active = active;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRole(int role) {
        this.role = role;
    }
}