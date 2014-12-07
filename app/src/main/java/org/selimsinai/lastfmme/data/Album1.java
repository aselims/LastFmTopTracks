
package org.selimsinai.lastfmme.data;

import com.google.gson.annotations.Expose;

public class Album1 {

    @Expose
    private Topalbums topalbums;

    /**
     * 
     * @return
     *     The topalbums
     */
    public Topalbums getTopalbums() {
        return topalbums;
    }

    /**
     * 
     * @param topalbums
     *     The topalbums
     */
    public void setTopalbums(Topalbums topalbums) {
        this.topalbums = topalbums;
    }

}
