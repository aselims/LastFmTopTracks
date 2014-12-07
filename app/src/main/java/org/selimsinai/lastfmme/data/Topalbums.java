
package org.selimsinai.lastfmme.data;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topalbums {

    @Expose
    private List<Album> album = new ArrayList<Album>();
    @SerializedName("@attr")
    @Expose
    private Attr_ Attr;

    /**
     * 
     * @return
     *     The album
     */
    public List<Album> getAlbum() {
        return album;
    }

    /**
     * 
     * @param album
     *     The album
     */
    public void setAlbum(List<Album> album) {
        this.album = album;
    }

    /**
     * 
     * @return
     *     The Attr
     */
    public Attr_ getAttr() {
        return Attr;
    }

    /**
     * 
     * @param Attr
     *     The @attr
     */
    public void setAttr(Attr_ Attr) {
        this.Attr = Attr;
    }

}
