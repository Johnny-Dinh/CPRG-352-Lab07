package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

/**
 *
 * @author 792268
 */
public class RoleService {
    public List<Role> getAll(String user) throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll(user);
        return roles;
    }
}
