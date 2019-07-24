package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Reference extends AppCompatActivity {

    ImageButton ReferenceEditBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        setTitle("Reference");


        ReferenceEditBTN=(ImageButton)findViewById(R.id.reference_edit_btn);
        ReferenceEditBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Reference.this,ReferenceEdit.class);
                startActivity(intent);
            }
        });
    }
}
