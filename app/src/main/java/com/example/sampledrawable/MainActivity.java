package com.example.sampledrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvContent;
    Button btnClick;
    String content[]={"국내발생 386명", "해외유입 23명", "사망자 15명"};
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContent=findViewById(R.id.tvContent);
        btnClick=findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==3){
                    num=0;
                }
                tvContent.setText("코로나 현황\n"+content[num]);
                num++;
            }
        });
    }
}