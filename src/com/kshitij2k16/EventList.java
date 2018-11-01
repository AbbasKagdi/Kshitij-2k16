package com.kshitij2k16;

import java.util.Random;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class EventList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listevent);
		
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","a");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","b");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b3 = (Button)findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","c");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b4 = (Button)findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","d");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b5 = (Button)findViewById(R.id.button5);
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","e");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b6 = (Button)findViewById(R.id.button6);
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","f");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b7 = (Button)findViewById(R.id.button7);
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","g");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b8 = (Button)findViewById(R.id.button8);
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","h");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b9 = (Button)findViewById(R.id.button9);
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","i");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b10 = (Button)findViewById(R.id.button10);
		b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","j");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b11 = (Button)findViewById(R.id.button11);
		b11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","k");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b12 = (Button)findViewById(R.id.button12);
		b12.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","l");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b13 = (Button)findViewById(R.id.button13);
		b13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","m");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b14 = (Button)findViewById(R.id.button14);
		b14.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","n");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b15 = (Button)findViewById(R.id.button15);
		b15.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","o");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b16 = (Button)findViewById(R.id.button16);
		b16.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","p");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b17 = (Button)findViewById(R.id.button17);
		b17.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","q");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button b18 = (Button)findViewById(R.id.button18);
		b18.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), EventDetail.class);
				i.putExtra("x","r");
				startActivity(i);
				System.exit(0);
			}
		});
		
		Button ad= (Button)findViewById(R.id.button19);
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
		
		b1.setText("Face");
		b2.setText("LAN");
		b3.setText("Ads");
		b4.setText("Movie");
		b5.setText("Dare");
		b6.setText("Khazana");
		b7.setText("War");
		b8.setText("Cricket");
		b9.setText("Z2A");
		b10.setText("Shop");
		b11.setText("Tug");
		b12.setText("Dance");
		b13.setText("Race");
		b14.setText("Rang");
		b15.setText("Food");
		b16.setText("Model");
		b17.setText("Quiz");
		b18.setText("Race");
		
	}
}
