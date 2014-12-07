package org.selimsinai.lastfmme.app;

import org.selimsinai.lastfmme.APIInterface;

import retrofit.RestAdapter;

/**
 * Created by ssalman on 12/7/2014.
 */
public class APIClient {


    private static APIInterface sApiInterface;

    public static APIInterface getsApiInterface() {
        if (sApiInterface == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://ws.audioscrobbler.com/2.0")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            sApiInterface = restAdapter.create(APIInterface.class);
        }
        return sApiInterface;
    }
}
