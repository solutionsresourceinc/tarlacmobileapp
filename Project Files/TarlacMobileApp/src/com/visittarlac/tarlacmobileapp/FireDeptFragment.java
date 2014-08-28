package com.visittarlac.tarlacmobileapp;

import com.visittarlac.tarlacmobileapp.R;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FireDeptFragment extends Fragment implements OnClickListener {
 
	TextView ftv1,ftv2,ftv3,ftv4,ftv5,ftv6,ftv7,ftv8,ftv9,ftv10,ftv11,ftv12,ftv13,ftv14,ftv15;
	
	Button fbtn1,fbtn2,fbtn3,fbtn4,fbtn5,fbtn6,fbtn7,fbtn8,fbtn9,fbtn10,
	fbtn11,fbtn12,fbtn13,fbtn14,fbtn15,fbtn16;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	View View = inflater.inflate(R.layout.fragment_firedept, container, false);

    	 ftv1 = (TextView) View.findViewById(R.id.ftv1);
         Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv1.setTypeface(font); 

         ftv2 = (TextView) View.findViewById(R.id.ftv2);
         Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv2.setTypeface(font1);
         
         ftv3 = (TextView) View.findViewById(R.id.ftv3);
         Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv3.setTypeface(font2);
         
         ftv4 = (TextView) View.findViewById(R.id.ftv4);
         Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv4.setTypeface(font3);
         
         ftv5 = (TextView) View.findViewById(R.id.ftv5);
         Typeface font4= Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv5.setTypeface(font4);
         
         ftv6 = (TextView) View.findViewById(R.id.ftv6);
         Typeface font5 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv6.setTypeface(font5);
         
         ftv7 = (TextView) View.findViewById(R.id.ftv7);
         Typeface font6 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv7.setTypeface(font6);
         
         ftv8 = (TextView) View.findViewById(R.id.ftv8);
         Typeface font7 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv8.setTypeface(font7);
         
         ftv9 = (TextView) View.findViewById(R.id.ftv9);
         Typeface font8 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv9.setTypeface(font8);
         
         ftv10 = (TextView) View.findViewById(R.id.ftv10);
         Typeface font9 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv10.setTypeface(font9);
         
         ftv11 = (TextView) View.findViewById(R.id.ftv11);
         Typeface font10 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv11.setTypeface(font10);
         
         ftv12 = (TextView) View.findViewById(R.id.ftv12);
         Typeface font11 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv12.setTypeface(font11);
         
         ftv13 = (TextView) View.findViewById(R.id.ftv13);
         Typeface font12 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv13.setTypeface(font12);
         
         ftv14 = (TextView) View.findViewById(R.id.ftv14);
         Typeface font13 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv14.setTypeface(font13);
         
         ftv15 = (TextView) View.findViewById(R.id.ftv15);
         Typeface font14 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ftv15.setTypeface(font14);
      	      
	   
         fbtn1=(Button)View.findViewById(R.id.callTCFS1);
         fbtn2=(Button)View.findViewById(R.id.callTCFS2);
         fbtn3=(Button)View.findViewById(R.id.callOPFM);
         fbtn4=(Button)View.findViewById(R.id.callBamban);
         
         fbtn5=(Button)View.findViewById(R.id.callCamiling);
         fbtn6=(Button)View.findViewById(R.id.callCapas);
         
         fbtn7=(Button)View.findViewById(R.id.callConcepcion);
         
         fbtn8=(Button)View.findViewById(R.id.callGerona);
         fbtn9=(Button)View.findViewById(R.id.callLaPaz);
         
         fbtn10=(Button)View.findViewById(R.id.callMayantoc);
         
         fbtn11=(Button)View.findViewById(R.id.callMoncada);
         fbtn12=(Button)View.findViewById(R.id.callPaniqui);
         
         fbtn13=(Button)View.findViewById(R.id.callRamos);
         fbtn14=(Button)View.findViewById(R.id.callSanJose);
         fbtn15=(Button)View.findViewById(R.id.callSantaIgnacia);
         fbtn16=(Button)View.findViewById(R.id.callVictoria);
         
        
         
         fbtn1.setOnClickListener(this);
         fbtn2.setOnClickListener(this);
         fbtn3.setOnClickListener(this);
         fbtn4.setOnClickListener(this);
         fbtn5.setOnClickListener(this);
         fbtn6.setOnClickListener(this);
         fbtn7.setOnClickListener(this);
         fbtn8.setOnClickListener(this);
         fbtn9.setOnClickListener(this);
         fbtn10.setOnClickListener(this);
         fbtn11.setOnClickListener(this);
         fbtn12.setOnClickListener(this);
         fbtn13.setOnClickListener(this);
         fbtn14.setOnClickListener(this);
         fbtn15.setOnClickListener(this);
         fbtn16.setOnClickListener(this);
	    
	    return View;
        
	      
    }
 
    public void onClick(View View) {
      	 Intent callIntent = new Intent(Intent.ACTION_CALL);
      	 
           switch(View.getId()){
           
               case R.id.callTCFS1:
   				callIntent.setData(Uri.parse("tel:982‐1356"));
   				startActivity(callIntent);
               break;
               
               case R.id.callTCFS2:
      				callIntent.setData(Uri.parse("tel:0929-584-0885"));
      				startActivity(callIntent);
                  break;
                  
               case R.id.callOPFM:
    				callIntent.setData(Uri.parse("tel:491-0475"));
    				startActivity(callIntent);
                break;
                  
               case R.id.callBamban:
     				callIntent.setData(Uri.parse("tel:09097046545"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callCamiling:
     				callIntent.setData(Uri.parse("tel:0908‐2208704"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callCapas:
    				callIntent.setData(Uri.parse("tel:0929‐1088466"));
    				startActivity(callIntent);
                break;
                 
               case R.id.callConcepcion:
     				callIntent.setData(Uri.parse("tel:0933‐9492909"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callGerona:
     				callIntent.setData(Uri.parse("tel:931‐3638"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callLaPaz:
     				callIntent.setData(Uri.parse("tel:0907‐3796606"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callMayantoc:
     				callIntent.setData(Uri.parse("tel:491‐5010"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callMoncada:
     				callIntent.setData(Uri.parse("tel:606‐5432"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callPaniqui:
     				callIntent.setData(Uri.parse("tel:931‐1110"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callRamos:
     				callIntent.setData(Uri.parse("tel:491‐7670"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callSanJose:
     				callIntent.setData(Uri.parse("tel:0921‐2393617"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callSantaIgnacia:
     				callIntent.setData(Uri.parse("tel:0921‐2393617"));
     				startActivity(callIntent);
                 break;
                 
               case R.id.callVictoria:
     				callIntent.setData(Uri.parse("tel:930‐0837"));
     				startActivity(callIntent);
                 break;
                 
  
           }};

}

