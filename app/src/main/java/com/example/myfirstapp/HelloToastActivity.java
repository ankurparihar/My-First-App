package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloToastActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);

        // set default count value
        mCount = MainActivity.resources.getInteger(R.integer.default_toast_count);
        mShowCount = (TextView) findViewById(R.id.toast_show_count);
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    /** Show toast when user clicks TOAST button */
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Increment counter when user clicks COUNT button */
    public void countUp(View view) {
        ++mCount;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
