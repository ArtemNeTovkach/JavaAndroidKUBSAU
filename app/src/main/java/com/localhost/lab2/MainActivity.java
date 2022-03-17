package com.localhost.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button actionMinus;
    private Button actionPlus;
    private Button actionRefresh;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionMinus = findViewById(R.id.actionMinus);
        actionPlus = findViewById(R.id.actionPlus);
        actionRefresh = findViewById(R.id.actionRefresh);
        result = findViewById(R.id.count);
        result.setText("0");

        View.OnClickListener onPlusListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = Integer.parseInt(result.getText().toString()) + 1;
                result.setText(new Integer(counter).toString());
            }
        };
        View.OnClickListener onMinusListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int counter = Integer.parseInt(result.getText().toString()) - 1;
                result.setText(new Integer(counter).toString());
            }
        };
        View.OnClickListener onRefreshListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
            }
        };

        actionPlus.setOnClickListener(onPlusListener);
        actionMinus.setOnClickListener(onMinusListener);
        actionRefresh.setOnClickListener(onRefreshListener);
    }
}