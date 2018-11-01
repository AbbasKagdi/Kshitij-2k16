package com.kshitij2k16;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.app.Activity;
import android.content.Context;

@SuppressWarnings("deprecation")
public class EventGallery extends Activity {

	private Integer[] pics={
			R.drawable.a,
			R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.e,
			R.drawable.f, R.drawable.g,
			R.drawable.h, R.drawable.i,
			R.drawable.j, R.drawable.k,
			R.drawable.l, R.drawable.m,
			R.drawable.n, R.drawable.o,
			R.drawable.p, R.drawable.q,
			R.drawable.r
	};
	private ImageView giv;
	Gallery gal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.galleryevent);
		
		gal=(Gallery)findViewById(R.id.gallery1);
		giv=(ImageView)findViewById(R.id.imageView1);
		gal.setAdapter(new ImageAdapter(this));
		gal.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
				Toast.makeText(getApplicationContext(), evnom(arg2), Toast.LENGTH_SHORT).show();
				giv.setImageResource(pics[arg2]);
			}
			
		});
	}
	
	private String evnom(int n) {
		switch(n){
			case 0:return "Rangeela Re";
			case 1:return "LAN Gaming";
			case 2:return "Ad ka naya Funda";
			case 3:return "Movie Club";
			case 4:return "Daring Dash";
			case 5:return "Khazane ki khoj";
			case 6:return "Robo War";
			case 7:return "Gully Cricket";
			case 8:return "Zameen Se Aasman";
			case 9:return "Haat Mania";
			case 10:return "Tug of War";
			case 11:return "Tak dhina dhin";
			case 12:return "Robo Race";
			case 13:return "Rang-E-tech";
			case 14:return "Khana Khazana";
			case 15:return "Model Presentation";
			case 16:return "Disraction";
			case 17:return "Death Race";
			default:return "";
		}
	}

	public class ImageAdapter extends BaseAdapter{
		private Context cont;
		int ImageBackground;
		
		public ImageAdapter(Context c){
			this.cont=c;
		}

		@Override
		public int getCount() {
			return pics.length;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView iv = new ImageView(cont);
			iv.setImageResource(pics[position]);
			return iv;
		}
	}
	
}
