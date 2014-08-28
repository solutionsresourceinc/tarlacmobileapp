package com.visittarlac.tarlacmobileapp;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
 
public class EmergencyActivity extends FragmentActivity implements ActionBar.TabListener{
 
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

         Drawable PoliceSelector = getResources().getDrawable(R.drawable.xml_tabpolice_hover);
         Drawable FireSelector = getResources().getDrawable(R.drawable.xml_tabfire_hover);
         Drawable HospitalSelector = getResources().getDrawable(R.drawable.xml_tabhospital_hover);
         
         mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("", PoliceSelector),
             PoliceDeptFragment.class, null);
         mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("", FireSelector),
             FireDeptFragment.class, null);
         mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("", HospitalSelector),
                 HospitalFragment.class, null);
         
         for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
        	 
        	 mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.xml_tab_indicator_holo);
        	 
             //TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
             //tv.setTextSize(23);
         }
       

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
		// TODO Auto-generated method stubs
		
	
		
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