package com.example.edupedia.model;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.HashMap;


/**
 *
 */
public class SchoolDB {
    private SchoolReader schoolReader;
    private HashMap<String, School> db;
    private Context context;

    public SchoolDB(Context context) {
        this.context = context;
        this.schoolReader = SchoolReader.getInstance(context);
    }

    public void loadDB(){
        try {
            db = schoolReader.retrieveSchools();
            Log.d("Successfully Loaded", String.valueOf(db.size()));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, School> getValue() {
        if(db==null) {
            Log.d("SchDB", "Is null");
            loadDB();
        }
        else {
            Log.d("SchDB", "Is Not NULL");
        }
        return db;
    }



}
