package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AddDonorActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView image_back , image_plus , image_min ;
    private TextView tv_title , tv_number ;

    private int counter = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_donor);

        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        tv_number = findViewById(R.id.tv_number);
        image_plus = findViewById(R.id.image_plus);
        image_min = findViewById(R.id.image_min);

        tv_title.setText("تسجيل متبرع");

        image_back.setOnClickListener(this);
        image_plus.setOnClickListener(this);
        image_min.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_back :
                onBackPressed();
                break;
            case R.id.image_plus:
                counter++;
                tv_number.setText(counter + "");
                break;

            case R.id.image_min:

                if (counter <= 1) {
                    counter = 1;
                } else {
                    counter--;
                }
                tv_number.setText(counter + "");

                break;
        }
    }
}