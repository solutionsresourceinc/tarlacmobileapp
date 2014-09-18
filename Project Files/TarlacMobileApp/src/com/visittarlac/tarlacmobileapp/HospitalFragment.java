package com.visittarlac.tarlacmobileapp;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
public class HospitalFragment extends Fragment implements OnClickListener {
 
	TextView htv1;
	
	Button hbtn1,hbtn2;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	View View = inflater.inflate(R.layout.fragment_hospital, container, false);

    	
    	htv1 = (TextView) View.findViewById(R.id.htv1);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
        htv1.setTypeface(font); 
    	
        
        hbtn1=(Button)View.findViewById(R.id.callPDRRMC1);
        hbtn2=(Button)View.findViewById(R.id.callPDRRMC2);
    
        hbtn1.setOnClickListener(this);
        hbtn2.setOnClickListener(this);
        
        
        return View;
    }
    
    public void onClick(View View) {
      	 Intent callIntent = new Intent(Intent.ACTION_CALL);
      	 
           switch(View.getId()){
           
               case R.id.callPDRRMC1:
   				callIntent.setData(Uri.parse("tel:628-0584"));
   				startActivity(callIntent);
               break;
               
               case R.id.callPDRRMC2:
              	 callIntent.setData(Uri.parse("tel:628-0586"));
   					startActivity(callIntent);
               break;

           }};

}