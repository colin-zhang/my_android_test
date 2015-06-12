package colin.demo;

import colin.demo.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
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
		
		if(savedInstanceState != null){
			String test = savedInstanceState.getString("test");
			Log.d("Test",test);
			
		}
		
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
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		outState.putString("test", "colin");
	}

	@Override
	public void onClick(View view) {
		
		//Intent inent = new Intent(this, AnotherActivity.class);

		// calling an activity using <intent-filter> action name 
		 	Intent inent = new Intent("com.hmkcode.android.ANOTHER_ACTIVITY");
		
		 	startActivity(inent);
	}
	
	protected void onResume() {
        super.onResume();
        Log.v("Test","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Test","onStart");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Test","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Test","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Test","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Test", "onDestroy");
    }


}
