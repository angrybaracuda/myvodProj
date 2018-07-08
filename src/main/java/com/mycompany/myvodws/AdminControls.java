/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myvodws;

import com.beans.myvodws.VideoData;
import com.beans.myvodws.VideoMetadata;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.emumerations.PlotType;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbBuilder;
import com.serviceimpl.myvodws.AdminVideoServiceImpl;
import java.io.File;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.beans.myvodws.VideoMetadata;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author kunsi
 */
@Path("admin/")
public class AdminControls {

    private OmdbVideoFull pv;

    //private static VideoData result = new VideoData();
    @POST
    @Path("addvideo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public VideoData addNewVideo() {
        return null;
    }

    @POST
    @Path("addvideo/getvideodata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OmdbVideoFull getvideodata(OmdbVideoFull result2) {
        if (result2.isResponse()) {
            return null;
        }
        // this.result.setVideoData(result2);

        return new AdminVideoServiceImpl().getVideoData(result2);
    }

    @POST
    @Path("addvideo/manuallyEnterVideoData")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public OmdbVideoFull manuallyEnterVideoData(String req) {
        OmdbVideoFull vd = new OmdbVideoFull();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
       //  objectMapper.configure(DeserializationConfigFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        try {
            vd = objectMapper.readValue(req, OmdbVideoFull.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("#####################################################\n" + vd.toString());
        // return new AdminVideoServiceImpl().saveVideoData(vd);
        return null;
    }

    @POST
    @Path("addvideo/complete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addNewVideoComplete(String videoData) throws UnknownHostException, JsonProcessingException {
        System.out.println(videoData);
        VideoData vd = new VideoData();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            vd = objectMapper.readValue(videoData, VideoData.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("#####################################################\n" + vd.getOmdbVideoFull().toString() + "#########################################################################\n" + vd.getVideoMetadata().toString());
        return new AdminVideoServiceImpl().saveVideoData(vd);
    }

    @POST
    @Path("addvideo/omdb")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OmdbVideoFull omdb(OmdbVideoFull videoData) {
        pv = videoData;
        return pv;
    }

    @POST
    @Path("addvideo/metadata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public VideoMetadata metadata(VideoMetadata videoData) {

        return videoData;
    }

    @GET
    @Path("addvideo/getallvideos")
    @Produces(MediaType.APPLICATION_JSON)
    public VideoData getallvideosdata(int count) {
        return null;
    }
}
