package com.kshitij2k16;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.app.Activity;

public class CoOrdinators extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ordinatorsco);
		
		TextView ctv = (TextView)findViewById(R.id.textView1);
		ctv.setMovementMethod(new ScrollingMovementMethod());
		ctv.setText(Html.fromHtml("<h1>Coordinators' List</h1>" +
				"<h2><u>Faculty</u></h2>" +
				"<ul>" +
				"<li>Prof. Neha Gupta</li><br>" +
				"<li>Prof. Aarti Joshi</li><br>" +
				"<li>Prof. Prachi Chicholikar</li><br>" +
				"<li>Prof. Soniya Seth</li><br>" +
				"<li>Prof. Pallavi Rassay</li><br>" +
				"<li>Prof. Zoya Khan</li><br>" +
				"<li>Prof. O P Gupta</li><br>" +
				"<li>Prof. Balvindar Singh</li><br>" +
				"<li>Prof. Suyash Joshi</li><br>" +
				"<li>Prof. Nikita Morya</li><br>" +
				"<li>Prof. Farhan Khan</li><br>" +
				"<li>Prof. Monu Sharma</li><br>" +
				"<li>Prof. Nikhil Porwal</li><br>" +
				"<li>Prof. Bhupendra Sharma</li><br>" +
				"<li>Prof. Rahul Jaiswal</li><br>" +
				"<li>Prof. M S Gautam</li><br>" +
				"<li>Prof. Manish Solanki</li><br>" +
				"<li>Prof. Mukul Gupta</li><br>" +
				"<li>Prof. Bharat Singh Daya</li><br>" +
				"<li>Prof. Anil Chauhan</li><br>" +
				"<li>Prof. Tabbassum Patel</li><br>" +
				"<li>Prof. Pooja Chauhan</li><br>" +
				"<li>Prof. Suchi Gupta</li><br>" +
				"<li>Prof. Arjun Solanki</li><br>" +
				"<li>Prof. Parag Mag</li><br>" +
				"<li>Prof. Bhavesh Runwal</li><br>" +
				"<li>Prof. Firoz Abbasi</li><br>" +
				"<li>Prof. Karuna Rani</li><br>" +
				"<li>Prof. Preeti Solanki</li><br>" +
				"<li>Prof. Priyanka Khabiya</li><br>" +
				"</ul>" +
				"<h2><u>Students</u></h2>" +
				"<ul>" +
				"<li>Anuj Shiva</li><br>" +
				"<li>Jatin Marmat</li><br>" +
				"<li>Shriya Talesra</li><br>" +
				"<li>Priya Chopra</li><br>" +
				"<li>Shailendra Bairaiya</li><br>" +
				"<li>Milkit Singh</li><br>" +
				"<li>Akshay Bhavasar</li><br>" +
				"<li>Avina Pawar</li><br>" +
				"<li>Gitika Joshi</li><br>" +
				"<li>Durgesh Singh</li><br>" +
				"<li>Jeevan Gehlot</li><br>" +
				"<li>Yash Gehlot</li><br>" +
				"<li>Ankit Bairagi</li><br>" +
				"<li>Abbas Kagdi</li><br>" +
				"<li>Mitika Gandhi</li><br>" +
				"<li>Mayur Sharma</li><br>" +
				"</ul>"
				));
	}
}