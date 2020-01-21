package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resources = getResources();
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Launch ToastActivity when the user taps the Toast Activity button */
    public void launchToastActivity(View view) {
        Intent intent = new Intent(this, HelloToastActivity.class);
        startActivity(intent);
    }

    /** Launch ScrollActivity when the user taps the Scroll Activity button */
    public void scrollActivity(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }
}
