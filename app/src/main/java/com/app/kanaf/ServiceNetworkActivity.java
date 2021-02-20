package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.kanaf.Adapter.AdapterRightsDuties;
import com.app.kanaf.Adapter.AdapterServiceNetwork;
import com.app.kanaf.Modle.Service;

import java.util.ArrayList;

public class ServiceNetworkActivity extends AppCompatActivity  implements View.OnClickListener {


    private ImageView image_back;
    private TextView tv_title;
    private RecyclerView rv_service_network ;

    private AdapterServiceNetwork adapterServiceNetwork ;
    private ArrayList<Service> serviceArrayList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_network);

        findView();

    }

    private void findView() {

        serviceArrayList = new ArrayList<>();

        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        rv_service_network = findViewById(R.id.rv_service_network);

        tv_title.setText("شبكة الخدمة");

        image_back.setOnClickListener(this);

        serviceArrayList.add(new Service("مستشفى النور التخصصي",23.876984,51.7879779));
        serviceArrayList.add(new Service("مستوصف سلامات",27.4986915,41.7292027));
        serviceArrayList.add(new Service("مستوصف الرحمة ",32.2184734,35.2711016));
        serviceArrayList.add(new Service("المستوصف الأهلي",29.765323,40.6977935));

        rv_service_network.setLayoutManager(new LinearLayoutManager(ServiceNetworkActivity.this));
        adapterServiceNetwork = new AdapterServiceNetwork(ServiceNetworkActivity.this, serviceArrayList);
        rv_service_network.setAdapter(adapterServiceNetwork);

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
