package com.velocity_concepts.freshbooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class InvoiceActivity extends Activity {
	private int WAS_SUCCESS;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  
	  setContentView(R.layout.invoice);
	  
	  Button but_add_credit = (Button)findViewById(R.id.add_credit_button);
	  Button but_add_contact = (Button)findViewById(R.id.add_contact_button);
	  
      
      // listen for click
	  but_add_credit.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
          		Intent myIntent = new Intent(InvoiceActivity.this, com.velocity_concepts.freshbooks.AddCreditActivity.class);
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
