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
import java.util.ArrayList;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class HomeActivity extends Activity implements OnTouchListener {
    /** Called when the activity is first created. */
	
	private GridviewAdapter mAdapter;
	private ArrayList<String> listCountry;
	private ArrayList<Integer> listFlag;
	private GridView gridView;
	private ScrollView scrollView;
	public static Typeface MenuGridFont;
	Intent intent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        //Actionbar center
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getActionBar().setCustomView(R.layout.abs_layout);
        
        SetCustomTitle();
        SetTravelBtnFont();
        
        //Grid Button Fonts
        MenuGridFont = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Regular.otf");
        
        prepareList();
        
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);
        

        // Set custom adapter to gridview
        ExpandableHeightGridView gridView = new ExpandableHeightGridView(this);
        gridView.setVerticalScrollBarEnabled(false); 
        gridView=(ExpandableHeightGridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
        
        // Implement On Item click listener
        gridView.setOnItemClickListener(new OnItemClickListener() 
        {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				
				switch (position)
				
			    {
			    case 0:
			    	intent = new Intent(HomeActivity.this, AnnouncementActivity.class);
					startActivity(intent);

			        break;
			    case 1:
			    	intent = new Intent(HomeActivity.this, 	EmergencyActivity.class);
					startActivity(intent);
			    	
			        break;  
			    
			    case 2:
					
					    	
					break;  
					    
			
			    case 3:
			    	intent = new Intent(HomeActivity.this, AboutActivity.class);
			    	startActivity(intent);
	    	
			    	break;  

			    case 4:
			    	Intent email = new Intent(Intent.ACTION_SEND);
                    email.setData(Uri.parse("mailto:"));
                    email.setType("text/plain");
                    email.putExtra(Intent.EXTRA_EMAIL, new String[] { "info@solutionsresource.com" });
                    email.putExtra(Intent.EXTRA_SUBJECT, "User feedback from Tarlac Mobile App");
                    email.putExtra(Intent.EXTRA_TEXT, "");
                    email.setType("message/rfc822");
                    //if you want to use gmail directly.
                    //email.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
                    startActivity(email);
	    	
			    	break;  
	    
			    }
			
			}
		});
       
        gridView.setOnTouchListener(new OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    return true;
                }
                return false;
            }

        });
        
        scrollView=(ScrollView)findViewById(R.id.scrollView);
        scrollView.scrollTo(scrollView.getTop(), 0);
        gridView.setExpanded(true);
        
    }
    
    public void prepareList()
    {
    	  listCountry = new ArrayList<String>();
    	  
    	  listCountry.add("Announcements");
    	  listCountry.add("Emergency");
          listCountry.add("Office Numbers");
          listCountry.add("About");
          listCountry.add("Feedback");
         
          
          
          listFlag = new ArrayList<Integer>();
          listFlag.add(R.drawable.xml_announcement_hover);
          listFlag.add(R.drawable.xml_emergency_hover);
          listFlag.add(R.drawable.xml_officeno_hover);
          listFlag.add(R.drawable.xml_about_hover);
          listFlag.add(R.drawable.xml_feedback_hover);
          
    }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
	
	 public void SetCustomTitle(){
		    TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
		    textViewTitle.setText("WELCOME");
		    Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Bold.otf");
		    textViewTitle.setTypeface(tf);
		    }
	 
	 public void SetTravelBtnFont(){

		 	TextView textViewTitle = (TextView) findViewById(R.id.txttravel);
		    Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue Bold.otf");
		    textViewTitle.setTypeface(tf);

	 }
	 
	 public void showMap(View view) {
	        Intent intent = new Intent(HomeActivity.this, TravelActivity.class);
	        startActivity(intent);
	        
	    }   
}
   
