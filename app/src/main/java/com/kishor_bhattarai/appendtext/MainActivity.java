package com.kishor_bhattarai.appendtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int IOT;
    int API;
    EditText etName;
    EditText etAndroid;
    EditText etIOT;
    EditText etAPI;
    Button btnAppend;
    TextView tvText;
    Integer Percent;
    int Android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etAndroid = findViewById(R.id.etandroid);
        etIOT = findViewById(R.id.etIOt);
        etAPI = findViewById(R.id.etAPI);


        btnAppend = findViewById(R.id.btnAppend);
        tvText = findViewById(R.id.tvText);


        btnAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                appendText();
            }
        });

    }

    private void appendText() {


        API = Integer.parseInt(etAPI.getText().toString());
        Android = Integer.parseInt(etAndroid.getText().toString());
        IOT = Integer.parseInt(etIOT.getText().toString());
        Percent = (Android+ API+ IOT)/3;
        // "\n" is used for new line
        tvText.append("NAME:  " + etName.getText().toString() + " , ");
        tvText.append("PERCENTAGE:  " + Percent + "%"+ "\n");


        // Set the first EditText empty

        // Clear the second EditText
        etAndroid.getText().clear();
        etAPI.getText().clear();
        etIOT.getText().clear();
        etName.setText("");



    }
}

