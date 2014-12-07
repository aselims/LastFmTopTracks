package org.selimsinai.lastfmme.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import org.selimsinai.lastfmme.R;
import org.selimsinai.lastfmme.data.Album;

import java.util.List;


public class CustomListAdapter extends BaseAdapter {
	private Activity activity;
    //result.getTopalbums().getAlbum().get(0).getName()
	private LayoutInflater inflater;
	private List<Album> albumItems;

	public CustomListAdapter(Activity activity, List<Album> movieItems ) {
		this.activity = activity;
		this.albumItems = movieItems;
	}

	@Override
	public int getCount() {
		return albumItems.size();
	}

	@Override
	public Object getItem(int location) {
		return albumItems.get(location);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (inflater == null)
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null)
			convertView = inflater.inflate(R.layout.album_row, null);

		/*if (imageLoader == null)
			imageLoader = AppController.getInstance().getImageLoader();

		*/
        ImageView thumbnail = (ImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);



        Album a = albumItems.get(position);

        Picasso.with(activity)
                .load(a.getImage().get(1).getText())
                .placeholder(R.drawable.ic_launcher)
                .into(thumbnail);

        // thumbnail image
	//	thumbNail.setImageUrl(a.getThumbnailUrl(), imageLoader);
		
		// title
		title.setText(a.getName());

		return convertView;
	}

}