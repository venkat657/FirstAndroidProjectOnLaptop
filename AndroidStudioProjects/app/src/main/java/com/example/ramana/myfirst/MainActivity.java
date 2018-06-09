package com.example.ramana.myfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button add;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.txtNumber1);
        num2=(EditText)findViewById(R.id.txtNumber2);
        result=(TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                a=a+b;
                result.setText(Integer.toString(a));
            }
        });
    }
}
