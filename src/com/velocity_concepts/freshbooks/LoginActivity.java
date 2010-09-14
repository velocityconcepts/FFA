package com.velocity_concepts.freshbooks;

import com.velocity_concepts.freshbooks.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class LoginActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        
        // get views
        /*
        final TextView status = (TextView)findViewById(R.id.status);
        final EditText acct_name = (EditText)findViewById(R.id.account_name);
        final EditText token = (EditText)findViewById(R.id.token);
        */
        Button but = (Button)findViewById(R.id.login_button);
        
        
        // listen for click
        
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Check Login
            	/*String check_acct = acct_name.getText().toString();
            	String check_token = token.getText().toString();
            	 if(check_acct.equals("mlebrun") && check_token.equals("Y7u8i9o0p?")){
            		// if success create and intent to the dashboard activity */
            		Intent myIntent = new Intent();
                	myIntent.setClassName("com.freshdroid.hellodroid", "com.freshdroid.hellodroid.DashboardListActivity");
            		startActivity(myIntent);
            	/* } else {
            	    status.setText("Login failed. Incorrect credentials.");
            	} */
            	
            }
        });


    }
}