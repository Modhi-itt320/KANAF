package com.app.kanaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.kanaf.Adapter.AdapterAssociations;
import com.app.kanaf.Modle.Associations;

import java.util.ArrayList;

public class AllAssociationsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image_back ;
    private TextView tv_title ;
    private RecyclerView rv_associations ;

    private AdapterAssociations adapterAssociations ;
    private ArrayList<Associations> associations ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_associations);

        findView();

    }

    private void findView() {

        associations = new ArrayList<>();

        image_back = findViewById(R.id.image_back);
        tv_title = findViewById(R.id.tv_title);
        rv_associations = findViewById(R.id.rv_associations);

        tv_title.setText("جمعيات الأيتام");

        image_back.setOnClickListener(this);

        associations.add(new Associations("الجمعية الخيرية لرعاية الأيتام","مكة المكرمة","123456789","رعاية ايتام"));
        associations.add(new Associations("جمعية رعاية الأيتام بعرعر","عرعر","123456789","رعاية ايتام"));
        associations.add(new Associations("الجمعية الخيرية لرعاية الأيتام بالمدينة المنورة","المدينة المنورة","123456789","رعاية ايتام"));
        associations.add(new Associations("الجمعية الخيرية لرعاية الأيتام بالرس","الرس","123456789","رعاية ايتام"));
        associations.add(new Associations("جمعية رعاية الأيتام بجدة","جدة","123456789","رعاية ايتام"));

        rv_associations.setLayoutManager(new LinearLayoutManager(AllAssociationsActivity.this));
        adapterAssociations = new AdapterAssociations(AllAssociationsActivity.this, associations);
        rv_associations.setAdapter(adapterAssociations);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_back :
                onBackPressed();
                break;
        }
    }
}
