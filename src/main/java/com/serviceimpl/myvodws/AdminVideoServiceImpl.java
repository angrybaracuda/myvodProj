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

  //  OmdbVideoFull result;

    public OmdbVideoFull getVideoData(OmdbVideoFull result , String title) {
        
      //  System.out.println("###########################################################################################################################"+title);
        OmdbApi omdb = new OmdbApi("1a9e906b");
        try {
            result = omdb.getInfo(new OmdbBuilder()
                    .setTitle(title)
                    .setPlot(PlotType.FULL)
                    .setTomatoes(true)
                    .build());

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(new File("E:\\file.json"), result);
            String jsonInString = mapper.writeValueAsString(result);
            System.out.println(result.toString());

        } catch (Exception e) {
        }
        return result;
    }

//    public static void main(String[] arhgs) {
//        AdminVideoServiceImpl aaa = new AdminVideoServiceImpl();
//
//        System.out.println(aaa.getVideoData("Game of thrones").toString());
//    }
}
