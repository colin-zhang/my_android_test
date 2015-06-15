package colin.demo.main;

/**
 * Created by MING on 2015/6/15.
 */

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;


import colin.demo.R;
import colin.demo.base.MyActivity;
import colin.demo.ui.UIActivity;

/**
 * Created by MING on 2015/6/15.
 */
public  class MainActivity extends MyActivity implements OnClickListener ,AdapterView.OnItemClickListener {
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        items = getResources().getStringArray(R.array.main_list_item);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(
        MainActivity.this, android.R.layout.simple_list_item_1,items);

        ListView listView = (ListView) findViewById(R.id.main_list_view);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d("demo", ""+i+" "+ l);
        switch (items[i]){
            case "UI demo":
                Intent intent = new Intent(MainActivity.this, UIActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(View view) {

    }


}