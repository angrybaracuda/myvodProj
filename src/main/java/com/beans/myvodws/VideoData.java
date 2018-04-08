/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.myvodws;

import com.omertron.omdbapi.model.OmdbVideoFull;

/**
 *
 * @author kunsi
 */
public class VideoData {
    private OmdbVideoFull videoData;
    private VideoMetadata metdata;

    public OmdbVideoFull getVideoData() {
        return videoData;
    }

    public void setVideoData(OmdbVideoFull videoData) {
        this.videoData = videoData;
    }

    public VideoMetadata getMetdata() {
        return metdata;
    }

    public void setMetdata(VideoMetadata metdata) {
        this.metdata = metdata;
    }
     
}
