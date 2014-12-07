package org.selimsinai.lastfmme;

import org.selimsinai.lastfmme.data.Album1;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by ssalman on 12/7/2014.
 */
public interface APIInterface {

    @GET("/?method=artist.gettopalbums&api_key=01590856c264cfd360839494df12dec5&format=json")
    Album1 album1(@Query("artist") String name);


    @GET("/?method=artist.gettopalbums&api_key=01590856c264cfd360839494df12dec5&format=json")
    void getAlbums(@Query("artist") String name, Callback<Album1> cb);

}
