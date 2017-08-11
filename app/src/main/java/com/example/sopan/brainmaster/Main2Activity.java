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

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "small.ttf");
        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView t2=(TextView)findViewById(R.id.textView2);
        t2.setTypeface(mytypeface);
        t2.setText(message);




        TextView t4=(TextView)findViewById(R.id.textView4);
        t4.setTypeface(mytypeface);


        TextView t5=(TextView)findViewById(R.id.textView5);
        t5.setTypeface(mytypeface);


        Button B1=(Button) findViewById(R.id.button2);
        B1.setTypeface(mytypeface);



    }

    public void send1(View view){
        Intent startNewActivity = new Intent(this, inst.class);

        startActivity(startNewActivity);
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
