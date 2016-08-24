package com.example.android.lifez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by c.vazquezlos on 22/08/2016.
 */
public class HealthActivity1 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_1);

        Button homeScreen = (Button) findViewById(R.id.home_button);
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

        Button changeScreen = (Button) findViewById(R.id.next_button);
        changeScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sportScreen2 = new Intent(view.getContext(), HealthActivity2.class);
                startActivityForResult(sportScreen2, 0);
                try {
                    this.finalize();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });
    }

}
