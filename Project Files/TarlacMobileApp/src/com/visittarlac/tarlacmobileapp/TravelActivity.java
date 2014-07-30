package com.visittarlac.tarlacmobileapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;




import android.widget.Toast;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class TravelActivity extends Activity implements OnClickListener {

	GoogleMap map;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        
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
        
        //Parse JsonObject
        JSONParser();
        
        //Button Filters
        ImageButton btn1 = (ImageButton)findViewById(R.id.btnvisit);
        btn1.setOnClickListener(this);

        ImageButton btn2 = (ImageButton)findViewById(R.id.btndine);
        btn2.setOnClickListener(this);

        ImageButton btn3 = (ImageButton)findViewById(R.id.btnchill);
        btn3.setOnClickListener(this);
        
        ImageButton btn4 = (ImageButton)findViewById(R.id.btnshop);
        btn4.setOnClickListener(this);
        
        ImageButton btn5 = (ImageButton)findViewById(R.id.btnref);
        btn5.setOnClickListener(this);
        
        ImageButton btn6 = (ImageButton)findViewById(R.id.btnlist);
        btn6.setOnClickListener(this);
      
        
        
        

        //Set Custom InfoWindow
        map.setInfoWindowAdapter(new InfoWindowAdapter() {
        
        @Override
        public View getInfoWindow(Marker arg0) {
             
            return null;
        }
         
        @Override
        public View getInfoContents(Marker marker) {
            View myContentsView = getLayoutInflater().inflate(R.layout.map_info, null);
            
            TextView tvTitle = ((TextView)myContentsView.findViewById(R.id.title));
            tvTitle.setText(marker.getTitle());
            
            TextView tvSnippet = ((TextView)myContentsView.findViewById(R.id.snippet));
            tvSnippet.setText(marker.getSnippet());
            
            TextView infoSnippet = (TextView)myContentsView.findViewById(R.id.moreinfo);
            infoSnippet.setText("Click for more details.");
            
            
            
            
            return myContentsView;
        }
    });
        
        //Open New Activity
        map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
        
        @Override
        public void onInfoWindowClick(Marker marker) {

	        Intent intent = new Intent(TravelActivity.this, PlaceDescriptionActivity.class);
	        intent.putExtra("placetitle", marker.getTitle().toString());
	        intent.putExtra("snippet", marker.getSnippet().toString());
	        startActivity(intent);
	
	        }
	    });
	  

    }

    //Filter Button Onclick Event
	public void onClick(View v) {

		ArrayList<Double> latList = new ArrayList<Double>();
    	ArrayList<Double> lngList = new ArrayList<Double>();
    	ArrayList<String> nameList = new ArrayList<String>();
    	ArrayList<String> addressList = new ArrayList<String>();
    	ArrayList<String> markerList = new ArrayList<String>();
    	
		try { 
			JSONObject obj;
			obj = new JSONObject(loadJSONFile());
			JSONArray m_jArry = obj.getJSONArray("Places");
			for (int i = 0; i < m_jArry.length(); i++) {
				JSONObject jo_inside = m_jArry.getJSONObject(i);
				String name_value = jo_inside.getString("name");
				String address_value = jo_inside.getString("address");
				String marker_value = jo_inside.getString("category");
				double lat_value = jo_inside.getDouble("lat");
				double lng_value = jo_inside.getDouble("lng");
				nameList.add(name_value);
				addressList.add(address_value);
				markerList.add(marker_value);
				latList.add(lat_value);
				lngList.add(lng_value);
				
			}

			
    		} catch (JSONException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
		

		switch (v.getId()) {

		case R.id.btnvisit:
			
			map.clear();
    		for(int i=0;i<nameList.size();i++){
    			
    			
    			if (markerList.get(i).equals("visit")){
    			
    				map.addMarker(new MarkerOptions()
    				 .title(nameList.get(i))
    				 .snippet(addressList.get(i))
    				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_places))
    				 .position(new LatLng(latList.get(i), lngList.get(i))));
    			}};
    			map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latList.get(0), lngList.get(0)), 20));
    			map.animateCamera(CameraUpdateFactory.zoomTo(10));
			
			
			break;

		case R.id.btndine:
			
			map.clear();
			for(int i=0;i<nameList.size();i++){
    			
    			
				if (markerList.get(i).equals("dine")){
   			
   				map.addMarker(new MarkerOptions()
   				 .title(nameList.get(i))
   				 .snippet(addressList.get(i))
   				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_restaurant))
   				 .position(new LatLng(latList.get(i), lngList.get(i))));
	   			}};
	   			map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latList.get(0), lngList.get(0)), 20));
	   			map.animateCamera(CameraUpdateFactory.zoomTo(10));
				
			
			break;

		case R.id.btnchill:
			
				map.clear();
				for(int i=0;i<nameList.size();i++){
    			
    			
				if (markerList.get(i).equals("chill")){
   			
   				map.addMarker(new MarkerOptions()
   				 .title(nameList.get(i))
   				 .snippet(addressList.get(i))
   				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_chill))
   				 .position(new LatLng(latList.get(i), lngList.get(i))));
	   			}};
	   			map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latList.get(0), lngList.get(0)), 20));
	   			map.animateCamera(CameraUpdateFactory.zoomTo(10));
				
			break;
			

		case R.id.btnshop:
			
			Toast.makeText(getApplicationContext(), 
                    "Empty.", Toast.LENGTH_SHORT).show();
			break;

			
		case R.id.btnref:
			
			JSONParser();
			
			break;
		
		
		case R.id.btnlist:
			
			Intent intent = new Intent(TravelActivity.this, ListOfPlacesActivity.class);
			startActivity(intent);
			
			
			break;
			
		
	

		default:
			break;
		}


        
    }//end onView
	
	
	
	

	public void JSONParser(){
		
		ArrayList<Double> latList = new ArrayList<Double>();
    	ArrayList<Double> lngList = new ArrayList<Double>();
    	ArrayList<String> nameList = new ArrayList<String>();
    	ArrayList<String> addressList = new ArrayList<String>();
    	ArrayList<String> markerList = new ArrayList<String>();
    	
    	map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
   
        
        
		try {
			JSONObject obj;
			obj = new JSONObject(loadJSONFile());
			JSONArray m_jArry = obj.getJSONArray("Places");
			for (int i = 0; i < m_jArry.length(); i++) {
				JSONObject jo_inside = m_jArry.getJSONObject(i);
				String name_value = jo_inside.getString("name");
				String address_value = jo_inside.getString("address");
				String marker_value = jo_inside.getString("category");
				double lat_value = jo_inside.getDouble("lat");
				double lng_value = jo_inside.getDouble("lng");
				nameList.add(name_value);
				addressList.add(address_value);
				markerList.add(marker_value);
				latList.add(lat_value);
				lngList.add(lng_value);
				
			}

			
    		} catch (JSONException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

	
		for(int i=0;i<nameList.size();i++){
			
			
			if (markerList.get(i).equals("visit")){
			
				map.addMarker(new MarkerOptions()
				 .title(nameList.get(i))
				 .snippet(addressList.get(i))
				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_places))
				 .position(new LatLng(latList.get(i), lngList.get(i))));
			}
			 
		   if (markerList.get(i).equals("dine")){
	        	 
	        	map.addMarker(new MarkerOptions()
				 .title(nameList.get(i))
				 .snippet(addressList.get(i))
				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_restaurant))
				 .position(new LatLng(latList.get(i), lngList.get(i))));

		   
		   }
		   
		   if (markerList.get(i).equals("chill")){
	        	 
	        	map.addMarker(new MarkerOptions()
				 .title(nameList.get(i))
				 .snippet(addressList.get(i))
				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_chill))
				 .position(new LatLng(latList.get(i), lngList.get(i))));

		   
		   }
		   

		map.setMyLocationEnabled(true);
		// Move the camera instantly to mylatlng1 with a zoom of 15.
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latList.get(0), lngList.get(0)), 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10));
		
		
		}
			

		
	}
	
        
	public String loadJSONFile() {
		String jsonStr = null;
		try {

			InputStream is = getAssets().open("map_location.json");

			int size = is.available();

			byte[] buffer = new byte[size];

			is.read(buffer);

			is.close();

			jsonStr = new String(buffer, "UTF-8");

		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
		return jsonStr;
	}
	
	
	
	
    public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("TRAVEL SPOTS");
    	}
    
    
    
    public void ShowList(View view) {
		Intent intent = new Intent(TravelActivity.this, ListOfPlacesActivity.class);
		startActivity(intent);
		
	}	
    
    
    
	
    
}