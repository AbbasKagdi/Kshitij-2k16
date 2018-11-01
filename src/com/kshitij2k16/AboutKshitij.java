package com.kshitij2k16;

import java.util.Random;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;

public class AboutKshitij extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kshitijabout);
		
		final MediaPlayer dial=MediaPlayer.create(this, R.raw.wat);
		final MediaPlayer click=MediaPlayer.create(this, R.raw.click);


		Button ad = (Button)findViewById(R.id.button1);
		Button fb = (Button)findViewById(R.id.button2);
		Button wat = (Button)findViewById(R.id.button3);
		Button gog = (Button)findViewById(R.id.button4);
		Button col = (Button)findViewById(R.id.button5);
		TextView ctv = (TextView)findViewById(R.id.textView1);
		
		Random rand = new Random();
		String adsense="";
		switch(rand.nextInt(6)){
			case 0:adsense="Cheers to Friendship";break;
			case 1:adsense="Calling Papa";break;
			case 2:adsense="Cool App Here";break;
			case 3:adsense="Secret App";break;
			case 4:adsense="Help My Mate";break;
			case 5:adsense="High Five";break;
			default:adsense="High Five";break;
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
		
		fb.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				click.start();
				Uri uri = Uri.parse("https://goo.gl/aG8Soq");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
			
		});
		
		gog.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				click.start();
				Uri uri = Uri.parse("https://goo.gl/mgzMqr");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
			
		});
		
		col.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				click.start();
				Uri uri = Uri.parse("https://goo.gl/q23hnF");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
			
		});
		
		wat.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				dial.start();
				try{
					PackageManager pm = getPackageManager();
					pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
			        
					String number="+919425910720";
					Uri uri = Uri.parse("smsto:" + number);
					Intent i = new Intent(Intent.ACTION_SENDTO, uri);
					i.setPackage("com.whatsapp");  
					startActivity(Intent.createChooser(i, ""));
				}
				catch(PackageManager.NameNotFoundException e){
					Toast.makeText(getApplicationContext(), "Whatsapp not Installed", Toast.LENGTH_SHORT).show();
				}
			}
			
		});

		ctv.setMovementMethod(new ScrollingMovementMethod());
		ctv.setMovementMethod(LinkMovementMethod.getInstance());
		ctv.setLinkTextColor(Color.parseColor("#205050"));
		ctv.setText(Html.fromHtml(
			"<p><h3>Kshitij</h3>Is a Technofest hosted anually by <h3>SYSITS</h3> Ratlam.<br>" +
			"Kshitij is the biggest platform for students to shine<br>" +
			"under technical and cultural programs.<br>" +
			"This app is intended to guide students with the<br>" +
			"registration process.<br><br>" +
			"Developed by <b><u>DuneWhite Group</u></b><br>" +
			"<h4><a href='https://goo.gl/SY6piR'>Abbas Kagdi</a></h4>" +
			"<h4><a href='https://goo.gl/KOijdH'>Samyak Talesra</a></h4><br>" +
			"Special Thanks to <h3>Laksh Parnami</h3> for his support</p>"));

		fb.setTextColor(Color.rgb(59, 89, 152));
		wat.setTextColor(Color.rgb(52, 255, 35));
		gog.setTextColor(Color.rgb(211, 72, 54));
		col.setTextColor(Color.rgb(200, 200, 200));
		
	}
}
