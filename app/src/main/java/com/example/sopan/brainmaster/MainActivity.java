package com.example.sopan.brainmaster;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "small.ttf");
        TextView mytextview = (TextView)findViewById(R.id.textView);
                mytextview.setTypeface(mytypeface);
        TextView mytextview8 = (TextView)findViewById(R.id.textView8);
        mytextview8.setTypeface(mytypeface);
        mytextview8.setVisibility(View.INVISIBLE);

        Button B1=(Button) findViewById(R.id.button);
        B1.setTypeface(mytypeface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void send(View view){
        EditText ed=(EditText)findViewById(R.id.editText);
        String msg=ed.getText().toString();
        if(msg.length()==0){
            TextView mytextview8 = (TextView)findViewById(R.id.textView8);

            mytextview8.setVisibility(View.VISIBLE);
        }

        else {
            Intent startNewActivity = new Intent(this, Main2Activity.class);
            EditText theEditText = (EditText) findViewById(R.id.editText);
            String message = theEditText.getText().toString();
            startNewActivity.putExtra(EXTRA_MESSAGE, message);
            startActivity(startNewActivity);
            finish();
        }
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
