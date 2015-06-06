package com.example.a.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSpotifyStreamer = (Button) findViewById(R.id.buttonSpotifyStreamer);
        buttonSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonSpotifyStreamerText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        Button buttonScoresApp = (Button) findViewById(R.id.buttonScoresApp);
        buttonScoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonScoresAppText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonLibraryApp = (Button) findViewById(R.id.buttonLibraryApp);
        buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonLibraryAppText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonBuildItBiggerText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buttonXYZReader = (Button) findViewById(R.id.buttonXYZReader);
        buttonXYZReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonXYZReaderText), Toast.LENGTH_SHORT);
                toast.show();
            }
        });



        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, getString(R.string.buttonCapstoneText), Toast.LENGTH_SHORT);
                toast.show();
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

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
