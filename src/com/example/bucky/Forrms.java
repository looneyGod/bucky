package com.example.bucky;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Forrms extends Activity{
	
	Button subBut;
	Button resBut;
	EditText usernaam;
	EditText paasword;
	TextView testing;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formxml);
		subBut= (Button) findViewById(R.id.subm);
		resBut= (Button) findViewById(R.id.ress);
		usernaam= (EditText) findViewById(R.id.usernaam);
		paasword= (EditText) findViewById(R.id.paasword);
		testing=(TextView) findViewById(R.id.testing);	
		resBut.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				usernaam.setText("");
				paasword.setText("");
			}
		});
		subBut.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testing.setText(" "+usernaam.getText().toString() + paasword.getText().toString());
			}
		});
	}

}
