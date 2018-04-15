/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.myvodws;

import com.beans.myvodws.VideoMetadata;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.*;

/**
 *
 * @author kunsi
 */
public class MetadataWrapper {

    private final String exifToolPath = "E:\\MyProject\\ffmpeg\\bin\\";

    public VideoMetadata generateVideoMetadada(String path) throws IOException {
        Process p = null;
        System.out.println(File.separator);
        String s = null;

        path = "\"C:\\Users\\kunsi\\Downloads\\Spider-Man Homecoming (2017) [YTS.AG]\\Spider-Man.Homecoming.2017.720p.BluRay.x264-[YTS.AG].mp4\"";
        try {
            p = Runtime.getRuntime().exec(exifToolPath + "exiftool -f -j  " + path);
        } catch (IOException ex) {
            Logger.getLogger(MetadataWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        System.out.println("Here is the standard output of the command:\n");
        try {
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(MetadataWrapper.class.getName()).log(Level.SEVERE, null, ex);

        }
        // read any errors from the attempted command
        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
        System.exit(0);
        return null;
    }

    public static void main(String[] args) throws IOException {
        new MetadataWrapper().generateVideoMetadada("");

    }
}
