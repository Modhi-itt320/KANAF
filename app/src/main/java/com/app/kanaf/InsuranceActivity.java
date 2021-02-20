package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.kanaf.Adapter.AdapterInsurance;
import com.app.kanaf.Adapter.AdapterServiceNetwork;
import com.app.kanaf.Modle.Insurance;

import java.util.ArrayList;

public class InsuranceActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back;
    private TextView tv_title;
    private RecyclerView rv_insurances ;

    private ArrayList<Insurance> insurances ;
    private AdapterInsurance adapterInsurance ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        findView();

    }

    private void findView() {

        insurances = new ArrayList<>();

        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        rv_insurances = findViewById(R.id.rv_insurances);

        tv_title.setText("بوليصة التأمين ومنافعها");

        image_back.setOnClickListener(this);

        insurances.add(new Insurance("حد الاقامة والإعاشة اليومي للمرافق","غرفة مشتركة بحد أقصى (150) ريال سعودي / يوم"));
        insurances.add(new Insurance("ولادة الأطفال المبتسرين","بحد المنفعة الأقصى لهذه الوثيقة"));
        insurances.add(new Insurance("تكاليف علاج الأسنان","بحد أقصى 2000 ريال سعودي خلال مدة الوثيقة"));
        insurances.add(new Insurance("تكاليف النظارات الطبية","بحد أقصى 400 ريال سعودي خلال مدة الوثيقة"));
        insurances.add(new Insurance(" تكاليف الغسيل الكلوي","بحد أقصى 100 ألف ريال سعودي خلال مدة الوثيقة"));
        insurances.add(new Insurance("إعادة رفات المتوفى إلى موطنه الألي","بحد أقصى 10,000 ريال سعودي خلال مدة الوثيقة"));
        insurances.add(new Insurance("تكاليف حالات التلف في  مامات القلب المكتسلة","بحد أقصى 150,000 ريال سعودي خلال مدة الوثيقة"));
        insurances.add(new Insurance("تكاليف حالات التوحد","بحد أقصى 50,000 ريال سعودي خلال مدة الوثيقة"));

        rv_insurances.setLayoutManager(new LinearLayoutManager(InsuranceActivity.this));
        adapterInsurance = new AdapterInsurance(InsuranceActivity.this, insurances);
        rv_insurances.setAdapter(adapterInsurance);


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
