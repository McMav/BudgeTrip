package com.maverick.budgettrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class TripListActivity extends Activity implements OnClickListener {

	private Button btnNewTrip;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_trip_list);

		btnNewTrip = (Button) findViewById(R.id.new_trip);
		btnNewTrip.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.new_trip:
			Intent newTripIntent = new Intent(this, NewTripActivity.class);
			startActivity(newTripIntent);
			break;
		}
	}

}
