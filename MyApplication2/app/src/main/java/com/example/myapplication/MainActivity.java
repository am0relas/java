package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    private ImageView imageViewLVL;
    private Button buttonClick;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.text_view_count);
        imageViewLVL = findViewById(R.id.image_view_lvl);
        buttonClick = findViewById(R.id.button_click);

        count = 0;
        textViewCount.setText(count + "");

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textViewCount.setText(count + "");
                switch(count){
                    case 10:
                        imageViewLVL.setImageResource(R.drawable.lvl1);
                        break;
                    case 20:
                        imageViewLVL.setImageResource(R.drawable.lvl2);
                        break;
                    case 30:
                        imageViewLVL.setImageResource(R.drawable.lvl3);
                        break;
                    case 40:
                        imageViewLVL.setImageResource(R.drawable.lvl4);
                        break;
                    case 50:
                        imageViewLVL.setImageResource(R.drawable.lvl5);
                        break;
                }
            }
        });
    }
}