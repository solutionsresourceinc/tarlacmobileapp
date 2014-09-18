package com.visittarlac.tarlacmobileapp;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);

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
        
        
        TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		txtViewEx.setText(getResources().getString(R.string.activity_about_content), true); // true: enables justification
		Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Regular.otf");
		txtViewEx.setTypeface(tf1);
		
		TextViewEx txtViewEx1 = (TextViewEx) findViewById(R.id.tvtitle);
		Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Bold.otf");
		txtViewEx1.setTypeface(tf2);
		
		ImageView ivAbout =(ImageView)findViewById(R.id.ivTarlac);
		ivAbout.setImageResource(R.drawable.plcdesc_tarlac);
        
        	
	}
	
	 public void SetCustomTitle(){
	    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
	    	textViewTitle.setText("ABOUT");
	    	}
}
