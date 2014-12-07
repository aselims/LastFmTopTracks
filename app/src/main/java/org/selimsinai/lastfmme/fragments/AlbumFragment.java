package org.selimsinai.lastfmme.fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import org.selimsinai.lastfmme.R;
import org.selimsinai.lastfmme.adapter.CustomListAdapter;
import org.selimsinai.lastfmme.app.APIClient;
import org.selimsinai.lastfmme.data.Album;
import org.selimsinai.lastfmme.data.Album1;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {

    public static final String TAG = AlbumFragment.class.getSimpleName();

    private ProgressDialog pDialog;
    private List<Album> albumList = new ArrayList<Album>();
    private EditText artistET;
    private Button findButton;
    private ListView listView;
    private CustomListAdapter adapter;


    public AlbumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_album, container, false);
        listView = (ListView) root.findViewById(R.id.listView);
        artistET = (EditText) root.findViewById(R.id.EditTextArtistName);
        findButton = (Button) root.findViewById(R.id.buttonFind);


        return root;
    }

    void dismissPDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new CustomListAdapter(getActivity(), albumList);
        listView.setAdapter(adapter);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pDialog = new ProgressDialog(getActivity());
                // Showing progress dialog before making http request
                pDialog.setMessage("Loading Top Albums...");
                pDialog.show();

                String artistName = artistET.getText().toString();
                download(artistName);

            }
        });

    }


    private void download(final String artist) {
        APIClient.
                getsApiInterface().
                getAlbums(artist, new Callback<Album1>() {
                    @Override
                    public void success(Album1 result, Response response) {
                       // Toast.makeText(getActivity(), result.getTopalbums().getAlbum() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_SHORT).show();

                        Log.d(TAG, result.getTopalbums().toString());
                  //    Log.d(TAG, "name= " + result.getTopalbums().getAlbum().get(1).getName());
                        dismissPDialog();

                        if(result.getTopalbums().getAlbum().size() >0){
                            albumList.clear();
                            albumList.addAll( result.getTopalbums().getAlbum());
                            adapter.notifyDataSetChanged();
                        }else{
                            Toast.makeText(getActivity(), "No Albums for this Artist " + artist, Toast.LENGTH_SHORT).show();
                        }



                    }

                    @Override
                    public void failure(RetrofitError retrofitError) {
                        Toast.makeText(getActivity(), retrofitError.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
    }

}
