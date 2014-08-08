package com.visittarlac.tarlacmobileapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SelectedPlaceActivity extends Activity {

	GoogleMap map;
	Marker marker;
	View infoWindow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selected_place);
		
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
 
        
        Intent intent = getIntent();
	    String selected = intent.getStringExtra("selected");
	  
	    
        
        ArrayList<Double> latList = new ArrayList<Double>();
    	ArrayList<Double> lngList = new ArrayList<Double>();
    	ArrayList<String> nameList = new ArrayList<String>();
    	ArrayList<String> addressList = new ArrayList<String>();
    	ArrayList<String> markerList = new ArrayList<String>();
    	ArrayList<String> categoryList = new ArrayList<String>();
    	
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
				String category = jo_inside.getString("category");
				nameList.add(name_value);
				addressList.add(address_value);
				markerList.add(marker_value);
				latList.add(lat_value);
				lngList.add(lng_value);
				categoryList.add(category);

			}

			
    		} catch (JSONException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

	
		for(int i=0;i<nameList.size();i++){
			

			
			//Set Custom InfoWindow
	        map.setInfoWindowAdapter(new InfoWindowAdapter() {
	
	        	
	        @Override
	        public View getInfoWindow(Marker marker) {
	        	
	        	
	        	
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
	
		        Intent intent = new Intent(SelectedPlaceActivity.this, PlaceDescriptionActivity.class);
		        intent.putExtra("placetitle", marker.getTitle().toString());
		        intent.putExtra("snippet", marker.getSnippet().toString());
		        startActivity(intent);
		
		        }

		    });
			

			
			if (nameList.get(i).equals(selected)){
				
				final LatLng CENTER = new LatLng(latList.get(i), lngList.get(i));
			
				 marker = map.addMarker(new MarkerOptions()
				 .title(nameList.get(i))
				 .snippet(addressList.get(i))
				 .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_location))
				 .position(new LatLng(latList.get(i), lngList.get(i))));
				 marker.showInfoWindow();
				 
				map.moveCamera(CameraUpdateFactory.newLatLng(CENTER));
				final int zoom = 10;
                map.animateCamera(CameraUpdateFactory.zoomTo(zoom), null);

			}
				//map.animateCamera(CameraUpdateFactory.zoomTo(14));
		}
		
	}
	

    public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("PLACE LOCATION");
    	}
    
    public String loadJSONFile() {
        String json = null;
        try {

            InputStream is = getAssets().open("map_location.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
    
    public void setMarkerWithInfoWindow(Marker marker, View infoWindow) {
        this.marker = marker;
        this.infoWindow = infoWindow;
    }
}
