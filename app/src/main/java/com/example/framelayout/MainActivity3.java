package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {
    EditText text02;
    Button button02;
    TextView textView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text02 = findViewById(R.id.text01);
        button02 = findViewById(R.id.button01);
        textView3 = findViewById(R.id.textView2);

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = text02.getText().toString();
                //Conversion of string from double
                double kilos = Double.parseDouble(inputText);
                double lbs  = makeConversions(kilos);
                textView3.setText(new DecimalFormat("##.##").format(lbs));
                Toast.makeText(MainActivity3.this, "Converting", Toast.LENGTH_SHORT).show();
                Log.i("Logs","Button clicked");
            }
        });

    }
    public double makeConversions(double kilos)
    {
        // 1 kilos = 2.22 lbs

        double answer = kilos*2.22;
        return answer;

    }
}