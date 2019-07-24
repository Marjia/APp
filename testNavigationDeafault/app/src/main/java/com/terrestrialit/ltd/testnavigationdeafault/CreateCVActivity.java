package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateCVActivity extends AppCompatActivity {
    Button saveBTNCRE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cv);

        saveBTNCRE=(Button)findViewById(R.id.save_cv_btn);

        saveBTNCRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CreateCVActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
