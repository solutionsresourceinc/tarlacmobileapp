package com.visittarlac.tarlacmobileapp;


import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.visittarlac.tarlacmobileapp.parser.DOMParser;
import com.visittarlac.tarlacmobileapp.parser.RSSFeed;

public class AnnouncementActivity extends Activity {


	private String RSSFEEDURL = "http://visit-tarlac.com/syndication-feed?format=feed&type=rss";
	RSSFeed feed;
	TextView tvmsg,tvsubmsg;
	ImageView iv;
	
	// flag for Internet connection status
    Boolean isInternetPresent = false;
     
    // Connection detector class
    ConnectionDetector cd; 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_announcement);
		
		
		cd = new ConnectionDetector(getApplicationContext());
		
		
		
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
		
        
        tvmsg = (TextView)findViewById(R.id.tvmessage);
        tvsubmsg = (TextView)findViewById(R.id.tvsubmsg);
        iv =(ImageView)findViewById(R.id.iv);
        
        
        // get Internet status
        isInternetPresent = cd.isConnectingToInternet();

        // check for Internet status
        if (isInternetPresent) {
            // Internet Connection is Present
        	ProgressDialog pdialog=new ProgressDialog(this);
 	          pdialog.setCancelable(false);
 	          pdialog.setMessage("Loading News Feeds");
 	          pdialog.show();
 	       	  new AsyncLoadXMLFeed().execute();
        } else {
            // Internet connection is not present
    		tvmsg.setVisibility(View.VISIBLE);
            tvsubmsg.setVisibility(View.VISIBLE);
            iv.setVisibility(View.VISIBLE);
            	
    		Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Bold.otf");
    		tvmsg.setText("You're Offline");
    		tvmsg.setTypeface(tf1);
    			
    		Typeface tf2= Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Regular.otf");
    		tvsubmsg.setText("Please connect to the internet and try again.");
    		tvsubmsg.setTypeface(tf2);
    			
        }
        
        
        
        
		 //ConnectivityManager cn=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
	       // NetworkInfo nf=cn.getActiveNetworkInfo();
	       // if(nf != null && nf.isConnected()==true )
	       // {
	       // 	ProgressDialog pdialog=new ProgressDialog(this);
	       //     pdialog.setCancelable(false);
	      //      pdialog.setMessage("Loading News Feeds");
	     //       pdialog.show();
	     //   	new AsyncLoadXMLFeed().execute();
	        	

		//} else {
			// Connected - Start parsing
			
		//	tvmsg.setVisibility(View.VISIBLE);
        //	tvsubmsg.setVisibility(View.VISIBLE);
        //	iv.setVisibility(View.VISIBLE);
        	
		//	Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Bold.otf");
		//	tvmsg.setText("You're Offline");
		//	tvmsg.setTypeface(tf1);
			
		//	Typeface tf2= Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Regular.otf");
		//	tvsubmsg.setText("Please connect to the internet and try again.");
		//	tvsubmsg.setTypeface(tf2);
			
		//}


	}

	private class AsyncLoadXMLFeed extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {

			// Obtain feed
			DOMParser myParser = new DOMParser();
			feed = myParser.parseXml(RSSFEEDURL);
			return null;

		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);

			Bundle bundle = new Bundle();
			bundle.putSerializable("feed", feed);

			// launch List activity
			Intent intent = new Intent(AnnouncementActivity.this, NewsListActivity.class);
			intent.putExtras(bundle);
			startActivity(intent);
			overridePendingTransition(0, 0); 
			

			// kill this activity
			finish();
		}

	}
	

	public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("ANNOUNCEMENTS");
    	}
	

}
