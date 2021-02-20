package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DonorServiceActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView image_back ;
    private TextView tv_title ;
    private FloatingActionButton btn_add_donor ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_service);


        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        btn_add_donor = findViewById(R.id.btn_add_donor);

        tv_title.setText("خدمة المتبرعين");

        image_back.setOnClickListener(this);
        btn_add_donor.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_back :
                onBackPressed();
                break;

                case R.id.btn_add_donor :
                startActivity(new Intent(DonorServiceActivity.this, AddDonorActivity.class));
                break;
        }
    }
}