package com.velocity_concepts.freshbooks;

import com.velocity_concepts.freshbooks.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ClientActivity extends Activity {
	private int WAS_SUCCESS;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  
	  setContentView(R.layout.client);
	  
	  Button but_add_credit = (Button)findViewById(R.id.add_credit_button);
	  Button but_add_contact = (Button)findViewById(R.id.add_contact_button);
	  ListView lv = (ListView)findViewById(R.id.contact_list);;
	  
	  String[] contacts = getResources().getStringArray(R.array.contacts);

	  lv.setAdapter(new ArrayAdapter<String>(this, R.layout.dashboard_item, contacts));

	  
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
      
      // listen for click
	  but_add_credit.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
          		Intent myIntent = new Intent(ClientActivity.this, com.velocity_concepts.freshbooks.AddCreditActivity.class);
          		startActivityForResult(myIntent, WAS_SUCCESS);          	
          }
      });
	  but_add_contact.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
        	    Intent myIntent = new Intent();
          		myIntent.setClass(getApplicationContext(), AddClientActivity.class);
          		startActivity(myIntent);          	
          }
      });
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.client_menu, menu);
	    return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.contact_edit:
	        //newGame();
	        return true;
	    case R.id.create_new:
	        //quit();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}
