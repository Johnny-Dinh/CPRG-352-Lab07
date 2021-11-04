<%-- 
    Document   : users
    Created on : Nov 2, 2021, 11:26:27 AM
    Author     : 792268
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>

        <%-- View Users Section --%>
        <div>
            <table border="1">
                <h2>View Users</h2>
                <tr>
                    <th>Email</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Role</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>

                <tr>
                    <td>email here</td>
                    <td>first name here</td>
                    <td>last name here</td>
                    <td>role here</td>
                    <td>edit function here</td>
                    <td>delete function here</td>
                </tr>
            </table>
        </div>

        <%-- Add User Section --%>
        <form action="users" method="POST">
            <div>
                <table border="1">
                    <h2>Add User</h2>
                    <tr>
                        <th>
                            <input type="text" name="email" placeholder="Email" value="">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="firstname" placeholder="First Name">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="lastname" placeholder="Last Name">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="password" placeholder="Password">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            Roles
                            <select>
                                <option>System Admin</option>
                                <option>Regular User</option>
                                <option>Company Admin</option>
                            </select>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="submit" name="add" value="Save"> 
                        </th>
                    </tr>
                </table>
            </div>
        </form>

        <%-- Edit User Section --%>
        <form action="users" method="POST">
            <div>
                <table border="1">
                    <h2>Edit User</h2>
                    <tr>
                        <th>
                            <input type="text" name="email" placeholder="Email">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="firstname" placeholder="First Name">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="lastname" placeholder="Last Name">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="text" name="password" placeholder="Password">
                        </th>
                    </tr>
                    <tr>
                        <th>
                            Roles
                            <select>
                                <option>System Admin</option>
                                <option>Regular User</option>
                                <option>Company Admin</option>
                            </select>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="submit" name="add" value="Save"> 
                        </th>
                    </tr>
                </table>
            </div>
        </form>

    </body>
</html>
