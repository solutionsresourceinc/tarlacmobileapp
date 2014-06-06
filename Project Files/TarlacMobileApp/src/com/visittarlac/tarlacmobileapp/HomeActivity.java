package com.visittarlac.tarlacmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class HomeActivity extends Activity {

	Button imageButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		addListenerOnButton();
		
	}
	
	
	public void addListenerOnButton() {
		 
		imageButton = (Button) findViewById(R.id.imageButtonSelector);
		imageButton = (Button) findViewById(R.id.imageButtonSelector1);
 
	}
	

	public void showMap(View view) {
		Intent intent = new Intent(HomeActivity.this, TravelActivity.class);
		startActivity(intent);
		
	}	
 
}
