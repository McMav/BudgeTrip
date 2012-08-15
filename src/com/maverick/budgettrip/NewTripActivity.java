package com.maverick.budgettrip;

import com.maverick.budgettrip.R.id;

import android.R.drawable;
import android.app.Activity;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewTripActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_trip);
// I forgot the way to call an image. Also, how do call an image and use it like a button.
		
		Button saveIcon = (Button) findViewById(R.id.saveButton);
		
		
		EditText newTripName = (EditText) findViewById(R.id.newTripName);
		
		EditText newTripDescription = (EditText) findViewById(R.id.newTripDescription);
		
		
		
	}
	
	private void onclick() {
		Intent new intent = getIntent(this.)

	}
	
	

	private ImageView findViewById(Class<id> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
