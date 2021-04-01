package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int value2 = intent.getIntExtra("Key_2", 0);
        if (value2==5){
            ImageView imageView =    findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.vs_red_a);

        }
        else if (value2==3){
            ImageView imageView =    findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.vsmart_live_xanh);
        }
        else if (value2==4){
            ImageView imageView =    findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.vsmart_black_star);
        }
        else if (value2==1){
            ImageView imageView =    findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.vs_bac);
        }

        Button btnChonmau = findViewById(R.id.btnChonMau);
        btnChonmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScreenAcctivity.class);
                startActivity(intent);
            }
        });


    }


}