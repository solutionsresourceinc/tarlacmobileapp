package com.visittarlac.tarlacmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {

	private static String TAG = SplashActivity.class.getName();
	private static long SLEEP_TIME = 5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		
		setContentView(R.layout.activity_splash);
		
		IntentLauncher launcher =new IntentLauncher();
		launcher.start();
		
	}
	
	private class IntentLauncher extends Thread {
		
		public void run(){
			try {
				Thread.sleep(SLEEP_TIME * 500);
			}catch (Exception e) {
				Log.e(TAG, e.getMessage());
			}
			
		Intent intent= new Intent(SplashActivity.this,HomeActivity.class);
		SplashActivity.this.startActivity(intent);
		SplashActivity.this.finish();
		
		}
	}
}