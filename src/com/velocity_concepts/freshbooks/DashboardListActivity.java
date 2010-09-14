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
import android.widget.TextView;

public class DashboardListActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);

	  String[] items = getResources().getStringArray(R.array.dashboard_items);

	  setListAdapter(new ArrayAdapter<String>(this, R.layout.dashboard_item, items));

	  ListView lv = getListView();
	  lv.setTextFilterEnabled(true);

	  lv.setOnItemClickListener(new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, View view,
	        int position, long id) {
	        // When clicked, show a toast with the TextView text
	        //Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
	    	String selected = ""+((TextView) view).getText();
	    	Intent myIntent = new Intent();
        	myIntent.setClassName("com.freshdroid.hellodroid", "com.freshdroid.hellodroid."+selected+"Activity");
    		startActivity(myIntent);
	    }
	  });
	}
}
