package org.selimsinai.lastfmme.app;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.selimsinai.lastfmme.data.Album1;
//import org.selimsinai.lastfmme.Util.LruBitmapCache;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;




public class AppController extends Application {

	public static final String TAG = AppController.class.getSimpleName();

    public static final String topAlbumsUrl = "http://ws.audioscrobbler.com/2.0/?method=artist.gettopalbums&artist=cher&api_key=01590856c264cfd360839494df12dec5&format=json";

    public static final String url = "https://ws.audioscrobbler.com/2.0/";
    //public static final String urlAuth = "http://www.last.fm/api/auth/";
   // public static final String url2 = "http://ws.audioscrobbler.com/2.0/?method=album.getinfo&api_key=a0548a8e4bf4b1785a60ecf1494a0af8&artist=Cher&album=Believe&format=json";

    public static final String API_KEY = "01590856c264cfd360839494df12dec5";
    public static final String SECRET = "bf30dc18c264a4c8fa7cff6fee81c2b4";
    public static final String USER = "aselims";
    public static final String PASSWORD = "Sinai";
    public static final String SIG = "api_key"+API_KEY+"methodauth.getMobileSessionpassword"+PASSWORD+"username"+USER;

	private static AppController mInstance;


    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient client;
    private Album1 album1;



    @Override
	public void onCreate() {
        super.onCreate();
        mInstance = this;

        client = new OkHttpClient();

        Log.d(TAG, "creating the app");

    }


}