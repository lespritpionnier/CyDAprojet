package com.cyu.viveda;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AddPlayList extends AppCompatActivity {

    String name;
    ArrayList<String> list_items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_playliste);
    }

    public void setListSelected (ArrayList<String> list){
        list_items=list;

    }
    public ArrayList<String> setListSelected (){
        return list_items;

    }
    public void done(View view) {
        EditText eTname = findViewById(R.id.editText);
        name = eTname.getText().toString();
        if(name.trim().equals("")) {
            eTname.setError( "Name is required" );
            eTname.setHint("Please enter an event name");
            return;
        }
    }
}
