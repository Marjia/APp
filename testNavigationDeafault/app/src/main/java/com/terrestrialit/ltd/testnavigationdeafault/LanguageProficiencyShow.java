package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LanguageProficiencyShow extends AppCompatActivity {


    ImageButton languageEdtBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_proficiency_show);

        setTitle("Language Proficiency");

        languageEdtBTN=(ImageButton)findViewById(R.id.language_edit_btn);

        languageEdtBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lintent=new Intent(LanguageProficiencyShow.this,LanguageProficiencyEditActivity.class);
                startActivity(lintent);
            }
        });
    }
}
