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
	ViewHolder localVH =new ViewHolder();
	TextView tv;
	Button bt;
	public MyAdapter(Context context, int resource, ViewHolder v) {
		super(context, resource); // check if third parameter is necessary 
		// TODO Auto-generated constructor stub
		tv=v.tv1;
		bt=v.bt1;
	}
	@Override  
	public View getView(int position, View convertView, ViewGroup parent) {
		    LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		    TextView textView = (TextView) rowView.findViewById(R.id.textView1);
		    Button butView = (Button) rowView.findViewById(R.id.button1);
		    textView.setText(vals[position]);
		    // change the icon for Windows and iPhone
		    String s = vals[position];

		    return rowView;
		  }

}
