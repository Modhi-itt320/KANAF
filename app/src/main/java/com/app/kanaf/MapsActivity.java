package com.app.kanaf;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker MyMarker;

    private double lat, lng;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        lat = getIntent().getExtras().getDouble("lat");
        lng = getIntent().getExtras().getDouble("lng");
        name = getIntent().getExtras().getString("name");

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        moveMap(lat, lng, name);

    }


    private void moveMap(double latitude, double longitude, String name) {
        Log.e("latitude", latitude + "");
        Log.e("longitude", longitude + "");

        if (MyMarker != null) {
            MyMarker.remove();
        }
        LatLng latLng = new LatLng(latitude, longitude);
        MyMarker = mMap.addMarker(new MarkerOptions().position(latLng).title(name));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15));
        mMap.getUiSettings().setZoomControlsEnabled(false);


    }

}
