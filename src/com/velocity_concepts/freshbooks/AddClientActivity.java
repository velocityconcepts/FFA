package com.velocity_concepts.freshbooks;

import com.velocity_concepts.freshbooks.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class AddClientActivity extends Activity {
	private CheckBox checkbox;
	private TextView username_label;
	private EditText username_field;
	private TextView password_label;
	private EditText password_field;
	private TextView pw_check_label;
	private EditText pw_check_field;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.add_client);
        
        checkbox = (CheckBox)findViewById(R.id.assign_username_checkbox);
        username_label = (TextView)findViewById(R.id.contact_username);
        username_field = (EditText)findViewById(R.id.contact_username_field);
        password_label = (TextView)findViewById(R.id.contact_password);
        password_field = (EditText)findViewById(R.id.contact_password_field);
        pw_check_label = (TextView)findViewById(R.id.contact_pw_check);
        pw_check_field = (EditText)findViewById(R.id.contact_pw_check_field);
        
        
        checkbox.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                	username_label.setVisibility(View.VISIBLE);
                    username_field.setVisibility(View.VISIBLE);
                    password_label.setVisibility(View.VISIBLE);
                    password_field.setVisibility(View.VISIBLE);
                    pw_check_label.setVisibility(View.VISIBLE);
                    pw_check_field.setVisibility(View.VISIBLE);
                } else {
                    username_label.setVisibility(View.GONE);
                    username_field.setVisibility(View.GONE);
                    password_label.setVisibility(View.GONE);
                    password_field.setVisibility(View.GONE);
                    pw_check_label.setVisibility(View.GONE);
                    pw_check_field.setVisibility(View.GONE);
                }
            }
        });
	}
}
