package com.visittarlac.tarlacmobileapp;



import com.visittarlac.tarlacmobileapp.image.ImageLoader;
import com.visittarlac.tarlacmobileapp.parser.RSSFeed;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class NewsListActivity extends Activity {

	Application myApp;
	RSSFeed feed;
	ListView lv;
	CustomListAdapter adapter;
	public static Typeface ListTitle,ListSubTitle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_news);

		
		
		//Actionbar center
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      	getActionBar().setCustomView(R.layout.abs_layout_maps);
    	
      	
        ImageButton BackBtn = (ImageButton)findViewById(R.id.back_btn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	        	 finish();
	      }
	   });
        
      	
      	//customfont
      	Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Bold.otf");
        TextView tv = (TextView) findViewById(R.id.ActivityTitle);
        tv.setTypeface(tf);

        //custon ActionBar Name
        SetCustomTitle();
		
		
		ListTitle = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Bold.otf");
        ListSubTitle = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Regular.otf");
		
		myApp = getApplication();

		// Get feed form the file
		feed = (RSSFeed) getIntent().getExtras().get("feed");

		// Initialize the variables:
		lv = (ListView) findViewById(R.id.listView);
		lv.setVerticalFadingEdgeEnabled(true);

		// Set an Adapter to the ListView
		adapter = new CustomListAdapter(this);
		lv.setAdapter(adapter);

		// Set on item click listener to the ListView
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// actions to be performed when a list item clicked
				int pos = arg2;

				Bundle bundle = new Bundle();
				bundle.putSerializable("feed", feed);
				Intent intent = new Intent(NewsListActivity.this,
						NewsContentActivity.class);
				intent.putExtras(bundle);
				intent.putExtra("pos", pos);
				startActivity(intent);

			}
		});

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		adapter.imageLoader.clearCache();
		adapter.notifyDataSetChanged();
	}

	class CustomListAdapter extends BaseAdapter {

		private LayoutInflater layoutInflater;
		public ImageLoader imageLoader;

		public CustomListAdapter(NewsListActivity activity) {

			layoutInflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			imageLoader = new ImageLoader(activity.getApplicationContext());
		}

		@Override
		public int getCount() {

			// Set the total list item count
			return feed.getItemCount();
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			// Inflate the item layout and set the views
			View listItem = convertView;
			int pos = position;
			if (listItem == null) {
				listItem = layoutInflater.inflate(R.layout.list_news, null);
			}

			// Initialize the views in the layout
			ImageView iv = (ImageView) listItem.findViewById(R.id.thumb);
			TextView tvTitle = (TextView) listItem.findViewById(R.id.title);
			TextView tvDate = (TextView) listItem.findViewById(R.id.date);

			
			
			
			// Set the views in the layout
			//imageLoader.DisplayImage(feed.getItem(pos).getImage(), iv);
			
			tvTitle.setText(feed.getItem(pos).getTitle());
			tvDate.setText(feed.getItem(pos).getDate());

			tvTitle.setTypeface(NewsListActivity.ListTitle);
			tvDate.setTypeface(NewsListActivity.ListSubTitle);
			
			
			return listItem;
		}

	}
	
	public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("ANNOUNCEMENTS");
    	}
	

}
