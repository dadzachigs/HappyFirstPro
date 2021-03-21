package co.zw.techsolutes.happyfirst.Onboarding;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import co.zw.techsolutes.happyfirst.R;

public class OnBoarding1 extends AppCompatActivity {
 public TextView nx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding1);
        nx=findViewById(R.id.next);
        nx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(), Onboarding2.class);
                startActivity(i);
            }
        });


    }
}