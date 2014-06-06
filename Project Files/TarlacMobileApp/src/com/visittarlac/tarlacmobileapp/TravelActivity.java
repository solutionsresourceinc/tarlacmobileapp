package com.visittarlac.tarlacmobileapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TravelActivity extends FragmentActivity {
    private GoogleMap googleMap;
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        FragmentManager fragmentManager = getSupportFragmentManager();
        SupportMapFragment mapFragment =  (SupportMapFragment)
            fragmentManager.findFragmentById(R.id.map);
        googleMap = mapFragment.getMap();

        
        LatLng tarlac = new LatLng(15.475467,120.596353);

        googleMap.setMyLocationEnabled(true);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tarlac, 13));

        googleMap.addMarker(new MarkerOptions()
                .title("Tarlac")
                .snippet("One of the most attractive province in the Philippines.")
                .position(tarlac));

    }


}
