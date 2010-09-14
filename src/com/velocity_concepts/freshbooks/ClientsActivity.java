package com.velocity_concepts.freshbooks;

import com.velocity_concepts.freshbooks.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ClientsActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);

	  String[] items = getResources().getStringArray(R.array.clients);

	  setListAdapter(new ArrayAdapter<String>(this, R.layout.dashboard_item, items));

	  ListView lv = getListView();
	  lv.setTextFilterEnabled(true);

	  lv.setOnItemClickListener(new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, View view,
	        int position, long id) {
	      // When clicked, show a client profile
	    	Intent myIntent = new Intent();
        	myIntent.setClassName("com.velocity_concepts.freshbooks", "com.velocity_concepts.freshbooks.ClientActivity");
    		startActivity(myIntent);
	    }
	  });
	}
}
