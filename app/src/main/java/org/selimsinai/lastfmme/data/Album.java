
package org.selimsinai.lastfmme.data;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Album {

    @Expose
    private String name;
    @Expose
    private String playcount;
    @Expose
    private String mbid;
    @Expose
    private String url;
    @Expose
    private Artist artist;
    @Expose
    private List<Image> image = new ArrayList<Image>();
    @SerializedName("@attr")
    @Expose
    private org.selimsinai.lastfmme.data.Attr Attr;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The playcount
     */
    public String getPlaycount() {
        return playcount;
    }

    /**
     * 
     * @param playcount
     *     The playcount
     */
    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

    /**
     * 
     * @return
     *     The mbid
     */
    public String getMbid() {
        return mbid;
    }

    /**
     * 
     * @param mbid
     *     The mbid
     */
    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The image
     */
    public List<Image> getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(List<Image> image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The Attr
     */
    public org.selimsinai.lastfmme.data.Attr getAttr() {
        return Attr;
    }

    /**
     * 
     * @param Attr
     *     The @attr
     */
    public void setAttr(org.selimsinai.lastfmme.data.Attr Attr) {
        this.Attr = Attr;
    }

}
