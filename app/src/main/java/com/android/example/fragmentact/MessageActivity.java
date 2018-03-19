package com.android.example.fragmentact;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private TextView myText;
    private String output;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        output = getIntent().getStringExtra(MainActivity.MY_KEY);
        myText = findViewById(R.id.messageTextView);
        myText.setText(output);

    }
}
