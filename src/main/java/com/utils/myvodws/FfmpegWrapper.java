/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.myvodws;

import com.beans.myvodws.PlayersConfig;
import java.util.Optional;

/**
 *
 * @author kunsi
 */
public class FfmpegWrapper {

    private String path;
    private static String ffmpeg_home;

    public FfmpegWrapper(String path) {
        this.path = path;
    }

    public String createStream(PlayersConfig c, String url) {
        return null;
    }

    public static String getFfmpegHome() {
        ffmpeg_home = System.getenv("FFMPEG_HOME");
        System.out.println("FFMPEG HOME ------------->" + ffmpeg_home);
        if (ffmpeg_home != null) {
            return ffmpeg_home;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        FfmpegWrapper.getFfmpegHome();
     //   System.out.println("FFMPEG HOME ------------->" + System.getenv("FFMPEG_HOME"));

    }
}
