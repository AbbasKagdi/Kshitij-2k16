package com.kshitij2k16;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
//import android.widget.Toast;
import android.app.Activity;
public class EventDetail extends Activity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detailevent);

		tv= (TextView) findViewById(R.id.textView1);
		tv.setMovementMethod(new ScrollingMovementMethod());
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    String valuex = extras.getString("x");
		    loadEvent(valuex);	    
		}
		
	}
	//Text Editing Incomplete
	private void loadEvent(String vx){
		tv.setText(Html.fromHtml("" +
				"<h1>Kshitij 2k16</h1>" +
				"<h2><u>"+evnom(vx)+"</u></h2>" +
				"<h2>"+evdat(vx)+"</h2>" +
				"<h2>"+tccor(vx)+"</h2>" +
				"<h2>"+stcor(vx)+"</h2>" +
				/*"<h3>Rules</h3>" +
				loadRules(vx)+*/
						""));
	}
	
	private String evnom(String vx) {
		char c = vx.charAt(0);
		switch(c){
			case 'a':return "Rangeela Re";
			case 'b':return "LAN Gaming";
			case 'c':return "Ad ka naya Funda";
			case 'd':return "Movie Club";
			case 'e':return "Daring Dash";
			case 'f':return "Khazane ki khoj";
			case 'g':return "Robo War";
			case 'h':return "Gully Cricket";
			case 'i':return "Zameen Se Aasman";
			case 'j':return "Haat Mania";
			case 'k':return "Tug of War";
			case 'l':return "Tak dhina dhin";
			case 'm':return "Robo Race";
			case 'n':return "Rang-E-tech";
			case 'o':return "Khana Khazana";
			case 'p':return "Model Presentation";
			case 'q':return "Distraction";
			case 'r':return "Death Race";
			default:return "";
		}
	}

	private String evdat(String vx) {
		char c = vx.charAt(0);
		switch(c){
			case 'a':return "Day 1: 9:30-10:30";
			case 'b':return "Daily: Anytime<br>Final: Day 3: 11:45-1:00";
			case 'c':return "Day 1: 11:00-12:00";
			case 'd':return "Daily: Anytime";
			case 'e':return "Day 1: 12:00-1:00<br>Day 2: 2:00-3:30<br>Day 3: 2:00-3:30";
			case 'f':return "Day 1: 1:00-1:45<br>Day 3: 1:00-2:00";
			case 'g':return "Day 1: 1:45-2:45";
			case 'h':return "Day 1: 2:45-4:30<br>Day 3: 11:45-1:00";
			case 'i':return "Day 2: 9:30-10:30";
			case 'j':return "Day 2: Anytime";
			case 'k':return "Day 2: 10:30-11:30";
			case 'l':return "Day 2: 11:30-12:30";
			case 'm':return "Day 2: 12:30-2:00";
			case 'n':return "Day 2: 3:00-4:30";
			case 'o':return "Day 3: 9:30-10:30";
			case 'p':return "Day 3: 9:30-10:30";
			case 'q':return "Day 3: 10:30-11:45<br>Day 3: 12:30-1:00";
			case 'r':return "Day 2: 12:30-2:00";
			default:return "";
		}
	}
	
	private String tccor(String vx) {
		char c = vx.charAt(0);
		switch(c){
		case 'a':return "<h3>Neha Gupta</h3><h4>Aarti Joshi</h4><h4>Ankita Soni</h4>";
		case 'b':return "<h3>Imran Hussain</h3><h4>Bharat S.Daya</h4><h4>Anil Chouhan</h4>";
		case 'c':return "<h3>Pallavi Rassay</h3><h4>Zoya Khan</h4><h4>Arjun Singh</h4>";
		case 'd':return "";
		case 'e':return "<h3>Pallavi Rassay</h3><h4>Zoya Khan</h4><h4>Arjun Singh</h4>";
		case 'f':return "<h3>Parag Mag</h3><h4>Preeti Solanki</h4><h4>Monu Sharma</h4>";
		case 'g':return "<h3>Nikhil Porwal</h3><h4>Bhupendra Sharma</h4><h4>Rahul Jaiswal</h4>";
		case 'h':return "<h3>MS Gautam</h3><h3>Nirdosh Sharma</h3><h4>Manish Solanki</h4><h4>Mukul Gupta</h4><h4>Govind jhanwar</h4>";
		case 'i':return "<h3>Tabbsum Patel</h3><h4>Prachi Chincholikar</h4><h4>Ajay Pathak</h4>";
		case 'j':return "<h3>Pooja Chouhan</h3><h4>Priti Solanki</h4><h4>Shuchi Gupta</h4>";
		case 'k':return "<h3>Arjun Solanki</h3><h4>Firoz Abbasi</h4><h4>Farhan Khan</h4><h4>Shuchi Gupta</h4>";
		case 'l':return "<h3>Zoya Khan</h3><h4>Neha Gupta</h4><h4>Suyash Joshi</h4><h4>Karuna Rani</h4>";
		case 'm':return "<h3>Bhupendra Sharma</h3><h4>Nikhil Porwal</h4><h4>Rahul Jaiswal</h4>";
		case 'n':return "<h3>Priti Solanki</h3><h4>Parag Mag</h4><h4>Aarti Joshi</h4><h4>Priyanka Khabiya</h4>";
		case 'o':return "<h3>Suchi Gupta</h3><h4>Pooja Chouhan</h4><h4>Ankita Soni</h4>";
		case 'p':return "<h3>All HODs</h3>";
		case 'q':return "<h3>Arjun Solanki</h3><h4>Firoz Abbasi</h4><h4>Farhan Khan</h4><h4>Sonia Seth</h4>";
		case 'r':return "<h3>Nikhil Porwal</h3><h4>Bhupendra Sharma</h4><h4>Rahul Jaiswal</h4>";
			default:return "";
		}
	}
	
	private String stcor(String vx) {
		char c = vx.charAt(0);
		switch(c){
		case 'a':return "Priya Chopra<br>Jatin Marmat<br>Shriya Talesra";
		case 'b':return "Anuj Shiva<br>Abbas Kagdi";
		case 'c':return "Akshay Bhavasar<br>Avina Pawar";
		case 'd':return "Abbas Kagdi";
		case 'e':return "Milkit Singh<br>Shailendra Bairaiya<br>Ishrat Shah";
		case 'f':return "Gitika Joshi<br>Priya Chopra";
		case 'g':return "Durgesh Singh<br>Jeevan Gehlot";
		case 'h':return "Ankit Bairagi<br>Yash Gehlot";
		case 'i':return "Avina Pawar<br>Anuj Shiva<br>Abbas Kagdi";
		case 'j':return "Jatin Marmat<br>Gitika Joshi<br>Priya Chopra<br>Akshay Bhavasar<br>Farha Gauri";
		case 'k':return "Yash Gehlot<br>Ankit Bairagi<br>Mitika Gandhi";
		case 'l':return "Akshay Bhavasar<br>Anuj Shiva<br>Gitika Joshi";
		case 'm':return "Durgesh Singh<br>Jeevan Gehlot";
		case 'n':return "Mitika Gandhi<br>Ishrat Shah<br>Ankit Bairagi";
		case 'o':return "Avina Pawar<br>Shriya Talesra<br>Farha Gauri";
		case 'p':return "Shailendra Bairaiya<br>Ishrat Shah<br>Mitika Gandhi";
		case 'q':return "Durgesh Singh<br>Jeevan Gehlot";
		case 'r':return "Durgesh Singh<br>Jeevan Gehlot";
			default:return "";
		}
	}
	
	@SuppressWarnings("unused")
	private String loadRules(String vx) {
		char c = vx.charAt(0);
		switch(c){
		case 'a':return "Rangeela Re";
		case 'b':return "LAN Gaming";
		case 'c':return "Ad ka naya Funda";
		case 'd':return "Movie Club";
		case 'e':return "Daring Dash";
		case 'f':return "Khazane ki khoj";
		case 'g':return "Robo War";
		case 'h':return "Gully Cricket";
		case 'i':return "Zameen Se Aasman";
		case 'j':return "Haat Mania";
		case 'k':return "Tug of War";
		case 'l':return "Tak dhina dhin";
		case 'm':return "Robo Race";
		case 'n':return "Rang-E-tech";
		case 'o':return "Khana Khazana";
		case 'p':return "Model Presentation";
		case 'q':return "Distraction";
		case 'r':return "Death Race";
		default:return "";
		}
	}
}
