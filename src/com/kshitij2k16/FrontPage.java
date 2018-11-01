package com.kshitij2k16;

import java.util.Random;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class FrontPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pagefront);
		
		ImageButton event=(ImageButton)findViewById(R.id.ImageButton1);
		ImageButton coord=(ImageButton)findViewById(R.id.ImageButton2);
		ImageButton gallery=(ImageButton)findViewById(R.id.ImageButton3);
		ImageButton about=(ImageButton)findViewById(R.id.ImageButton4);
		Button ad=(Button)findViewById(R.id.button5);
		
		event.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(FrontPage.this,EventList.class));
				System.exit(0);
			}
			
		});
		
		coord.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(FrontPage.this,CoOrdinators.class));
				System.exit(0);
			}
			
		});
		
		gallery.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(FrontPage.this,EventGallery.class));
				System.exit(0);
			}
			
		});
		
		about.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(FrontPage.this,AboutKshitij.class));
				System.exit(0);
			}
			
		});

		Random rand = new Random();
		String adsense="";
		switch(rand.nextInt(6)){
			case 0:adsense="Cheers to Friendship";break;
			case 1:adsense="Calling Papa";break;
			case 2:adsense="Cool App Here";break;
			case 3:adsense="Secret App";break;
			case 4:adsense="Help My Mate";break;
			case 5:adsense="High Five";break;
			default:adsense="Click Me";break;
		}
		ad.setText(adsense);
		
		ad.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent lpa= new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=com.lakshparnami.callingpapa"));
				startActivity(lpa);
				Toast.makeText(getApplicationContext(), "Thanks", Toast.LENGTH_SHORT).show();
			}
			
		});
	}

}
