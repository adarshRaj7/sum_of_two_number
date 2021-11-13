package com.example.a1st_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity{
    private Button ADD;
    private EditText first_no,second_no;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ADD=findViewById(R.id.ADD);
        first_no=findViewById(R.id.editTextNumber);
        second_no=findViewById(R.id.editTextNumber2);
        ans=findViewById(R.id.textView6);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "done", Toast.LENGTH_SHORT).show();
                String a=first_no.getText().toString();
                int x=Integer.parseInt(a);
                String b=second_no.getText().toString();
                int y=Integer.parseInt(b);

                int n=x+y;
                ans.setText(""+n);
            }
        });
    }

}