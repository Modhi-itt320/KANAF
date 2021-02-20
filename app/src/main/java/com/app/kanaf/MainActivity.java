package com.app.kanaf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout line_AddAssociationsActivity, line_beneficiary_registration, line_donor_service, line_service_beneficiaries;
    private LinearLayout nav_main, nav_about , nav_volunteer_service , nav_statistics;

    private DrawerLayout drawer;
    private ImageView image_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();


    }

    private void findView() {
        drawer = findViewById(R.id.drawer_layout);
        image_menu = findViewById(R.id.image_menu);

        line_AddAssociationsActivity = findViewById(R.id.line_AddAssociationsActivity);
        line_beneficiary_registration = findViewById(R.id.line_beneficiary_registration);
        line_donor_service = findViewById(R.id.line_donor_service);
        line_service_beneficiaries = findViewById(R.id.line_service_beneficiaries);

        nav_main = findViewById(R.id.nav_main);
        nav_about = findViewById(R.id.nav_about);
        nav_statistics = findViewById(R.id.nav_statistics);
        nav_volunteer_service = findViewById(R.id.nav_volunteer_service);

        image_menu.setOnClickListener(this);

        line_AddAssociationsActivity.setOnClickListener(this);
        line_beneficiary_registration.setOnClickListener(this);
        line_donor_service.setOnClickListener(this);
        line_service_beneficiaries.setOnClickListener(this);

        nav_main.setOnClickListener(this);
        nav_about.setOnClickListener(this);
        nav_statistics.setOnClickListener(this);
        nav_volunteer_service.setOnClickListener(this);

    }


    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.line_AddAssociationsActivity:
                startActivity(new Intent(MainActivity.this, AddAssociationsActivity.class));
                break;

            case R.id.line_beneficiary_registration:
                startActivity(new Intent(MainActivity.this, BeneficiaryRegistrationActivity.class));
                break;

            case R.id.line_donor_service:
                startActivity(new Intent(MainActivity.this, DonorServiceActivity.class));
                break;

            case R.id.line_service_beneficiaries:
                startActivity(new Intent(MainActivity.this, ServiceBeneficiariesActivity.class));
                break;

            case R.id.image_menu:
                drawer.openDrawer(Gravity.START);
                break;

            case R.id.nav_main:
                drawer.closeDrawer(Gravity.START);
                break;

            case R.id.nav_about:
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;

                case R.id.nav_volunteer_service:
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this, VolunteerServiceActivity.class));
                break;

                case R.id.nav_statistics:
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this, StatisticsActivity.class));
                break;

        }
    }
}
