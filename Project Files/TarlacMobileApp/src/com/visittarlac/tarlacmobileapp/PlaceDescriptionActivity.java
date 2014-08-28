package com.visittarlac.tarlacmobileapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class PlaceDescriptionActivity extends Activity {

	 TextView TitleContact;
	 TextView PlaceName;
	 TextView PlaceSnippet;
	 ImageView PlaceImage;
	 //TextView PlaceDesc;
	 Button PlaceContact;
	 String placename;
	 String contact;

	 
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
      	Typeface tf1 = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Bold.otf");
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
        
        
        
        
        
        
        SetCustomTitle();
		
        
        PlaceName = (TextView) findViewById(R.id.PlaceTitle);
		PlaceSnippet = (TextView) findViewById(R.id.PlaceSnippet);
		//PlaceDesc =(TextView)findViewById(R.id.PlaceDescription);
		TitleContact=(TextView)findViewById(R.id.TitleContact);
		TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.PlaceDescription);
		
		
	
	    Intent intent = getIntent();
	    String placetitle = intent.getStringExtra("placetitle");
	    String snippet = intent.getStringExtra("snippet");
	    
	    
	    PlaceName.setText(placetitle);
	    PlaceSnippet.setText(snippet);
	    

	    //Call Contact Person Button
	    PlaceContact = (Button)findViewById(R.id.PlaceContact);
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
		    
	    

    	ArrayList<String> nameList = new ArrayList<String>();
    	ArrayList<String> addressList = new ArrayList<String>();
    	ArrayList<String> descriptionList = new ArrayList<String>();
    	ArrayList<String> imageList = new ArrayList<String>();
    	ArrayList<String> contactnoList = new ArrayList<String>();
    	
    	

        
		try {
			JSONObject obj;
			obj = new JSONObject(loadJSONFile());
			JSONArray m_jArry = obj.getJSONArray("Places");
			for (int i = 0; i < m_jArry.length(); i++) {
				JSONObject jo_inside = m_jArry.getJSONObject(i);
				String name_value = jo_inside.getString("name");
				String address_value = jo_inside.getString("address");
				String description_value = jo_inside.getString("description");
				String image_value = jo_inside.getString("image");
				String mobilenumber_value = jo_inside.getString("contact_no");
				
				
				
				nameList.add(name_value);
				addressList.add(address_value);
				descriptionList.add(description_value);
				imageList.add(image_value);
				contactnoList.add(mobilenumber_value);
			
				
			}

			for(int i=0;i<nameList.size();i++){
				
				
				if (nameList.get(i).equals(placetitle)){
					
						PlaceImage = (ImageView)findViewById(R.id.PlaceImage);
						
						JSONObject jo_inside = m_jArry.getJSONObject(i);
						String image_value = jo_inside.getString("image");
						String resName = image_value.split("\\.")[2]; // remove the 'R.drawable.' prefix
						int resId = getResources().getIdentifier(resName, "drawable", getPackageName());
					    Drawable image = getResources().getDrawable(resId);
						PlaceImage.setImageDrawable(image);
						txtViewEx.setText(descriptionList.get(i), true);
						PlaceContact.setText(contactnoList.get(i));

				}
				
				contact =PlaceContact.getText().toString();
				if (contact.equals("none")){
					
					TitleContact.setVisibility(View.INVISIBLE);
					PlaceContact.setVisibility(View.INVISIBLE);
					
				}
			}
			
    		} catch (JSONException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

	}
	
	 public void SetCustomTitle(){
	    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
	    	textViewTitle.setText("INFORMATION");
	    	}
	 
	 public String loadJSONFile() {
	        String json = null;
	        try {

	            InputStream is = getAssets().open("map_location.json");

	            int size = is.available();

	            byte[] buffer = new byte[size];

	            is.read(buffer);

	            is.close();

	            json = new String(buffer,"UTF-8");


	        } catch (IOException ex) {
	            ex.printStackTrace();
	            return null;
	        }
	        return json;

	    }
}
