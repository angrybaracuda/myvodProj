/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.myvodws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SourceFile",
    "ExifToolVersion",
    "FileName",
    "Directory",
    "FileSize",
    "FileModifyDate",
    "FileAccessDate",
    "FileCreateDate",
    "FilePermissions",
    "FileType",
    "FileTypeExtension",
    "MIMEType",
    "MajorBrand",
    "MinorVersion",
    "CompatibleBrands",
    "MovieHeaderVersion",
    "CreateDate",
    "ModifyDate",
    "TimeScale",
    "Duration",
    "PreferredRate",
    "PreferredVolume",
    "PreviewTime",
    "PreviewDuration",
    "PosterTime",
    "SelectionTime",
    "SelectionDuration",
    "CurrentTime",
    "NextTrackID",
    "TrackHeaderVersion",
    "TrackCreateDate",
    "TrackModifyDate",
    "TrackID",
    "TrackDuration",
    "TrackLayer",
    "TrackVolume",
    "ImageWidth",
    "ImageHeight",
    "GraphicsMode",
    "OpColor",
    "CompressorID",
    "SourceImageWidth",
    "SourceImageHeight",
    "XResolution",
    "YResolution",
    "BitDepth",
    "PixelAspectRatio",
    "VideoFrameRate",
    "MatrixStructure",
    "MediaHeaderVersion",
    "MediaCreateDate",
    "MediaModifyDate",
    "MediaTimeScale",
    "MediaDuration",
    "MediaLanguageCode",
    "HandlerDescription",
    "Balance",
    "AudioFormat",
    "AudioChannels",
    "AudioBitsPerSample",
    "AudioSampleRate",
    "HandlerType",
    "HandlerVendorID",
    "Encoder",
    "MovieDataSize",
    "MovieDataOffset",
    "AvgBitrate",
    "ImageSize",
    "Megapixels",
    "Rotation"
})
public class VideoMetadata {

    @JsonProperty("SourceFile")
    private String sourceFile;
    @JsonProperty("ExifToolVersion")
    private Double exifToolVersion;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("Directory")
    private String directory;
    @JsonProperty("FileSize")
    private String fileSize;
    @JsonProperty("FileModifyDate")
    private String fileModifyDate;
    @JsonProperty("FileAccessDate")
    private String fileAccessDate;
    @JsonProperty("FileCreateDate")
    private String fileCreateDate;
    @JsonProperty("FilePermissions")
    private String filePermissions;
    @JsonProperty("FileType")
    private String fileType;
    @JsonProperty("FileTypeExtension")
    private String fileTypeExtension;
    @JsonProperty("MIMEType")
    private String mIMEType;
    @JsonProperty("MajorBrand")
    private String majorBrand;
    @JsonProperty("MinorVersion")
    private String minorVersion;
    @JsonProperty("CompatibleBrands")
    private List<String> compatibleBrands = null;
    @JsonProperty("MovieHeaderVersion")
    private Integer movieHeaderVersion;
    @JsonProperty("CreateDate")
    private String createDate;
    @JsonProperty("ModifyDate")
    private String modifyDate;
    @JsonProperty("TimeScale")
    private Integer timeScale;
    @JsonProperty("Duration")
    private String duration;
    @JsonProperty("PreferredRate")
    private Integer preferredRate;
    @JsonProperty("PreferredVolume")
    private String preferredVolume;
    @JsonProperty("PreviewTime")
    private String previewTime;
    @JsonProperty("PreviewDuration")
    private String previewDuration;
    @JsonProperty("PosterTime")
    private String posterTime;
    @JsonProperty("SelectionTime")
    private String selectionTime;
    @JsonProperty("SelectionDuration")
    private String selectionDuration;
    @JsonProperty("CurrentTime")
    private String currentTime;
    @JsonProperty("NextTrackID")
    private Integer nextTrackID;
    @JsonProperty("TrackHeaderVersion")
    private Integer trackHeaderVersion;
    @JsonProperty("TrackCreateDate")
    private String trackCreateDate;
    @JsonProperty("TrackModifyDate")
    private String trackModifyDate;
    @JsonProperty("TrackID")
    private Integer trackID;
    @JsonProperty("TrackDuration")
    private String trackDuration;
    @JsonProperty("TrackLayer")
    private Integer trackLayer;
    @JsonProperty("TrackVolume")
    private String trackVolume;
    @JsonProperty("ImageWidth")
    private Integer imageWidth;
    @JsonProperty("ImageHeight")
    private Integer imageHeight;
    @JsonProperty("GraphicsMode")
    private String graphicsMode;
    @JsonProperty("OpColor")
    private String opColor;
    @JsonProperty("CompressorID")
    private String compressorID;
    @JsonProperty("SourceImageWidth")
    private Integer sourceImageWidth;
    @JsonProperty("SourceImageHeight")
    private Integer sourceImageHeight;
    @JsonProperty("XResolution")
    private Integer xResolution;
    @JsonProperty("YResolution")
    private Integer yResolution;
    @JsonProperty("BitDepth")
    private Integer bitDepth;
    @JsonProperty("PixelAspectRatio")
    private String pixelAspectRatio;
    @JsonProperty("VideoFrameRate")
    private Double videoFrameRate;
    @JsonProperty("MatrixStructure")
    private String matrixStructure;
    @JsonProperty("MediaHeaderVersion")
    private Integer mediaHeaderVersion;
    @JsonProperty("MediaCreateDate")
    private String mediaCreateDate;
    @JsonProperty("MediaModifyDate")
    private String mediaModifyDate;
    @JsonProperty("MediaTimeScale")
    private Integer mediaTimeScale;
    @JsonProperty("MediaDuration")
    private String mediaDuration;
    @JsonProperty("MediaLanguageCode")
    private String mediaLanguageCode;
    @JsonProperty("HandlerDescription")
    private String handlerDescription;
    @JsonProperty("Balance")
    private Integer balance;
    @JsonProperty("AudioFormat")
    private String audioFormat;
    @JsonProperty("AudioChannels")
    private Integer audioChannels;
    @JsonProperty("AudioBitsPerSample")
    private Integer audioBitsPerSample;
    @JsonProperty("AudioSampleRate")
    private Integer audioSampleRate;
    @JsonProperty("HandlerType")
    private String handlerType;
    @JsonProperty("HandlerVendorID")
    private String handlerVendorID;
    @JsonProperty("Encoder")
    private String encoder;
    @JsonProperty("MovieDataSize")
    private Integer movieDataSize;
    @JsonProperty("MovieDataOffset")
    private Integer movieDataOffset;
    @JsonProperty("AvgBitrate")
    private String avgBitrate;
    @JsonProperty("ImageSize")
    private String imageSize;
    @JsonProperty("Megapixels")
    private Double megapixels;
    @JsonProperty("Rotation")
    private Integer rotation;

    public VideoMetadata() {
    }
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SourceFile")
    public String getSourceFile() {
        return sourceFile;
    }

    @JsonProperty("SourceFile")
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @JsonProperty("ExifToolVersion")
    public Double getExifToolVersion() {
        return exifToolVersion;
    }

    @JsonProperty("ExifToolVersion")
    public void setExifToolVersion(Double exifToolVersion) {
        this.exifToolVersion = exifToolVersion;
    }

    @JsonProperty("FileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("FileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("Directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("Directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("FileSize")
    public String getFileSize() {
        return fileSize;
    }

    @JsonProperty("FileSize")
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("FileModifyDate")
    public String getFileModifyDate() {
        return fileModifyDate;
    }

    @JsonProperty("FileModifyDate")
    public void setFileModifyDate(String fileModifyDate) {
        this.fileModifyDate = fileModifyDate;
    }

    @JsonProperty("FileAccessDate")
    public String getFileAccessDate() {
        return fileAccessDate;
    }

    @JsonProperty("FileAccessDate")
    public void setFileAccessDate(String fileAccessDate) {
        this.fileAccessDate = fileAccessDate;
    }

    @JsonProperty("FileCreateDate")
    public String getFileCreateDate() {
        return fileCreateDate;
    }

    @JsonProperty("FileCreateDate")
    public void setFileCreateDate(String fileCreateDate) {
        this.fileCreateDate = fileCreateDate;
    }

    @JsonProperty("FilePermissions")
    public String getFilePermissions() {
        return filePermissions;
    }

    @JsonProperty("FilePermissions")
    public void setFilePermissions(String filePermissions) {
        this.filePermissions = filePermissions;
    }

    @JsonProperty("FileType")
    public String getFileType() {
        return fileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("FileTypeExtension")
    public String getFileTypeExtension() {
        return fileTypeExtension;
    }

    @JsonProperty("FileTypeExtension")
    public void setFileTypeExtension(String fileTypeExtension) {
        this.fileTypeExtension = fileTypeExtension;
    }

    @JsonProperty("MIMEType")
    public String getMIMEType() {
        return mIMEType;
    }

    @JsonProperty("MIMEType")
    public void setMIMEType(String mIMEType) {
        this.mIMEType = mIMEType;
    }

    @JsonProperty("MajorBrand")
    public String getMajorBrand() {
        return majorBrand;
    }

    @JsonProperty("MajorBrand")
    public void setMajorBrand(String majorBrand) {
        this.majorBrand = majorBrand;
    }

    @JsonProperty("MinorVersion")
    public String getMinorVersion() {
        return minorVersion;
    }

    @JsonProperty("MinorVersion")
    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    @JsonProperty("CompatibleBrands")
    public List<String> getCompatibleBrands() {
        return compatibleBrands;
    }

    @JsonProperty("CompatibleBrands")
    public void setCompatibleBrands(List<String> compatibleBrands) {
        this.compatibleBrands = compatibleBrands;
    }

    @JsonProperty("MovieHeaderVersion")
    public Integer getMovieHeaderVersion() {
        return movieHeaderVersion;
    }

    @JsonProperty("MovieHeaderVersion")
    public void setMovieHeaderVersion(Integer movieHeaderVersion) {
        this.movieHeaderVersion = movieHeaderVersion;
    }

    @JsonProperty("CreateDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("CreateDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("ModifyDate")
    public String getModifyDate() {
        return modifyDate;
    }

    @JsonProperty("ModifyDate")
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @JsonProperty("TimeScale")
    public Integer getTimeScale() {
        return timeScale;
    }

    @JsonProperty("TimeScale")
    public void setTimeScale(Integer timeScale) {
        this.timeScale = timeScale;
    }

    @JsonProperty("Duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("PreferredRate")
    public Integer getPreferredRate() {
        return preferredRate;
    }

    @JsonProperty("PreferredRate")
    public void setPreferredRate(Integer preferredRate) {
        this.preferredRate = preferredRate;
    }

    @JsonProperty("PreferredVolume")
    public String getPreferredVolume() {
        return preferredVolume;
    }

    @JsonProperty("PreferredVolume")
    public void setPreferredVolume(String preferredVolume) {
        this.preferredVolume = preferredVolume;
    }

    @JsonProperty("PreviewTime")
    public String getPreviewTime() {
        return previewTime;
    }

    @JsonProperty("PreviewTime")
    public void setPreviewTime(String previewTime) {
        this.previewTime = previewTime;
    }

    @JsonProperty("PreviewDuration")
    public String getPreviewDuration() {
        return previewDuration;
    }

    @JsonProperty("PreviewDuration")
    public void setPreviewDuration(String previewDuration) {
        this.previewDuration = previewDuration;
    }

    @JsonProperty("PosterTime")
    public String getPosterTime() {
        return posterTime;
    }

    @JsonProperty("PosterTime")
    public void setPosterTime(String posterTime) {
        this.posterTime = posterTime;
    }

    @JsonProperty("SelectionTime")
    public String getSelectionTime() {
        return selectionTime;
    }

    @JsonProperty("SelectionTime")
    public void setSelectionTime(String selectionTime) {
        this.selectionTime = selectionTime;
    }

    @JsonProperty("SelectionDuration")
    public String getSelectionDuration() {
        return selectionDuration;
    }

    @JsonProperty("SelectionDuration")
    public void setSelectionDuration(String selectionDuration) {
        this.selectionDuration = selectionDuration;
    }

    @JsonProperty("CurrentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("CurrentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    @JsonProperty("NextTrackID")
    public Integer getNextTrackID() {
        return nextTrackID;
    }

    @JsonProperty("NextTrackID")
    public void setNextTrackID(Integer nextTrackID) {
        this.nextTrackID = nextTrackID;
    }

    @JsonProperty("TrackHeaderVersion")
    public Integer getTrackHeaderVersion() {
        return trackHeaderVersion;
    }

    @JsonProperty("TrackHeaderVersion")
    public void setTrackHeaderVersion(Integer trackHeaderVersion) {
        this.trackHeaderVersion = trackHeaderVersion;
    }

    @JsonProperty("TrackCreateDate")
    public String getTrackCreateDate() {
        return trackCreateDate;
    }

    @JsonProperty("TrackCreateDate")
    public void setTrackCreateDate(String trackCreateDate) {
        this.trackCreateDate = trackCreateDate;
    }

    @JsonProperty("TrackModifyDate")
    public String getTrackModifyDate() {
        return trackModifyDate;
    }

    @JsonProperty("TrackModifyDate")
    public void setTrackModifyDate(String trackModifyDate) {
        this.trackModifyDate = trackModifyDate;
    }

    @JsonProperty("TrackID")
    public Integer getTrackID() {
        return trackID;
    }

    @JsonProperty("TrackID")
    public void setTrackID(Integer trackID) {
        this.trackID = trackID;
    }

    @JsonProperty("TrackDuration")
    public String getTrackDuration() {
        return trackDuration;
    }

    @JsonProperty("TrackDuration")
    public void setTrackDuration(String trackDuration) {
        this.trackDuration = trackDuration;
    }

    @JsonProperty("TrackLayer")
    public Integer getTrackLayer() {
        return trackLayer;
    }

    @JsonProperty("TrackLayer")
    public void setTrackLayer(Integer trackLayer) {
        this.trackLayer = trackLayer;
    }

    @JsonProperty("TrackVolume")
    public String getTrackVolume() {
        return trackVolume;
    }

    @JsonProperty("TrackVolume")
    public void setTrackVolume(String trackVolume) {
        this.trackVolume = trackVolume;
    }

    @JsonProperty("ImageWidth")
    public Integer getImageWidth() {
        return imageWidth;
    }

    @JsonProperty("ImageWidth")
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    @JsonProperty("ImageHeight")
    public Integer getImageHeight() {
        return imageHeight;
    }

    @JsonProperty("ImageHeight")
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    @JsonProperty("GraphicsMode")
    public String getGraphicsMode() {
        return graphicsMode;
    }

    @JsonProperty("GraphicsMode")
    public void setGraphicsMode(String graphicsMode) {
        this.graphicsMode = graphicsMode;
    }

    @JsonProperty("OpColor")
    public String getOpColor() {
        return opColor;
    }

    @JsonProperty("OpColor")
    public void setOpColor(String opColor) {
        this.opColor = opColor;
    }

    @JsonProperty("CompressorID")
    public String getCompressorID() {
        return compressorID;
    }

    @JsonProperty("CompressorID")
    public void setCompressorID(String compressorID) {
        this.compressorID = compressorID;
    }

    @JsonProperty("SourceImageWidth")
    public Integer getSourceImageWidth() {
        return sourceImageWidth;
    }

    @JsonProperty("SourceImageWidth")
    public void setSourceImageWidth(Integer sourceImageWidth) {
        this.sourceImageWidth = sourceImageWidth;
    }

    @JsonProperty("SourceImageHeight")
    public Integer getSourceImageHeight() {
        return sourceImageHeight;
    }

    @JsonProperty("SourceImageHeight")
    public void setSourceImageHeight(Integer sourceImageHeight) {
        this.sourceImageHeight = sourceImageHeight;
    }

    @JsonProperty("XResolution")
    public Integer getXResolution() {
        return xResolution;
    }

    @JsonProperty("XResolution")
    public void setXResolution(Integer xResolution) {
        this.xResolution = xResolution;
    }

    @JsonProperty("YResolution")
    public Integer getYResolution() {
        return yResolution;
    }

    @JsonProperty("YResolution")
    public void setYResolution(Integer yResolution) {
        this.yResolution = yResolution;
    }

    @JsonProperty("BitDepth")
    public Integer getBitDepth() {
        return bitDepth;
    }

    @JsonProperty("BitDepth")
    public void setBitDepth(Integer bitDepth) {
        this.bitDepth = bitDepth;
    }

    @JsonProperty("PixelAspectRatio")
    public String getPixelAspectRatio() {
        return pixelAspectRatio;
    }

    @JsonProperty("PixelAspectRatio")
    public void setPixelAspectRatio(String pixelAspectRatio) {
        this.pixelAspectRatio = pixelAspectRatio;
    }

    @JsonProperty("VideoFrameRate")
    public Double getVideoFrameRate() {
        return videoFrameRate;
    }

    @JsonProperty("VideoFrameRate")
    public void setVideoFrameRate(Double videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    @JsonProperty("MatrixStructure")
    public String getMatrixStructure() {
        return matrixStructure;
    }

    @JsonProperty("MatrixStructure")
    public void setMatrixStructure(String matrixStructure) {
        this.matrixStructure = matrixStructure;
    }

    @JsonProperty("MediaHeaderVersion")
    public Integer getMediaHeaderVersion() {
        return mediaHeaderVersion;
    }

    @JsonProperty("MediaHeaderVersion")
    public void setMediaHeaderVersion(Integer mediaHeaderVersion) {
        this.mediaHeaderVersion = mediaHeaderVersion;
    }

    @JsonProperty("MediaCreateDate")
    public String getMediaCreateDate() {
        return mediaCreateDate;
    }

    @JsonProperty("MediaCreateDate")
    public void setMediaCreateDate(String mediaCreateDate) {
        this.mediaCreateDate = mediaCreateDate;
    }

    @JsonProperty("MediaModifyDate")
    public String getMediaModifyDate() {
        return mediaModifyDate;
    }

    @JsonProperty("MediaModifyDate")
    public void setMediaModifyDate(String mediaModifyDate) {
        this.mediaModifyDate = mediaModifyDate;
    }

    @JsonProperty("MediaTimeScale")
    public Integer getMediaTimeScale() {
        return mediaTimeScale;
    }

    @JsonProperty("MediaTimeScale")
    public void setMediaTimeScale(Integer mediaTimeScale) {
        this.mediaTimeScale = mediaTimeScale;
    }

    @JsonProperty("MediaDuration")
    public String getMediaDuration() {
        return mediaDuration;
    }

    @JsonProperty("MediaDuration")
    public void setMediaDuration(String mediaDuration) {
        this.mediaDuration = mediaDuration;
    }

    @JsonProperty("MediaLanguageCode")
    public String getMediaLanguageCode() {
        return mediaLanguageCode;
    }

    @JsonProperty("MediaLanguageCode")
    public void setMediaLanguageCode(String mediaLanguageCode) {
        this.mediaLanguageCode = mediaLanguageCode;
    }

    @JsonProperty("HandlerDescription")
    public String getHandlerDescription() {
        return handlerDescription;
    }

    @JsonProperty("HandlerDescription")
    public void setHandlerDescription(String handlerDescription) {
        this.handlerDescription = handlerDescription;
    }

    @JsonProperty("Balance")
    public Integer getBalance() {
        return balance;
    }

    @JsonProperty("Balance")
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @JsonProperty("AudioFormat")
    public String getAudioFormat() {
        return audioFormat;
    }

    @JsonProperty("AudioFormat")
    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    @JsonProperty("AudioChannels")
    public Integer getAudioChannels() {
        return audioChannels;
    }

    @JsonProperty("AudioChannels")
    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    @JsonProperty("AudioBitsPerSample")
    public Integer getAudioBitsPerSample() {
        return audioBitsPerSample;
    }

    @JsonProperty("AudioBitsPerSample")
    public void setAudioBitsPerSample(Integer audioBitsPerSample) {
        this.audioBitsPerSample = audioBitsPerSample;
    }

    @JsonProperty("AudioSampleRate")
    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    @JsonProperty("AudioSampleRate")
    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    @JsonProperty("HandlerType")
    public String getHandlerType() {
        return handlerType;
    }

    @JsonProperty("HandlerType")
    public void setHandlerType(String handlerType) {
        this.handlerType = handlerType;
    }

    @JsonProperty("HandlerVendorID")
    public String getHandlerVendorID() {
        return handlerVendorID;
    }

    @JsonProperty("HandlerVendorID")
    public void setHandlerVendorID(String handlerVendorID) {
        this.handlerVendorID = handlerVendorID;
    }

    @JsonProperty("Encoder")
    public String getEncoder() {
        return encoder;
    }

    @JsonProperty("Encoder")
    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    @JsonProperty("MovieDataSize")
    public Integer getMovieDataSize() {
        return movieDataSize;
    }

    @JsonProperty("MovieDataSize")
    public void setMovieDataSize(Integer movieDataSize) {
        this.movieDataSize = movieDataSize;
    }

    @JsonProperty("MovieDataOffset")
    public Integer getMovieDataOffset() {
        return movieDataOffset;
    }

    @JsonProperty("MovieDataOffset")
    public void setMovieDataOffset(Integer movieDataOffset) {
        this.movieDataOffset = movieDataOffset;
    }

    @JsonProperty("AvgBitrate")
    public String getAvgBitrate() {
        return avgBitrate;
    }

    @JsonProperty("AvgBitrate")
    public void setAvgBitrate(String avgBitrate) {
        this.avgBitrate = avgBitrate;
    }

    @JsonProperty("ImageSize")
    public String getImageSize() {
        return imageSize;
    }

    @JsonProperty("ImageSize")
    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    @JsonProperty("Megapixels")
    public Double getMegapixels() {
        return megapixels;
    }

    @JsonProperty("Megapixels")
    public void setMegapixels(Double megapixels) {
        this.megapixels = megapixels;
    }

    @JsonProperty("Rotation")
    public Integer getRotation() {
        return rotation;
    }

    @JsonProperty("Rotation")
    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @Override
    public String toString() {
        return "VideoMetadata{" + "sourceFile=" + sourceFile + ", exifToolVersion=" + exifToolVersion + ", fileName=" + fileName + ", directory=" + directory + ", fileSize=" + fileSize + ", fileModifyDate=" + fileModifyDate + ", fileAccessDate=" + fileAccessDate + ", fileCreateDate=" + fileCreateDate + ", filePermissions=" + filePermissions + ", fileType=" + fileType + ", fileTypeExtension=" + fileTypeExtension + ", mIMEType=" + mIMEType + ", majorBrand=" + majorBrand + ", minorVersion=" + minorVersion + ", compatibleBrands=" + compatibleBrands + ", movieHeaderVersion=" + movieHeaderVersion + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", timeScale=" + timeScale + ", duration=" + duration + ", preferredRate=" + preferredRate + ", preferredVolume=" + preferredVolume + ", previewTime=" + previewTime + ", previewDuration=" + previewDuration + ", posterTime=" + posterTime + ", selectionTime=" + selectionTime + ", selectionDuration=" + selectionDuration + ", currentTime=" + currentTime + ", nextTrackID=" + nextTrackID + ", trackHeaderVersion=" + trackHeaderVersion + ", trackCreateDate=" + trackCreateDate + ", trackModifyDate=" + trackModifyDate + ", trackID=" + trackID + ", trackDuration=" + trackDuration + ", trackLayer=" + trackLayer + ", trackVolume=" + trackVolume + ", imageWidth=" + imageWidth + ", imageHeight=" + imageHeight + ", graphicsMode=" + graphicsMode + ", opColor=" + opColor + ", compressorID=" + compressorID + ", sourceImageWidth=" + sourceImageWidth + ", sourceImageHeight=" + sourceImageHeight + ", xResolution=" + xResolution + ", yResolution=" + yResolution + ", bitDepth=" + bitDepth + ", pixelAspectRatio=" + pixelAspectRatio + ", videoFrameRate=" + videoFrameRate + ", matrixStructure=" + matrixStructure + ", mediaHeaderVersion=" + mediaHeaderVersion + ", mediaCreateDate=" + mediaCreateDate + ", mediaModifyDate=" + mediaModifyDate + ", mediaTimeScale=" + mediaTimeScale + ", mediaDuration=" + mediaDuration + ", mediaLanguageCode=" + mediaLanguageCode + ", handlerDescription=" + handlerDescription + ", balance=" + balance + ", audioFormat=" + audioFormat + ", audioChannels=" + audioChannels + ", audioBitsPerSample=" + audioBitsPerSample + ", audioSampleRate=" + audioSampleRate + ", handlerType=" + handlerType + ", handlerVendorID=" + handlerVendorID + ", encoder=" + encoder + ", movieDataSize=" + movieDataSize + ", movieDataOffset=" + movieDataOffset + ", avgBitrate=" + avgBitrate + ", imageSize=" + imageSize + ", megapixels=" + megapixels + ", rotation=" + rotation + ", additionalProperties=" + additionalProperties + '}';
    }
}
