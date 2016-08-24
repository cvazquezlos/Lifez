package com.example.android.lifez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by c.vazquezlos on 22/08/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sportScreen = (Button) findViewById(R.id.sport_button);
        sportScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sportScreen1 = new Intent(view.getContext(), HealthActivity1.class);
                startActivityForResult(sportScreen1, 0);
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });

        Button studyScreen = (Button) findViewById(R.id.study_button);
        studyScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent studyScreen1 = new Intent(view.getContext(), StudyActivity1.class);
                startActivityForResult(studyScreen1, 0);
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });

    }

}
