package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	 public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

		Button button;
		ImageView image;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
        setContentView(R.layout.activity_main);
 //       addListenerOnButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
//	public void addListenerOnButton() {
//		image = (ImageView) findViewById(R.id.imageView1);
//		 
//		button = (Button) findViewById(R.id.btnChangeImage);
//		button.setOnClickListener(new OnClickListener() {
// 
//			@Override
//			public void onClick(View arg0) {
//				
//				image.setImageResource(R.drawable.ic_launcher);
//			}
// 
//		});
//	}
	
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
