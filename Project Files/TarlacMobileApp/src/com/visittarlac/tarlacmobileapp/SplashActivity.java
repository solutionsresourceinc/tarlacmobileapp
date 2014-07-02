package com.visittarlac.tarlacmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SplashActivity extends Activity {

	private static String TAG = SplashActivity.class.getName();
	private static long SLEEP_TIME = 5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		
		setContentView(R.layout.activity_splash);
		
		IntentLauncher launcher =new IntentLauncher();
		launcher.start();
		
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Bold.otf");
        TextView tv = (TextView) findViewById(R.id.Title);
        tv.setTypeface(tf);
        
        Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "fonts/ProximaNova-Light.otf");
        TextView tv1 = (TextView) findViewById(R.id.SubTitle);
        tv1.setTypeface(tf1);
        
        Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue Bold.otf");
        TextView tv2 = (TextView) findViewById(R.id.Rights);
        tv2.setTypeface(tf2);
        
		
	}
	
	private class IntentLauncher extends Thread {
		
		public void run(){
			try {
				Thread.sleep(SLEEP_TIME * 200);
			}catch (Exception e) {
				Log.e(TAG, e.getMessage());
			}
			
		Intent intent= new Intent(SplashActivity.this,HomeActivity.class);
		SplashActivity.this.startActivity(intent);
		SplashActivity.this.finish();
		
		}
	}
	
	
	
}