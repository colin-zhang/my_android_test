package com.hmkcode.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btnStartAnotherActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnStartAnotherActivity = (Button) findViewById(R.id.btnStartAnotherActivity);
		
		btnStartAnotherActivity.setOnClickListener(this);
		
		Button btnThrid = (Button) findViewById(R.id.btnThrid);
		btnThrid.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent(MainActivity.this,ThirdActivity.class);
				startActivity(it);
			}
		});
	}


	@Override
	public void onClick(View view) {
		
		//Intent inent = new Intent(this, AnotherActivity.class);

		// calling an activity using <intent-filter> action name 
		 	Intent inent = new Intent("com.hmkcode.android.ANOTHER_ACTIVITY");
		
		 	startActivity(inent);
	}

}
