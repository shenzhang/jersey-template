package com.shenzhang.github.resource;

import com.shenzhang.github.annotation.PoweredBy;
import com.shenzhang.github.model.User;
import com.shenzhang.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * User: Zhang Shen
 * Date: 4/18/15
 * Time: 5:17 PM
 */
@Path("/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @Path("{id}")
    @GET
    @Produces("application/json")
    @PoweredBy
    public User getUser(@PathParam("id") long id) {
        User user = userService.randomUser();
        user.setId(id);
        return user;
    }

    @GET
    @Produces("application/json")
    public List<User> getAllUsers() {
        System.out.println(this);
        System.out.println(userService);

        return userService.listAllUsers();
    }
}
