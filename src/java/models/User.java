package models;

import java.io.Serializable;

/**
 *
 * @author 792268
 */
public class User implements Serializable {
    
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String roleName;
    
    public User() {
        
    }
    
    public User(String email, String firstName, String lastName, String password, String roleName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.roleName = roleName;
    }
    
    public String getEmail() {
        return email;
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
    
    public String getRoleName() {
        return roleName;
    }
    
    public void setEmail(String email) {
        this.email = email;
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
    
    public void setRoleName(String role) {
        this.roleName = roleName;
    }
}