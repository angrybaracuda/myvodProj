/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myvodws;

import com.beans.myvodws.VideoData;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author kunsi
 */
@Path("/videos")
public class VideoService {

    @GET
    @Path("{id}")
    public VideoData getUserById(@PathParam("id") String id) {

        // return Response.status(200).entity("getUserById is called, id : " + id).build();
        return null;

    }
}
