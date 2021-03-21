package co.zw.techsolutes.happyfirst.login;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import co.zw.techsolutes.happyfirst.Mainpage.MainPage;
import co.zw.techsolutes.happyfirst.R;

public class LogOptions extends AppCompatActivity {

    public Button reg, signin;
    private TextView guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_options);

        reg= findViewById(R.id.register);
        signin=findViewById(R.id.sign);
        guest=findViewById(R.id.guest);



        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(getApplicationContext(), Signin.class);
                startActivity(i);
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(getApplicationContext(), Signup.class);
                startActivity(i);
            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(getApplicationContext(), MainPage.class);
                startActivity(i);
            }
        });
    }
}