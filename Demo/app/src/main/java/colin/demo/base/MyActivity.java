package colin.demo.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by MING on 2015/6/15.
 */
public class MyActivity extends Activity {
    public final String TAG = "demo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
