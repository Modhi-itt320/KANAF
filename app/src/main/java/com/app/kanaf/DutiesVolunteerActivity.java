package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DutiesVolunteerActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back;
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duties_volunteer);


        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);

        tv_title.setText("واجبات المتطوع");

        image_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                onBackPressed();
                break;


        }
    }
}