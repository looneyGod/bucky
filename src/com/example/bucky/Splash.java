package com.example.bucky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashxml);
		Thread timer= new Thread(){
			public void run()
			{
				try{
					sleep(3000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try{
						Class OurClass = Class.forName("com.example.bucky.Forrms");
						Intent openMainActivity= new Intent(Splash.this, OurClass);
						startActivity(openMainActivity);
					}
					catch(ClassNotFoundException c)
					{
						c.printStackTrace();
					}
					
				}
			}
		};
		timer.start();
	}
}
