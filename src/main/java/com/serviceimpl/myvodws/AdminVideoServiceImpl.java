/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviceimpl.myvodws;

/**
 *
 * @author kunsi
 */
import com.beans.myvodws.VideoData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.emumerations.PlotType;
import com.omertron.omdbapi.model.OmdbVideoBasic;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.model.SearchResults;
import com.omertron.omdbapi.tools.OmdbBuilder;
import java.io.File;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import org.bson.types.ObjectId;

public class AdminVideoServiceImpl {

    public OmdbVideoFull getVideoData(OmdbVideoFull result2) {

        //  System.out.println("###########################################################################################################################"+title);
        OmdbApi omdb = new OmdbApi("1a9e906b");
        try {
            result2 = omdb.getInfo(new OmdbBuilder()
                    .setTitle(result2.getTitle())
                    .setPlot(PlotType.FULL)
                    .setTomatoesOff()
                    .build());

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(new File("E:\\file.json"), result2);
            String jsonInString = mapper.writeValueAsString(result2);
            System.out.println(result2.toString());

        } catch (Exception e) {
        }

        return result2;
    }

    public String saveVideoData(VideoData vd) throws UnknownHostException, JsonProcessingException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("myvod");
        DBCollection collection = database.getCollection("videos");
        ObjectMapper mapperObj = new ObjectMapper();
        DBObject document = new BasicDBObject("OmdbFull",  mapperObj.writeValueAsString(vd.getOmdbVideoFull()))
                .append("VideoMetadata",  mapperObj.writeValueAsString(vd.getVideoMetadata()));
        collection.insert(document);
        ObjectId id = (ObjectId) document.get("_id");
        return id.toString();
    }

//    public static void main(String[] arhgs) {
//        AdminVideoServiceImpl aaa = new AdminVideoServiceImpl();
//
//        System.out.println(aaa.getVideoData("Game of thrones").toString());
//    }
}
