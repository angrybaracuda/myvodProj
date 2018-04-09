/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.myvodws;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.emumerations.PlotType;
import com.omertron.omdbapi.model.OmdbVideoBasic;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.model.SearchResults;
import com.omertron.omdbapi.tools.OmdbBuilder;
import com.omertron.omdbapi.tools.OmdbParameters;
import java.io.File;

/**
 *
 * @author kunsi
 */
public class OmdbTest {

    public static void main(String[] args) {
        OmdbApi omdb = new OmdbApi("1a9e906b");
        OmdbParameters op = new OmdbParameters();
        OmdbVideoBasic vb = new OmdbVideoBasic();
        
        try {
            OmdbVideoFull result = omdb.getInfo(new OmdbBuilder()
                    .setTitle("Blade Runner")
                    //.setYear(1982)
                    
                    .setPlot(PlotType.FULL)
                    .setTomatoes(true)
                    .build());

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("E:\\file.json"), result);
            String jsonInString = mapper.writeValueAsString(result);
            System.out.println(result.toString());
        } catch (Exception e) {
        }
        
    }
}
