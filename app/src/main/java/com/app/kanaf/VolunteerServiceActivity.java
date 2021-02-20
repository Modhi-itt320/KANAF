package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VolunteerServiceActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back;
    private TextView tv_title , tv_volunteer_rights , tv_duties_volunteer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_service);

        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        tv_volunteer_rights = findViewById(R.id.tv_volunteer_rights);
        tv_duties_volunteer = findViewById(R.id.tv_duties_volunteer);

        tv_title.setText("خدمة المتطوعين");

        image_back.setOnClickListener(this);
        tv_volunteer_rights.setOnClickListener(this);
        tv_duties_volunteer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                onBackPressed();
                break;
            case R.id.tv_volunteer_rights:
                startActivity(new Intent(VolunteerServiceActivity.this, VolunteerRightsActivity.class));
                break;

                case R.id.tv_duties_volunteer:
                startActivity(new Intent(VolunteerServiceActivity.this, DutiesVolunteerActivity.class));
                break;

        }
    }
}