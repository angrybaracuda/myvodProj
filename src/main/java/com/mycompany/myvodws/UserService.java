/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myvodws;
import com.beans.myvodws.User;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.serviceimpl.myvodws.UserServiceImpl;
import java.net.UnknownHostException;
import javax.ws.rs.GET;
/**
 *
 * @author kunsi
 */
@Path("/users")
public class UserService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User createUserProfile(User user) throws UnknownHostException {
        UserServiceImpl servImpl = new UserServiceImpl();
        return servImpl.addNewUser(user);
       
    }
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String verifyUser(User user) throws UnknownHostException {
        UserServiceImpl servImpl = new UserServiceImpl();
     //   return servImpl.addNewUser(user).getUserName();
     return "got it";
       
    }
    
  
}

