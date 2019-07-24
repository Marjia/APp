package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SpecializationActivity extends AppCompatActivity {

    ImageButton spcialeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization);

        setTitle("Specialization");

        spcialeBTN=(ImageButton)findViewById(R.id.specialization_edit_btn);

        spcialeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSpcl=new Intent(SpecializationActivity.this,SpecializationEditActivity.class);
                startActivity(intentSpcl);
            }
        });


    }
}
