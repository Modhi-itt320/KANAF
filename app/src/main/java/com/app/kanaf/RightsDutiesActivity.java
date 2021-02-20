package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.kanaf.Adapter.AdapterAssociations;
import com.app.kanaf.Adapter.AdapterRightsDuties;
import com.app.kanaf.Modle.RightsDuties;

import java.util.ArrayList;

public class RightsDutiesActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back;
    private TextView tv_title;
    private RecyclerView rv_rights_duties;

    private ArrayList<RightsDuties> rights_duties;
    private AdapterRightsDuties adapterRightsDuties ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rights_duties);

        findView();

    }

    private void findView() {

        rights_duties = new ArrayList<>();

        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        rv_rights_duties = findViewById(R.id.rv_rights_duties);

        tv_title.setText("الحقوق والواجبات");

        image_back.setOnClickListener(this);

        rights_duties.add(new RightsDuties("1- يحق لك الحصول على المنافع الصحية المحددة في وثيقة التأمين منذ بداية التغطية التأمنية"));
        rights_duties.add(new RightsDuties("2- الحد الاقصى لمنافع وثيقة التأمين الصحي خلال سريان وثيقتك 500 ألف ريال"));
        rights_duties.add(new RightsDuties("3- تتلزم شركة التأمين بتقديم خدمات الرعاية الصحية لك من خلال شبكة مقدمي خدمة صحية تغطي كافة مناطق المملكة"));
        rights_duties.add(new RightsDuties("4- 15 يوم عمل هي أقصى مدة لشركة التأمين لسداد المبالغ المالية التي دفعتها في الحالات الطارئة من تاريخ تقديمك طلب الاسترجاع"));
        rights_duties.add(new RightsDuties("5- لا تسمح لغيرك بالاحتيال بأستخدام بطاقة التأمين الخاصة بك"));
        rights_duties.add(new RightsDuties("6- نسبة التحمل تدفع عند تلقي خدمة الرعاية الصحية ان وجدت عدا في الحالات الطارئة و التنويع"));
//        rights_duties.add(new RightsDuties(""));


        rv_rights_duties.setLayoutManager(new LinearLayoutManager(RightsDutiesActivity.this));
        adapterRightsDuties = new AdapterRightsDuties(RightsDutiesActivity.this, rights_duties);
        rv_rights_duties.setAdapter(adapterRightsDuties);

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
