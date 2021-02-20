package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.kanaf.Adapter.AdapterServiceNetwork;
import com.app.kanaf.Modle.Service;

import java.util.ArrayList;

public class StatisticsActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView image_back;
    private TextView tv_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        findView();

    }

    private void findView() {

        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);

        tv_title.setText("إحصاءات عامة");

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
