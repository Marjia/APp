package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExtraCurricularActivity extends AppCompatActivity {

    ImageButton ExtraCurricularEditBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_curricular);
        setTitle("Extra Curricular Activity");


        ExtraCurricularEditBTN=(ImageButton)findViewById(R.id.exeurricular_edit_btn);
        ExtraCurricularEditBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ExtraCurricularActivity.this,ExtraCurriculatEdit.class);
                startActivity(intent);
            }
        });


        // ghuma ajke onek taratari ashche ..uff ghum rhsjfkks


    }
}
