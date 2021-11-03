/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

/**
 *
 * @author 792268
 */
public class UserService {
    public User get(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(email);
        return user;
    }
    
    public List<User> getAll(String email) throws Exception {
        UserDB userDB = new UserDB();
        List<User> users = userDB.getAll(email);
        return users;
    }
    
    public void add(String email, String firstname, String lastname, String password, String rolename) throws Exception {
        User user = new User(email, firstname, lastname, password, rolename);
        UserDB userDB = new UserDB();
        userDB.add(user);
    }
    
    public void edit(String firstname,String lastname, String password, String rolename) throws Exception {
        User user = new User(null, firstname, lastname, password, rolename);
        UserDB userDB = new UserDB();
        userDB.edit(user);
    }
    
    public void delete(String email) throws Exception {
        User user = new User();
        user.setEmail(email);
        UserDB userDB = new UserDB();
        userDB.delete(user);
    }
}
