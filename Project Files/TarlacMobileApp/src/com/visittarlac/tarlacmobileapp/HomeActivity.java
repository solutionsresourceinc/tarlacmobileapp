package com.visittarlac.tarlacmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class HomeActivity extends Activity {

	Button buttonSend;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		//Actionbar center
		getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getActionBar().setCustomView(R.layout.abs_layout);
		SetCustomTitle();
		//Custom Font
		SetFonts();
		
				//Send Email using Gmail
				buttonSend=(Button)findViewById(R.id.FeedbackBtn);
				buttonSend.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					  
					  
				      Intent email = new Intent(Intent.ACTION_SEND);
				      email.setData(Uri.parse("mailto:"));
				      email.setType("text/plain");
				      email.putExtra(Intent.EXTRA_EMAIL, new String[] { "ryanpalado11@gmail.com" });
				      email.putExtra(Intent.EXTRA_SUBJECT, "User feedback from Tarlac Mobile App");
				      email.putExtra(Intent.EXTRA_TEXT, "");
				      email.setType("message/rfc822");
				      //if you want to use gmail directly.
					  //email.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
					  startActivity(email);
		 
					}
				});
		
		
	}
	
	public void SetCustomTitle(){
	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
	textViewTitle.setText("WELCOME");
	}
	
	public void SetFonts(){
		
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Bold.otf");
        TextView tv = (TextView) findViewById(R.id.ActivityTitle);
        tv.setTypeface(tf);
        
        //Button Fonts
        Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv1 = (TextView) findViewById(R.id.AnnounceTitle);
        tv1.setTypeface(tf1);
        
        Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv2 = (TextView) findViewById(R.id.CalendarTitle);
        tv2.setTypeface(tf2);
        
        Typeface tf3 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv3 = (TextView) findViewById(R.id.EmergencyTitle);
        tv3.setTypeface(tf3);
        
        Typeface tf4 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv4 = (TextView) findViewById(R.id.FeedbackTitle);
        tv4.setTypeface(tf4);
        
        Typeface tf5 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv5 = (TextView) findViewById(R.id.JobTitle);
        tv5.setTypeface(tf5);
        
        Typeface tf6 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv6 = (TextView) findViewById(R.id.OfficeTitle);
        tv6.setTypeface(tf6);
        
        Typeface tf7 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv7 = (TextView) findViewById(R.id.ServicesTitle);
        tv7.setTypeface(tf7);
        
        Typeface tf8 = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue Bold.otf");
        TextView tv8 = (TextView) findViewById(R.id.TravelTitle);
        tv8.setTypeface(tf8);
        
        Typeface tf9 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
        TextView tv9 = (TextView) findViewById(R.id.AboutTitle);
        tv9.setTypeface(tf9);
	}
	
	public void showMap(View view) {
		Intent intent = new Intent(HomeActivity.this, TravelActivity.class);
		startActivity(intent);
		
	}	
	
	public void showHotlines(View view) {
		Intent intent = new Intent(HomeActivity.this, EmergencyActivity.class);
		startActivity(intent);
		
	}	
	
}
