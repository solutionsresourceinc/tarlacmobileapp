package com.visittarlac.tarlacmobileapp;


import com.visittarlac.tarlacmobileapp.R;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
 
public class EmergencyActivity extends FragmentActivity implements ActionBar.TabListener {
 
    private ViewPager viewPager;
    private ActionBar actionBar;
    private FragmentTabHost mTabHost;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        
        
        //Actionbar center
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      	getActionBar().setCustomView(R.layout.abs_layout_with_backbtn);
      	
        ImageButton BackBtn = (ImageButton)findViewById(R.id.back_btn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	        	 finish();
	      }
	   });
        
        
      	SetCustomTitle();
      	SetFonts();
      	
      	 mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
         mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

         mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Police Stations"),
             PoliceDeptFragment.class, null);
         mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Fire Stations"),
             FireDeptFragment.class, null);
       
        
    }
    
    public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("EMERGENCY HOTLINES");
    }
    
    public void SetFonts(){
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Bold.otf");
        TextView tv = (TextView) findViewById(R.id.ActivityTitle);
        tv.setTypeface(tf);
    }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
    	
 
}