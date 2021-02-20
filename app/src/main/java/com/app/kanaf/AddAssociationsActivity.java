package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AddAssociationsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back ;
    private TextView tv_title ;
    private Button btn_all_associations ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_associations);

        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        btn_all_associations = findViewById(R.id.btn_all_associations);

        tv_title.setText("تسجيل جمعيات الأيتام");

        image_back.setOnClickListener(this);
        btn_all_associations.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_back :
                onBackPressed();
                break;

                case R.id.btn_all_associations :
                startActivity(new Intent(AddAssociationsActivity.this , AllAssociationsActivity.class));
                break;
        }
    }
}
