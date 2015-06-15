package colin.demo.ui;
/**
 * Created by MING on 2015/6/15.
 */

import android.os.Bundle;

import colin.demo.R;
import colin.demo.base.MyActivity;


import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class LayoutInflaterDemo extends MyActivity implements OnClickListener {

    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater_demo);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        showCustomDialog();
    }

    public void showCustomDialog()
    {

        ////LayoutInflater inflater = getLayoutInflater();
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_dialog,null);
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("Hello, This is colin coding!");
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.info_72);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(layout);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
