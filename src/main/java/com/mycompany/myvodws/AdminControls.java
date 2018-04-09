/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myvodws;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.emumerations.PlotType;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbBuilder;
import com.serviceimpl.myvodws.AdminVideoServiceImpl;
import java.io.File;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kunsi
 */
@Path("admin/")
public class AdminControls {

    private OmdbVideoFull result;

    @POST
    @Path("addvideo/getvideodata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OmdbVideoFull getvideodata(OmdbVideoFull result2) {
        if(result2.isResponse())
        {
            return null;
        }
        return new AdminVideoServiceImpl().getVideoData(result2);
    }
}
