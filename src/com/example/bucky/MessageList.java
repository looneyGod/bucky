package com.example.bucky;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MessageList extends Activity {
	
/*	public class custom{
		TextView tv;
		TextView tv2;
		Button snd;
		EditText et;
		EditText et2;		
	};*/
	static class ViewHolder{
		TextView tv1;
		Button bt1;
/*		ViewHolder(TextView tv1, Button bt1)
		{
			this.tv1=tv1;
			this.bt1=bt1;
		}*/
		ViewHolder()
		{
			this.tv1.setText("");
			this.bt1.setText("");
		}
		ViewHolder(String a, String b)
		{
			this.tv1.setText(a);
			this.bt1.setText(b);
		}
	};
	
  public void onCreate(Bundle someBundle) {
    super.onCreate(someBundle);
    setContentView(R.layout.listing);
    String[] values = new String[] { "sdfs", "iPhhfghse", "sfgsdhbb" };
    ListView listView= (ListView) findViewById(R.id.list);
    ViewHolder vals= new ViewHolder("testing", "butTest");
    /*ArrayList<String> lst = new ArrayList<String>();*/
    /*lst.addAll(Arrays.asList(values));*/
    
    // use your custom layout
/*    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        R.layout.chatbox, values);*/
    
    MyAdapter adapter = new MyAdapter(this,
    		com.example.bucky.R.layout.testxml, vals);
    listView.setAdapter(adapter);
    //adapter.add("kuch bhi naya");
    
/*    listView.setOnItemClickListener(new OnItemClickListener() {    	 
        @Override
        public void onItemClick(AdapterView<?> parent, View view,
           int position, long id) {
          
         // ListView Clicked item index
         int itemPosition     = position;
         
         // ListView Clicked item value
         String  itemValue    = (String) listView.getItemAtPosition(position);
            
          // Show Alert 
          Toast.makeText(getApplicationContext(),
            "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
            .show();
       
        }
    });*/
    
  }
}
