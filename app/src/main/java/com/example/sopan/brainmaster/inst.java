package com.example.sopan.brainmaster;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class inst extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst);
        Typeface m = Typeface.createFromAsset(getAssets(), "small.ttf");
        TextView t1 =(TextView)findViewById(R.id.textView13);
        TextView t2 =(TextView)findViewById(R.id.button4);
        TextView t3 =(TextView)findViewById(R.id.textView14);
        TextView t4 =(TextView)findViewById(R.id.textView15);
        TextView t5 =(TextView)findViewById(R.id.textView16);
        Button B1=(Button) findViewById(R.id.button8);
        t1.setTypeface(m);
        t2.setTypeface(m);
        t3.setTypeface(m);
        t4.setTypeface(m);
        t5.setTypeface(m);
        B1.setTypeface(m);

    }

    public void start(View view){
        Intent startNewActivity = new Intent(this, Select.class);
        startActivity(startNewActivity);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inst, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
