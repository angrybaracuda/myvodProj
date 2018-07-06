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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.emumerations.PlotType;
import com.omertron.omdbapi.model.OmdbVideoBasic;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.model.SearchResults;
import com.omertron.omdbapi.tools.OmdbBuilder;
import java.io.File;

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
    
    public String saveVideoData ()
    {
        return null;
    }

//    public static void main(String[] arhgs) {
//        AdminVideoServiceImpl aaa = new AdminVideoServiceImpl();
//
//        System.out.println(aaa.getVideoData("Game of thrones").toString());
//    }
}
