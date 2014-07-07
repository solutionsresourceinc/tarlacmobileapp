package com.visittarlac.tarlacmobileapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class TravelActivity extends Activity {
	
	private int dine , visit , chill;
	GoogleMap map;
	String placename;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        
        //Actionbar center
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      	getActionBar().setCustomView(R.layout.abs_layout_with_backbtn);
    	
      	
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
        
        
        
     
        SetCustomTitle();
        
        dine=R.drawable.marker_restaurant;
        visit=R.drawable.marker_places;
        chill=R.drawable.marker_chill;

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        
      
        
        //Location of tarlac
        LatLng Tarlac = new LatLng( 15.475245, 120.593438);
        
        
        //Places to dine
       
        LatLng TessieGrill = new LatLng(15.477523, 120.595734);
        LatLng IsdaanFloatingResto = new LatLng(15.593400, 120.609021);
        LatLng IzakayaCowanGrill = new LatLng(15.432326, 120.599400);
        
        //Places to visit
        LatLng NinoyAquinoAncestralHouse = new LatLng(15.324247, 120.657152);
        LatLng MonasteriodeTarlac = new LatLng(15.436534, 120.431238);
        LatLng TarlacCapitol = new LatLng(15.480356, 120.588166);
        LatLng SanSebastianCathedral = new LatLng(15.487714, 120.588054);
        LatLng CapasNationalShrine = new LatLng(15.349029, 120.545254);
        LatLng JSJGoatFarm = new LatLng(15.631385, 120.599620);
        LatLng JosemariaParish = new LatLng(15.622769, 120.594722);
        
        //Places to chill
        LatLng AsiaTenHotel = new LatLng(15.470614, 120.596102);
        LatLng CentralParkHotel = new LatLng(15.439120, 120.604581);
        LatLng LaMajaricaHotel = new LatLng(15.483420, 120.595372);
        LatLng MicrotelInnAndSuites = new LatLng(15.439835, 120.602244);
        LatLng StarHomesHotelApartment = new LatLng(15.466169, 120.579590);
        LatLng GrandLSquareResidences = new LatLng(15.458413, 120.599078);
        LatLng AzayaGardenResort = new LatLng(15.405929, 120.599366);
        LatLng SunGardenHotel = new LatLng(15.485483, 120.597522);
        LatLng LuisitaGolf = new LatLng(15.435215, 120.621380);
       
        

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Tarlac, 10));

        //Places to Dine Map Markers
        map.addMarker(new MarkerOptions()
        .title("Tessie's Grill & Roasters")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(dine))
        .position(TessieGrill));
        
        map.addMarker(new MarkerOptions()
        .title("Isdaan Floating Restaurant")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(dine))
        .position(IsdaanFloatingResto));
        
        map.addMarker(new MarkerOptions()
        .title("Izakaya Cowan Grill")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(dine))
        .position(IzakayaCowanGrill));
        
        
        
        
        //Places to Visit Map Markers
        map.addMarker(new MarkerOptions()
        .title("Ninoy Aquino Ancestral House")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(NinoyAquinoAncestralHouse));
        
        map.addMarker(new MarkerOptions()
        .title("Monasterio de Tarlac")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(MonasteriodeTarlac));
        
        map.addMarker(new MarkerOptions()
        .title("Tarlac Provincial Capitol")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(TarlacCapitol));
        
        map.addMarker(new MarkerOptions()
        .title("San Sebastian Cathedral")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(SanSebastianCathedral));
        
        map.addMarker(new MarkerOptions()
        .title("Capas National Shrine")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(CapasNationalShrine));
        
        map.addMarker(new MarkerOptions()
        .title("JSJ Goat Farm")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(JSJGoatFarm));
        
        map.addMarker(new MarkerOptions()
        .title("St.Josemaria Escriva Parish")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(visit))
        .position(JosemariaParish));
        
        
        
        //Places to chill Map Markers
        map.addMarker(new MarkerOptions()
        .title("Asiaten Hotel")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(AsiaTenHotel));
        
        map.addMarker(new MarkerOptions()
        .title("Central Park Hotel")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(CentralParkHotel));
        
        map.addMarker(new MarkerOptions()
        .title("La Majarica Hotel")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(LaMajaricaHotel));
        
        map.addMarker(new MarkerOptions()
        .title("Microtel Inn and Suites")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(MicrotelInnAndSuites));
        
        map.addMarker(new MarkerOptions()
        .title("Star Homes Hotel & Apartment")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(StarHomesHotelApartment));
        
        map.addMarker(new MarkerOptions()
        .title("Grand L Square Hotel")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position( GrandLSquareResidences ));
        
        map.addMarker(new MarkerOptions()
        .title("Azaya Garden Resort")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(AzayaGardenResort));
        
        map.addMarker(new MarkerOptions()
        .title("Sun Garden Hotel")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position( SunGardenHotel));
        
        map.addMarker(new MarkerOptions()
        .title("The Luisita Golf and Country Club")
        .snippet("Address goes here")
        .icon(BitmapDescriptorFactory.fromResource(chill))
        .position(LuisitaGolf));
        
        
        
        
        //Map Design
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    
        
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
    
    
    public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("TRAVEL SPOTS");
    	}
}