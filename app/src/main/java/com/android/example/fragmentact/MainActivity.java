package com.android.example.fragmentact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button activtyButton;
    private Button fragmentButton;
    public static final String MY_KEY = "My Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.userInput);
        activtyButton = findViewById(R.id.activityButton);
        fragmentButton = findViewById(R.id.fragmentButton);

        activtyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                intent.putExtra(MY_KEY, userInput.getText().toString());
                startActivity(intent);
            }
        });

        fragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, MessageFragment.sendData(userInput.getText().toString()))
                        .commit();
            }
        });

    }//end of onCreate

}
