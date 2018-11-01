package com.kshitij2k16;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Thread splash=new Thread(){
			
			@Override
			public void run() {
				try {
					sleep(500);
					startActivity(new Intent(MainActivity.this,FrontPage.class));
				}
				catch (InterruptedException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		};
		splash.start();
	}
	
}
