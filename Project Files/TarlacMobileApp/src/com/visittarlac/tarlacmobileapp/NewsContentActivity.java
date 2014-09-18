package com.visittarlac.tarlacmobileapp;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.visittarlac.tarlacmobileapp.parser.RSSFeed;

public class NewsContentActivity extends Activity {

	RSSFeed feed;
	//TextView title;
	WebView desc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news_content);


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
		
		
		// Enable the vertical fading edge (by default it is disabled)
				ScrollView sv = (ScrollView) findViewById(R.id.sv);
				sv.setVerticalFadingEdgeEnabled(true);

				// Get the feed object and the position from the Intent
				feed = (RSSFeed) getIntent().getExtras().get("feed");
				int pos = getIntent().getExtras().getInt("pos");

				// Initialize the views
				//title = (TextView) findViewById(R.id.title);
				desc = (WebView) findViewById(R.id.desc);

				// set webview properties
				WebSettings ws = desc.getSettings();
				ws.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
				ws.getPluginState();
				ws.setPluginState(PluginState.ON);
				ws.setJavaScriptEnabled(true);
				
				//ws.setBuiltInZoomControls(true);

				// Set the views
				//title.setText(feed.getItem(pos).getTitle());
				desc.loadDataWithBaseURL("http://www.androidcentral.com/", feed
						.getItem(pos).getDescription(), "text/html", "UTF-8", null);
			}

		public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("ANNOUNCEMENTS");
    	}
	
		}
