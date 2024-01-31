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

public class MainActivity2 extends AppCompatActivity {
    EditText text01;
    Button button01;
    TextView textView2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text01 = findViewById(R.id.text01);
        button01 = findViewById(R.id.button01);
        textView2 = findViewById(R.id.textView2);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = text01.getText().toString();
                //Conversion of string from double
                double cms = Double.parseDouble(inputText);
                double feet  = makeConversion(cms);
                textView2.setText(new DecimalFormat("##.##").format(feet));
                Toast.makeText(MainActivity2.this, "Converting", Toast.LENGTH_SHORT).show();
                Log.i("Logs","Button clicked");
            }
        });

    }
    public double makeConversion(double cms)
    {
        // 100 cm = 1 m

        double ans = cms/30.48;
        return ans;

    }
}