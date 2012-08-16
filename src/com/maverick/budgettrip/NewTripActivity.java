package com.maverick.budgettrip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.maverick.budgettrip.R.id;

public class NewTripActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_trip);

		// I forgot the way to call an image. Also, how do call an image and use
		// it like a button.

		Button saveIcon = (Button) findViewById(R.id.save_button);

		EditText newTripName = (EditText) findViewById(R.id.new_trip_name);

		EditText newTripDescription = (EditText) findViewById(R.id.new_trip_description);

	}

	private ImageView findViewById(Class<id> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
