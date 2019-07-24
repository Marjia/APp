package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Education_Info_show extends AppCompatActivity {

    ImageButton AcademicInfoEditButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education__info_show);

        setTitle("Show Academic Info");

        AcademicInfoEditButton=(ImageButton)findViewById(R.id.academic_info_edit_btn);

        AcademicInfoEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),EducationQualificationEdit.class);
                startActivity(intent);
            }
        });
        }
}
