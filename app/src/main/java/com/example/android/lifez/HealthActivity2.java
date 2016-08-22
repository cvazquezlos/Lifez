package com.example.android.lifez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by c.vazquezlos on 22/08/2016.
 */
public class HealthActivity2 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_2);

        Button returnScreen = (Button) findViewById(R.id.return_button);
        returnScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button changeScreen = (Button) findViewById(R.id.next_button);
        changeScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sportScreen2 = new Intent(view.getContext(), HealthActivity3.class);
                startActivityForResult(sportScreen2, 0);
            }
        });

        ImageButton homeScreen = (ImageButton) findViewById(R.id.home_button);
        homeScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sportScreen2 = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(sportScreen2, 0);
            }
        });
    }

}
