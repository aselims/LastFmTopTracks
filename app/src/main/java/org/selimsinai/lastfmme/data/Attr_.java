
package org.selimsinai.lastfmme.data;

import com.google.gson.annotations.Expose;

public class Attr_ {

    @Expose
    private String artist;
    @Expose
    private String page;
    @Expose
    private String perPage;
    @Expose
    private String totalPages;
    @Expose
    private String total;

    /**
     * 
     * @return
     *     The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The page
     */
    public String getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public String getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The perPage
     */
    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The totalPages
     */
    public String getTotalPages() {
        return totalPages;
    }

    /**
     * 
     * @param totalPages
     *     The totalPages
     */
    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

}
