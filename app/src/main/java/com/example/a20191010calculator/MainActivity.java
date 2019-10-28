package com.example.a20191010calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inT1;
    EditText inT2;
    TextView ouText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inT1=(EditText)findViewById(R.id.inText1);
        inT2=(EditText)findViewById(R.id.inText2);
        ouText=(TextView)findViewById(R.id.outText);

        Button PlusBttn  = (Button) findViewById(R.id.bttnPlus);
        PlusBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String inS1 = inT1.getText().toString();
                String inS2 = inT2.getText().toString();
                int int1 = new Integer(inS1).intValue();
                int int2 = new Integer(inS2).intValue();
                String s = Integer.toString(int1 + int2);
                ouText.setText(s);
            }
        });
    }
}
