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
 
public class PoliceDeptFragment extends Fragment implements OnClickListener {
 
	TextView ptv1,ptv2,ptv3,ptv4,ptv5,ptv6,ptv7,ptv8,ptv9,ptv10,ptv11,ptv12,ptv13,ptv14,ptv15,ptv16,ptv17
	,ptv18,ptv19,ptv20,ptv21;
	
	Button pbtn1,pbtn2,pbtn3,pbtn4,pbtn5,pbtn6,pbtn7,pbtn8,pbtn9,pbtn10,
	pbtn11,pbtn12,pbtn13,pbtn14,pbtn15,pbtn16,pbtn17,pbtn18,pbtn19,pbtn20,
	pbtn21,pbtn22,pbtn23,pbtn24,pbtn25,pbtn26,pbtn27,pbtn28,pbtn29,pbtn30,
	pbtn31,pbtn32,pbtn33,pbtn34,pbtn35,pbtn36,pbtn37,pbtn38;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	View View = inflater.inflate(R.layout.fragment_policedept, container, false);
    	
    	
    	 ptv1 = (TextView) View.findViewById(R.id.ptv1);
         Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv1.setTypeface(font); 

         ptv2 = (TextView) View.findViewById(R.id.ptv2);
         Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv2.setTypeface(font1);
         
         ptv3 = (TextView) View.findViewById(R.id.ptv3);
         Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv3.setTypeface(font2);
         
         ptv4 = (TextView) View.findViewById(R.id.ptv4);
         Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv4.setTypeface(font3);
         
         ptv5 = (TextView) View.findViewById(R.id.ptv5);
         Typeface font4= Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv5.setTypeface(font4);
         
         ptv6 = (TextView) View.findViewById(R.id.ptv6);
         Typeface font5 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv6.setTypeface(font5);
         
         ptv7 = (TextView) View.findViewById(R.id.ptv7);
         Typeface font6 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv7.setTypeface(font6);
         
         //ptv8 = (TextView) View.findViewById(R.id.ptv8);
         //Typeface font7 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         //ptv8.setTypeface(font7);
         
         ptv9 = (TextView) View.findViewById(R.id.ptv9);
         Typeface font8 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv9.setTypeface(font8);
         
         ptv10 = (TextView) View.findViewById(R.id.ptv10);
         Typeface font9 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv10.setTypeface(font9);
         
         ptv11 = (TextView) View.findViewById(R.id.ptv11);
         Typeface font10 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv11.setTypeface(font10);
         
         ptv12 = (TextView) View.findViewById(R.id.ptv12);
         Typeface font11 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv12.setTypeface(font11);
         
         ptv13 = (TextView) View.findViewById(R.id.ptv13);
         Typeface font12 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv13.setTypeface(font12);
         
         ptv14 = (TextView) View.findViewById(R.id.ptv14);
         Typeface font13 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv14.setTypeface(font13);
         
         ptv15 = (TextView) View.findViewById(R.id.ptv15);
         Typeface font14 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv15.setTypeface(font14);
         
         ptv16 = (TextView) View.findViewById(R.id.ptv16);
         Typeface font15 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv16.setTypeface(font15);
         
         ptv17 = (TextView) View.findViewById(R.id.ptv17);
         Typeface font16 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv17.setTypeface(font16);
         
         ptv18 = (TextView) View.findViewById(R.id.ptv18);
         Typeface font17 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv18.setTypeface(font17);
         
         ptv19 = (TextView) View.findViewById(R.id.ptv19);
         Typeface font18 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv19.setTypeface(font18);
         
         ptv20 = (TextView) View.findViewById(R.id.ptv20);
         Typeface font19 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv20.setTypeface(font19);
         
         ptv21 = (TextView) View.findViewById(R.id.ptv21);
         Typeface font20 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ProximaNova-Bold.otf");
         ptv21.setTypeface(font20);
         
         
         //CALL INTENT//////////CALLS THE PHONE NUMBER 
      	      
         pbtn1=(Button)View.findViewById(R.id.callTCPS1);
         pbtn2=(Button)View.findViewById(R.id.callTCPS2);
         pbtn3=(Button)View.findViewById(R.id.callTCPS3);
         pbtn4=(Button)View.findViewById(R.id.callTCPS4);
         
         pbtn5=(Button)View.findViewById(R.id.callTCPSub1);
         pbtn6=(Button)View.findViewById(R.id.callTCPSub2);
         
         pbtn7=(Button)View.findViewById(R.id.callNBI);
         
         pbtn8=(Button)View.findViewById(R.id.callAnao1);
         pbtn9=(Button)View.findViewById(R.id.callAnao2);
         
         pbtn10=(Button)View.findViewById(R.id.callBamban);
         
         pbtn11=(Button)View.findViewById(R.id.callCamiling1);
         pbtn12=(Button)View.findViewById(R.id.callCamiling2);
         
         pbtn13=(Button)View.findViewById(R.id.callCapas1);
         pbtn14=(Button)View.findViewById(R.id.callCapas2);
         pbtn15=(Button)View.findViewById(R.id.callCapas3);
         pbtn16=(Button)View.findViewById(R.id.callConcepcion1);
         
         pbtn17=(Button)View.findViewById(R.id.callConcepcion2);
         
         pbtn18=(Button)View.findViewById(R.id.callConcepcion3);
         pbtn19=(Button)View.findViewById(R.id.callGerona1);
         
         pbtn20=(Button)View.findViewById(R.id.callGerona2);
         
         pbtn21=(Button)View.findViewById(R.id.callLaPaz1);
         pbtn22=(Button)View.findViewById(R.id.callLaPaz2);
         pbtn23=(Button)View.findViewById(R.id.callMayantoc);
         pbtn24=(Button)View.findViewById(R.id.callMoncada1);
         
         pbtn25=(Button)View.findViewById(R.id.callMoncada2);
         pbtn26=(Button)View.findViewById(R.id.callPaniqui1);
         
         pbtn27=(Button)View.findViewById(R.id.callPaniqui2);
         
         pbtn28=(Button)View.findViewById(R.id.callPura);
         pbtn29=(Button)View.findViewById(R.id.callRamos);
         
         pbtn30=(Button)View.findViewById(R.id.callSClemente1);
         
         pbtn31=(Button)View.findViewById(R.id.callSClemente2);
         pbtn32=(Button)View.findViewById(R.id.callSJose);
         pbtn33=(Button)View.findViewById(R.id.callSManuel1);
         pbtn34=(Button)View.findViewById(R.id.callSManuel2);
         
         pbtn35=(Button)View.findViewById(R.id.callSIgnacia1);
         pbtn36=(Button)View.findViewById(R.id.callSIgnacia2);
         
         pbtn37=(Button)View.findViewById(R.id.callVictoria1);
         
         pbtn38=(Button)View.findViewById(R.id.callVictoria2);
     

         pbtn1.setOnClickListener(this);
         pbtn2.setOnClickListener(this);
         pbtn3.setOnClickListener(this);
         pbtn4.setOnClickListener(this);
         pbtn5.setOnClickListener(this);
         pbtn6.setOnClickListener(this);
         pbtn7.setOnClickListener(this);
         pbtn8.setOnClickListener(this);
         pbtn9.setOnClickListener(this);
         pbtn10.setOnClickListener(this);
         pbtn11.setOnClickListener(this);
         pbtn12.setOnClickListener(this);
         pbtn13.setOnClickListener(this);
         pbtn14.setOnClickListener(this);
         pbtn15.setOnClickListener(this);
         pbtn16.setOnClickListener(this);
         pbtn17.setOnClickListener(this);
         pbtn18.setOnClickListener(this);
         pbtn19.setOnClickListener(this);
         pbtn20.setOnClickListener(this);
         pbtn21.setOnClickListener(this);
         pbtn22.setOnClickListener(this);
         pbtn23.setOnClickListener(this);
         pbtn24.setOnClickListener(this);
         pbtn25.setOnClickListener(this);
         pbtn26.setOnClickListener(this);
         pbtn27.setOnClickListener(this);
         pbtn28.setOnClickListener(this);
         pbtn29.setOnClickListener(this);
         pbtn30.setOnClickListener(this);
         pbtn31.setOnClickListener(this);
         pbtn32.setOnClickListener(this);
         pbtn33.setOnClickListener(this);
         pbtn34.setOnClickListener(this);
         pbtn35.setOnClickListener(this);
         pbtn36.setOnClickListener(this);
         pbtn37.setOnClickListener(this);
         pbtn38.setOnClickListener(this);
         
         
        
 		

        return View;
    }
    
    public void onClick(View View) {
   	 Intent callIntent = new Intent(Intent.ACTION_CALL);
   	 
        switch(View.getId()){
        
            case R.id.callTCPS1:
				callIntent.setData(Uri.parse("tel:0929-584-0885"));
				startActivity(callIntent);
            break;
            
            case R.id.callTCPS2:
           	 callIntent.setData(Uri.parse("tel:982-2101"));
					startActivity(callIntent);
            break;
            
            case R.id.callTCPS3:
           	 callIntent.setData(Uri.parse("tel:982-0233"));
					startActivity(callIntent);
            break;
            
            case R.id.callTCPS4:
           	 callIntent.setData(Uri.parse("tel:982-0266"));
					startActivity(callIntent);
            break;
            
            case R.id.callTCPSub1:
           	 callIntent.setData(Uri.parse("tel:982-2101"));
					startActivity(callIntent);
                 
            break;
            
            case R.id.callTCPSub2:
           	 callIntent.setData(Uri.parse("tel:982-5087"));
					startActivity(callIntent);
            break;
            
            case R.id.callNBI:
           	 callIntent.setData(Uri.parse("tel:982-1348"));
					startActivity(callIntent);
            break;
            
            case R.id.callAnao1:
           	 callIntent.setData(Uri.parse("tel:0919-811-6700"));
					startActivity(callIntent);
            break;
            
            case R.id.callAnao2:
           	 callIntent.setData(Uri.parse("tel:493-2022"));
					startActivity(callIntent);
            break;
            
            case R.id.callBamban:
           	 callIntent.setData(Uri.parse("tel:0908-926-1494"));
					startActivity(callIntent);
            break;
            
            case R.id.callCamiling1:
           	 callIntent.setData(Uri.parse("tel:0919-877-7767"));
					startActivity(callIntent);
            break;
            
            case R.id.callCamiling2:
           	 callIntent.setData(Uri.parse("tel:934-0988"));
					startActivity(callIntent);
            break;
            
            case R.id.callCapas1:
           	 callIntent.setData(Uri.parse("tel:0905-356-4526"));
					startActivity(callIntent);
            break;
            
            case R.id.callCapas2:
           	 callIntent.setData(Uri.parse("tel:925-0365"));
					startActivity(callIntent);
            break;
            
            case R.id.callCapas3:
           	 callIntent.setData(Uri.parse("tel:925-0166"));
					startActivity(callIntent);
            break;
            
            case R.id.callConcepcion1:
           	 callIntent.setData(Uri.parse("tel:0906-570-0138"));
					startActivity(callIntent);
            break;
            
            case R.id.callConcepcion2:
           	 callIntent.setData(Uri.parse("tel:0915-896-5453"));
					startActivity(callIntent);
            break;
            
            case R.id.callConcepcion3:
           	 callIntent.setData(Uri.parse("tel:923-0175"));
					startActivity(callIntent);
            break;
            
            case R.id.callGerona1:
           	 callIntent.setData(Uri.parse("tel:0918-478-2349"));
					startActivity(callIntent);
            break;
            
            case R.id.callGerona2:
           	 callIntent.setData(Uri.parse("tel:608-0512"));
					startActivity(callIntent);
            break;
            
            case R.id.callLaPaz1:
           	 callIntent.setData(Uri.parse("tel:0917-505-8678"));
					startActivity(callIntent);
	         break;
	             
	         case R.id.callLaPaz2:
	        	 callIntent.setData(Uri.parse("tel:611-0600"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callMayantoc:
	        	 callIntent.setData(Uri.parse("tel:0905-768-4973"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callMoncada1:
	        	 callIntent.setData(Uri.parse("tel:0916-414-6485"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callMoncada2:
	        	 callIntent.setData(Uri.parse("tel:601-0408"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callPaniqui1:
	        	 callIntent.setData(Uri.parse("tel:0919-876-8257"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callPaniqui2:
	        	 callIntent.setData(Uri.parse("tel:491-7120"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callPura:
	        	 callIntent.setData(Uri.parse("tel:0919-419-3211"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callRamos:
	        	 callIntent.setData(Uri.parse("tel:0909-744-9544"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSClemente1:
	        	 callIntent.setData(Uri.parse("tel:0929-741-3965"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSClemente2:
	        	 callIntent.setData(Uri.parse("tel:934-0989"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSJose:
	        	 callIntent.setData(Uri.parse("tel:0918-963-6492"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSManuel1:
	        	 callIntent.setData(Uri.parse("tel:0929-139-5862"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSManuel2:
	        	 callIntent.setData(Uri.parse("tel:(045)600-0213"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSIgnacia1:
	        	 callIntent.setData(Uri.parse("tel:0929-764-9643"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callSIgnacia2:
	        	 callIntent.setData(Uri.parse("tel:(045)605-0205"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callVictoria1:
	        	 callIntent.setData(Uri.parse("tel:0999-675-6631"));
					startActivity(callIntent);
	         break;
	         
	         case R.id.callVictoria2:
	        	 callIntent.setData(Uri.parse("tel:(045)930-0166"));
					startActivity(callIntent);
	         break;

        }};

}