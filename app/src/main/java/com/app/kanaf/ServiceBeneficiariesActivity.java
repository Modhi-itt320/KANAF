package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ServiceBeneficiariesActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView image_back;
    private TextView tv_title, tv_notes , tv_rights_duties , tv_service_network , tv_insurance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_beneficiaries);

        findView();

    }

    private void findView() {
        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        tv_notes = findViewById(R.id.tv_notes);
        tv_rights_duties = findViewById(R.id.tv_rights_duties);
        tv_service_network = findViewById(R.id.tv_service_network);
        tv_insurance = findViewById(R.id.tv_insurance);

        tv_title.setText("خدمة المستفيدين");

        image_back.setOnClickListener(this);
        tv_notes.setOnClickListener(this);
        tv_rights_duties.setOnClickListener(this);
        tv_service_network.setOnClickListener(this);
        tv_insurance.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                onBackPressed();
                break;

            case R.id.tv_service_network:
                startActivity(new Intent(ServiceBeneficiariesActivity.this, ServiceNetworkActivity.class));
                break;

                case R.id.tv_notes:
                startActivity(new Intent(ServiceBeneficiariesActivity.this, NotesActivity.class));
                break;

                case R.id.tv_rights_duties:
                startActivity(new Intent(ServiceBeneficiariesActivity.this, RightsDutiesActivity.class));
                break;

                case R.id.tv_insurance:
                startActivity(new Intent(ServiceBeneficiariesActivity.this, InsuranceActivity.class));
                break;
        }
    }
}
