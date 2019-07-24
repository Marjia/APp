package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PersonalInformationShow extends AppCompatActivity {

    ImageButton personalinfoEDTBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information_show);

        setTitle("Personal Information");

        personalinfoEDTBTN=(ImageButton)findViewById(R.id.personal_info_edit_btn);

        personalinfoEDTBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pintent=new Intent(PersonalInformationShow.this,PersonalInformationEdit.class);
                startActivity(pintent);
            }
        });




    }
}
