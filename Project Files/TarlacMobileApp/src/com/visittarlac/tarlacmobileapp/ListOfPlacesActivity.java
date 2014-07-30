package com.visittarlac.tarlacmobileapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class ListOfPlacesActivity extends Activity {

	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    public static Typeface ListChildFont,ListHeaderFont;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_places);
		
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


        ListChildFont = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Regular.otf");
        ListHeaderFont = Typeface.createFromAsset(getAssets(), "fonts/ProximaNova-Bold.otf");
        
        //custon ActionBar Name
        SetCustomTitle();
		
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
       
      
        
        
        //expand all list
        for(int i=0; i < listAdapter.getGroupCount(); i++)
        	expListView.expandGroup(i);
        
 
        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {
 
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                    int groupPosition, long id) {
//                Toast.makeText(getApplicationContext(),
//                "Group Clicked " + listDataHeader.get(groupPosition),
//                Toast.LENGTH_SHORT).show();
                return false;
            }
        });
 
        // Listview Group expanded listener
       expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
 
            @Override
            public void onGroupExpand(int groupPosition) {
                
            	
            	
            }
        });
 
        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {
 
            @Override
            public void onGroupCollapse(int groupPosition) {
                
 
            }
        });
 
        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {
 
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                    int groupPosition, int childPosition, long id) {
            	
           
                     
                    	// TODO Auto-generated method stub
                    	String selected = (String) listAdapter.getChild(
                                groupPosition, childPosition);
                    	

                    	Intent intent= new Intent(ListOfPlacesActivity.this, SelectedPlaceActivity.class);   
            	        intent.putExtra("selected",selected); 
            	        startActivity(intent);
                    
                return false;
            }
        });
   
    }
 
    /*
     * Preparing the list data
     */
    private void prepareListData() {

    	
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> categoryList = new ArrayList<String>();
        
        try {
            JSONObject obj = new JSONObject(loadJSONFile());
            JSONArray m_jArry = obj.optJSONArray("Places");
            
            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jsonChildNode = m_jArry.getJSONObject(i);
                String name = jsonChildNode.optString("name");
                String category = jsonChildNode.optString("category");
                nameList.add(name);
                categoryList.add(category);
            }
            
            listDataHeader.add("Places to Visit");
            listDataHeader.add("Places to Dine");
            listDataHeader.add("Places to Chill");
            //listDataHeader.add("Places to Shop");
            
            List<String> visitData = new ArrayList<String>();
            List<String> dineData = new ArrayList<String>();
            List<String> chillData = new ArrayList<String>();
            //List<String> shopData = new ArrayList<String>();
   
            
            for(int i=0;i<nameList.size();i++){
    		
			 if (categoryList.get(i).equals("visit")){
             	
                 visitData.add(nameList.get(i));
                 listDataChild.put (listDataHeader.get(0), visitData);
            }	
			 
			 if (categoryList.get(i).equals("dine")){
	             	
                 dineData.add(nameList.get(i));
                 listDataChild.put (listDataHeader.get(1), dineData);
            }	
			 
			 if (categoryList.get(i).equals("chill")){
	             	
                 chillData.add(nameList.get(i));
                 listDataChild.put (listDataHeader.get(2), chillData);
            }	
			 
			 //if (categoryList.get(i).equals("shop")){
	             	
                
            //}	
			 
			 
			   
		}
            
        } catch (JSONException e) {
            Toast.makeText(getApplicationContext(), "Error..." + e.toString(),
                    Toast.LENGTH_LONG).show();
        }

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
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

	
	public void SetCustomTitle(){
    	TextView textViewTitle = (TextView) findViewById(R.id.ActivityTitle);
    	textViewTitle.setText("LIST OF PLACES");
    	}
	
	
	
}
