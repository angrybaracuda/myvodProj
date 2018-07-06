/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.myvodws;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.omertron.omdbapi.model.OmdbVideoFull;

 @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OmdbVideoFull",
    "VideoMetadata"
})
public class VideoData {
     
     

    @JsonProperty("OmdbVideoFull")
    private OmdbVideoFull omdbVideoFull;
    @JsonProperty("VideoMetadata")
    private VideoMetadata videoMetadata;

    public VideoData() {
    }

    public VideoData(OmdbVideoFull omdbVideoFull, VideoMetadata videoMetadata) {
        this.omdbVideoFull = omdbVideoFull;
        this.videoMetadata = videoMetadata;
    }
   
   @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
   
    @JsonProperty("OmdbVideoFull")
    public OmdbVideoFull getOmdbVideoFull() {
        return omdbVideoFull;
    }

    @JsonProperty("OmdbVideoFull")
    public void setOmdbVideoFull(OmdbVideoFull omdbVideoFull) {
        this.omdbVideoFull = omdbVideoFull;
    }

    @JsonProperty("VideoMetadata")
    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    @JsonProperty("VideoMetadata")
    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
