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

public class gkchoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gkchoice);

        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "small.ttf");
        TextView t5=(TextView)findViewById(R.id.textView9);
        t5.setTypeface(mytypeface);

        Button B1=(Button) findViewById(R.id.button6);
        B1.setTypeface(mytypeface);


        Button B2=(Button) findViewById(R.id.button13);
        B2.setTypeface(mytypeface);

        Button B3=(Button) findViewById(R.id.button15);
        B3.setTypeface(mytypeface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gkchoice, menu);
        return true;
    }
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    String ivalue;
    public void sendmb(View view){
        ivalue="15";
        Intent startNewActivity = new Intent(this, basicmaths.class);
        startNewActivity.putExtra(EXTRA_MESSAGE, ivalue);
        startActivity(startNewActivity);
    }

    public void sendmi(View view){
        ivalue="20";
        Intent startNewActivity = new Intent(this, basicmaths.class);
        startNewActivity.putExtra(EXTRA_MESSAGE, ivalue);
        startActivity(startNewActivity);
    }

    public void sendme(View view){
        ivalue="25";

        Intent startNewActivity = new Intent(this, basicmaths.class);
        startNewActivity.putExtra(EXTRA_MESSAGE, ivalue);
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
