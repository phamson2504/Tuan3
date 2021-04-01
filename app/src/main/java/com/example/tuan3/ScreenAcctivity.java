package com.example.tuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenAcctivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);
        Button btnxanh = findViewById(R.id.btnBac);
        btnxanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView =    findViewById(R.id.phoneRed);
                imageView.setImageResource(R.drawable.vs_bac);
                TextView text =  findViewById(R.id.textmau);
                text.setText("Bạc");
            }
        });

        Button btnDo = findViewById(R.id.btnDo);
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView =    findViewById(R.id.phoneRed);
                imageView.setImageResource(R.drawable.vs_red_a);
                TextView text =  findViewById(R.id.textmau);
                text.setText("Đỏ");
            }
        });
        Button btnDen = findViewById(R.id.btnDen);
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView =    findViewById(R.id.phoneRed);
                imageView.setImageResource(R.drawable.vsmart_black_star);
                TextView text =  findViewById(R.id.textmau);
                text.setText("Đen");
            }
        });
        Button btnXanhDam = findViewById(R.id.btnXanhDam);
        btnXanhDam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView =    findViewById(R.id.phoneRed);
                imageView.setImageResource(R.drawable.vsmart_live_xanh);
                TextView text =  findViewById(R.id.textmau);
                text.setText("Xanh");
            }
        });

        Button btnXong = findViewById(R.id.btnXong);
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenAcctivity.this, MainActivity.class);
                TextView text =  findViewById(R.id.textmau);
                String a= text.getText().toString();
                if (a.equals("Xanh")){
                    intent.putExtra("Key_2", 3);

                }
                if (a.equals("Đỏ")) {
                    intent.putExtra("Key_2", 5);
                }
                if (a.equals("Đen")) {
                    intent.putExtra("Key_2", 4);
                }
                if (a.equals("Bạc")) {
                    intent.putExtra("Key_2", 1);
                }
                startActivity(intent);
            }
        });

    }
}
