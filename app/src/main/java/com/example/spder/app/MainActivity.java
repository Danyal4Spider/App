package com.example.spder.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button increse, decrese;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increse= (Button) findViewById(R.id.increse );
        decrese= (Button) findViewById(R.id.decrese );
        output= (TextView) findViewById(R.id.output );
    }



    public void IncreseClicked (View v){
        int CurrentNember = Integer.parseInt(output.getText().toString());
        output.setText(CurrentNember + 1 + "");

    }

    public void DecreseClicked (View v){
        int CurrentNember = Integer.parseInt(output.getText().toString());
        output.setText(CurrentNember - 1 + "");
    }
}
