package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t =(TextView)findViewById(R.id.textView);
        final Button b1 = (Button)findViewById(R.id.button1);
        final Button b2 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font+5;
                if(font == 50)
                    font = 30;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1: t.setTextColor(Color.RED);break;
                    case 2: t.setTextColor(Color.GREEN);break;
                    case 3: t.setTextColor(Color.BLUE);break;
                    case 4: t.setTextColor(Color.CYAN);break;
                    case 5: t.setTextColor(Color.YELLOW);break;
                    case 6: t.setTextColor(Color.MAGENTA);break;



                }

                ch++;
                if(ch == 7) ch =1;
            }
        });

    }
}
package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}
package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}
