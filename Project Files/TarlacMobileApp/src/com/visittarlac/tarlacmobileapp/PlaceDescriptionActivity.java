package com.visittarlac.tarlacmobileapp;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class PlaceDescriptionActivity extends Activity {

	 TextView PlaceName;
	 TextView PlaceSnippet;
	 ImageView PlaceImage;
	 TextView PlaceDesc;
	 String placename;

	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_place_description);
		
		
		 //Actionbar center
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      	getActionBar().setCustomView(R.layout.abs_layout_with_backbtn);
      	
      	
      	ImageButton BackBtn = (ImageButton)findViewById(R.id.back_btn);
        BackBtn.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	        	 finish();
	      }
	   });
      	
      	//customfont title Bar
      	Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
        TextView tv = (TextView) findViewById(R.id.ActivityTitle);
        tv.setTypeface(tf);
        
      //customfont placename
      	Typeface tf1 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue Bold.otf");
        TextView tv1 = (TextView) findViewById(R.id.PlaceTitle);
        tv1.setTypeface(tf1);
        
      //customfont place address/snippet
      	Typeface tf2 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Regular.otf");
        TextView tv2 = (TextView) findViewById(R.id.PlaceSnippet);
        tv2.setTypeface(tf2);
        
        Typeface tf3 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Regular.otf");
        TextView tv3 = (TextView) findViewById(R.id.PlaceDescription);
        tv3.setTypeface(tf3);
        
        Typeface tf4 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
        TextView tv4 = (TextView) findViewById(R.id.TitleDesc);
        tv4.setTypeface(tf4);
        
        Typeface tf5 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
        TextView tv5 = (TextView) findViewById(R.id.TitleAdd);
        tv5.setTypeface(tf5);
        
        Typeface tf6 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
        TextView tv6 = (TextView) findViewById(R.id.TitleContact);
        tv6.setTypeface(tf6);
        
        Typeface tf7 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
        TextView tv7 = (TextView) findViewById(R.id.PlaceContact);
        tv7.setTypeface(tf7);
        
        Typeface tf8 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Regular.otf");
        TextView tv8 = (TextView) findViewById(R.id.PlaceContactPerson);
        tv8.setTypeface(tf8);
        
        
        
        
        SetCustomTitle();
		
        
        PlaceName = (TextView) findViewById(R.id.PlaceTitle);
		PlaceSnippet = (TextView) findViewById(R.id.PlaceSnippet);
		
	
	    Intent intent = getIntent();
	    String placetitle = intent.getStringExtra("placetitle");
	    String snippet = intent.getStringExtra("snippet");
	    
	    
	    PlaceName.setText(placetitle);
	    PlaceSnippet.setText(snippet);
	    
	    PlaceImage = (ImageView)findViewById(R.id.PlaceImage);  
	    
	    PlaceDesc =(TextView)findViewById(R.id.PlaceDescription);
	    

	    //Call Contact Person Button
	    Button PlaceContact = (Button)findViewById(R.id.PlaceContact);
	    PlaceContact.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         Button b = (Button)view;
	         String buttonText = b.getText().toString();
	         Intent myIntent = new Intent(Intent.ACTION_CALL);
	   		 String Num = "tel:"+buttonText;
	   		 myIntent.setData(Uri.parse(Num));
	   		 startActivity( myIntent ) ;
	      }
	   });
		    
	    
	    placename = intent.getStringExtra("placetitle"); 
	    
	    if (placename.equals("Azaya Garden Resort")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_azaya);  
	    	PlaceDesc.setText("A fusion of good food, karaoke huts, spacious events area, cozy rooms, swimming pool, and tons of adventure activities, Azaya Garden Resort is a one-stop place for your leisure and recreation.");
	    	PlaceContact.setText("123456789");
    	} 
	    
	    else if (placename.equals("Isdaan Floating Restaurant")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_isdaan);  
	    	PlaceDesc.setText("A one-of-a-kind in the Province of Tarlac, this restaurant is filled with great Filipinodishes, floating nipa huts, family entertainment and games for all ages, all in a 6-hectare floating wonderland.");
	    	PlaceContact.setSystemUiVisibility(View.INVISIBLE);
	    } 
	    
	    else if (placename.equals("JSJ Goat Farm")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_goatfarm);  
	    	PlaceDesc.setText("Uniquely located on the plains of Gerona, Tarlac, JSJ Goat Farm boasts of a technologically advanced and well-researched facility and well-bred Australian goats. Producing different types of cheese, pastillas, cajetas and fresh goat’s milk, JSJ Farm is in the market as Aussie Pure Goat’s Milk all over the country.");
	    	PlaceContact.setText("123456789");
	    } 
	    
	    else if (placename.equals("Tessie's Grill & Roasters")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_tessie);  
	    	PlaceDesc.setText("Offering lots of different food and flavors, TG&R boasts of roasted chicken and ribs that are original recipes of its proprietor. Proudly Tarlaqueño!");
	    	PlaceContact.setText("123456789");
	    } 
	    
	    else if (placename.equals("Izakaya Cowan Grill")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_izakaya_cowan);  
	    	PlaceDesc.setText("Craving for Jap? This authentic Japanese restaurant is located at the heart of Luisita Park, led by a seasoned chef specializing in Japanese cuisine.");
	    	PlaceContact.setText("123456789");
	    } 
	    else if (placename.equals("St.Josemaria Escriva Parish")) {
	    	PlaceImage.setImageResource(R.drawable.plcdesc_sjeparish);  
	    	PlaceDesc.setText("A newly constructed church along MacArthur Highway in the town of Gerona, the St. Josemaria Escriva Parish is home to St. Escriva’s true relic, the only one in Asia.");
	    	PlaceContact.setText("123456789");
	    } 
	    
	    
	}
	
	 public void SetCustomTitle(){
	    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
	    	textViewTitle.setText("INFORMATION");
	    	}
	 	
	
}
