package com.maverick.budgettrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainTripList extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_trip_list);

		Button b = (Button) findViewById(R.id.newtrip);
		 b.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.newtrip:
			Intent newTripIntent = new Intent(this, NewTripActivity.class);
			startActivity(newTripIntent);
			break;
		}
	}

}
