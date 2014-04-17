package com.example.bucky;

import com.example.bucky.MessageList.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<ViewHolder>{
	  private final Context context;
	  private final ViewHolder[] v;
	public MyAdapter(Context context, int resource, ViewHolder[] v) {
		super(context, resource); // check if third parameter is necessary 
		// TODO Auto-generated constructor stub
		this.v=v;
		this.context=context;
	}
	@Override  
	public View getView(int position, View convertView, ViewGroup parent) {
		    //LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);// what the hell is this?
			LayoutInflater inflater = LayoutInflater.from(getContext());
			View rowView = inflater.inflate(R.layout.testxml, parent, false);
		    TextView textView = (TextView) rowView.findViewById(R.id.textView1);
		    Button butView = (Button) rowView.findViewById(R.id.button1);
		    
		    textView.setText(v[position].a);
		    butView.setText(v[position].b);
		    
		    
		    // change the icon for Windows and iPhone
		    //String s = vals[position];

		    return rowView;
		  }

}
