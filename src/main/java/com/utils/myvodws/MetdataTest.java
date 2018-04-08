/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.myvodws;

import com.beans.myvodws.VideoMetadata;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

/**
 *
 * @author kunsi
 */
public class MetdataTest {

    public static void main(String[] args) {
        VideoMetadata vm = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            vm = mapper.readValue(new File("E:\\MyProject\\metadata_json"), VideoMetadata.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vm);
    }
}
