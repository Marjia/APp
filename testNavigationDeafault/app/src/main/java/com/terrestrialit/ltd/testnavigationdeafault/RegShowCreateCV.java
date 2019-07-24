package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegShowCreateCV extends AppCompatActivity {
    TextView nameTXT;
    Button showCvBTN,createCvBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_show_create_cv);

        nameTXT=(TextView)findViewById(R.id.reg_nametxt);
        showCvBTN=(Button)findViewById(R.id.appCompatButtonShowCv);
        createCvBTN=(Button)findViewById(R.id.appCompatButtonCreateCV);



        String nameFromIntent = getIntent().getStringExtra("NameReg");
        nameTXT.setText(nameFromIntent);


        showCvBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegShowCreateCV.this,MainActivity.class);
                startActivity(intent);
            }
        });

        createCvBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegShowCreateCV.this,CreateCVActivity.class);
                startActivity(intent);
            }
        });
    }
}
