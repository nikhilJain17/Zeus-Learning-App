package com.hello.learning.zeuslearningapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class WelcomeMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_menu);

        Button login = (Button) findViewById(R.id.button2);


    }



        public void hello (View view) {

            Intent intent = new Intent(this, ChooseTopic.class);
            startActivity(intent);


        }


        public void login(View view) {

            Intent intent = new Intent(this, SetupAccount.class);
            startActivity(intent);

        }

        public void niqqa (View view) {

            Intent intent = new Intent(this, SetupAccount.class);
            startActivity(intent);
        }











// below are pregenerated functions - please don't touch
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
