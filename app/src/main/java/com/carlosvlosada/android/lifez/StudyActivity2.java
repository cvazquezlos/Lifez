package com.carlosvlosada.android.lifez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by c.vazquezlos on 22/08/2016.
 */
public class StudyActivity2 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_2);

        Button returnScreen = (Button) findViewById(R.id.return_button);
        returnScreen.setOnClickListener(new View.OnClickListener() {
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

        Button changeScreen = (Button) findViewById(R.id.next_button);
        changeScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent studyScreen2 = new Intent(view.getContext(), StudyActivity3.class);
                startActivityForResult(studyScreen2, 0);
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });

        ImageButton homeScreen = (ImageButton) findViewById(R.id.home_button);
        homeScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent homescreen = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(homescreen, 0);
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });
    }

}
