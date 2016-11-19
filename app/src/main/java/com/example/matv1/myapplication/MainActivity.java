package com.example.matv1.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chB1,chB2,chB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        chB1 = (CheckBox) findViewById(R.id.chB1);
        chB2 = (CheckBox) findViewById(R.id.chkB2);
        chB3 = (CheckBox) findViewById(R.id.chB3);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu){
        MenuItem  action_item3 = menu.findItem(R.id.action_item3);
        if(chB2.isChecked()) {

            action_item3.setVisible(true);

        } else {
            action_item3.setVisible(false);
        }

        menu.setGroupVisible(R.id.group1,chB1.isChecked());

        chB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuItem itemMail = menu.findItem(R.id.action_mail);
                if (chB3.isChecked()){itemMail.setVisible(true); }else itemMail.setVisible(false);
            }
        });


        return super.onPrepareOptionsMenu(menu);

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

        /*if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
        }
        else  if (id == R.id.action_item1) {
            Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
        }
        else  if (id == R.id.action_item2) {
            Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.action_item3) {
            Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
        }*/

        switch (id) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_item1:
                Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_item2:
                Toast.makeText(MainActivity.this, "item2", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_item3:
                Toast.makeText(MainActivity.this, "item3", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
