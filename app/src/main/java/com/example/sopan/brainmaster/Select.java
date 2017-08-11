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

public class Select extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

       Typeface mytypeface = Typeface.createFromAsset(getAssets(), "small.ttf");
        TextView t5=(TextView)findViewById(R.id.textView6);
        t5.setTypeface(mytypeface);

        Button B1=(Button) findViewById(R.id.button3);
        B1.setTypeface(mytypeface);

        Button B4=(Button) findViewById(R.id.button4);
        B4.setTypeface(mytypeface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select, menu);
        return true;
    }
    public void sendg(View view){
        Intent startNewActivity = new Intent(this, gkchoice.class);

        startActivity(startNewActivity);
    }
    public void sendm(View view){
        Intent startNewActivity = new Intent(this, MathsChoice.class);

        startActivity(startNewActivity);
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
