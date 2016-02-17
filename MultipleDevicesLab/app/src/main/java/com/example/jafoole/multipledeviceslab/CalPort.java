package com.example.jafoole.multipledeviceslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalPort extends AppCompatActivity {

    TextView mTextSunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_port);

        TextView textSunday = (TextView)findViewById(R.id.textSunday);

        textSunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalPort.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
