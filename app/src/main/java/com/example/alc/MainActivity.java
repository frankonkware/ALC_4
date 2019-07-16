package com.example.alc;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button about_alc, my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        about_alc = (Button)  findViewById(R.id.button2);
        my_profile = (Button)  findViewById(R.id.button3);

        /**
         * Go to Andela home
         **/
        about_alc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent go_alc_home = new Intent(getApplicationContext(), ALCActivity.class);

                startActivity(go_alc_home);
            }

        });


        /**
         * Go to my profile
         **/
        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent profile_intent =new Intent(getApplicationContext(), MyProfileActivity.class);
                startActivity(profile_intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
