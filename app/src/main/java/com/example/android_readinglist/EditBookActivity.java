package com.example.android_readinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EditBookActivity extends AppCompatActivity {
    private String title, reasonToRead, id;
    private Boolean hasBeenRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_book);
        


    }
}
