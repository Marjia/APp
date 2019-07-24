package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TrainingSummaryShowActivity extends AppCompatActivity {


    ImageButton TrSummaryBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_summary_show);

        setTitle("Training Summary");

        TrSummaryBTN=(ImageButton)findViewById(R.id.trainging_info_edit_btn);

        TrSummaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intenttraining=new Intent(TrainingSummaryShowActivity.this,TrainingSummaryEditAct.class);
                startActivity(intenttraining);

            }
        });

    }
}
