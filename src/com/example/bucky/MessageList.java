package com.example.bucky;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MessageList extends Activity {
	
/*	public class custom{
		TextView tv;
		TextView tv2;
		Button snd;
		EditText et;
		EditText et2;		
	};*/
	static class ViewHolder{
		String a,b;
		ViewHolder()
		{
			this.a="khaali";
			this.b="khaali";
		}
		ViewHolder(String a, String b)
		{
			this.a=a;
			this.b=b;
		}
	};
	
  public void onCreate(Bundle someBundle) {
    super.onCreate(someBundle);
    setContentView(R.layout.listing);
    //String[] values = new String[] { "sdfs", "iPhhfghse", "sfgbb" };
    //ViewHolder[] vals = new ViewHolder[] { {"sdfs", "iPhhfghse"},{"adsa", "sfgbb" }};
    ListView listView= (ListView) findViewById(R.id.list);
    ViewHolder[] vals= new ViewHolder[2];
    vals[0]= new ViewHolder("testing", "butTest");
    vals[1]=new ViewHolder("testing", "butTest");
    //ViewHolder vals[1]=new ViewHolder("testing2", "butTest2");
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
