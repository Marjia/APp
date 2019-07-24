package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorkExperianceShow extends AppCompatActivity {

    ImageButton WorkExperianceShowBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_experiance_show);

        setTitle("Work Experiance");

        WorkExperianceShowBTN=(ImageButton)findViewById(R.id.work_experiance_edit_btn);

        WorkExperianceShowBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WorkExperianceEdit.class);
                startActivity(intent);
            }
        });
    }
}
