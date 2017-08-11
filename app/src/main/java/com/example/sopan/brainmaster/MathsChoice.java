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

public class MathsChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_choice);
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "small.ttf");
        TextView t5=(TextView)findViewById(R.id.textView7);
        t5.setTypeface(mytypeface);

        Button B1=(Button) findViewById(R.id.button5);
        B1.setTypeface(mytypeface);


        Button B2=(Button) findViewById(R.id.button14);
        B2.setTypeface(mytypeface);

        Button B3=(Button) findViewById(R.id.button7);
        B3.setTypeface(mytypeface);

    }
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    String ivalue;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_maths_choice, menu);
        return true;
    }
    public void sendmb(View view){
         ivalue="0";
        Intent startNewActivity = new Intent(this, basicmaths.class);
        startNewActivity.putExtra(EXTRA_MESSAGE, ivalue);
        startActivity(startNewActivity);
    }
    public void sendmi(View view){
        ivalue="5";
        Intent startNewActivity = new Intent(this, basicmaths.class);
        startNewActivity.putExtra(EXTRA_MESSAGE, ivalue);
        startActivity(startNewActivity);
    }
    public void sendme(View view){
        ivalue="10";

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
