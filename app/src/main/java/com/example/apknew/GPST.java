package com.example.apknew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GPST extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{
    GoogleMap map;
    EditText txtlatitud, txtlongitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpst);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        map=googleMap;
        this.map.setOnMapClickListener(this);
        this.map.setOnMapLongClickListener(this);
        LatLng Temuco = new LatLng(-38.732544112272784, -72.61014338635862);
        map.addMarker(new MarkerOptions().position(Temuco).title("Tienda Temuco"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Temuco));
        LatLng Santiago = new LatLng(-33.50417213240343, -70.60636028191605);
        map.addMarker(new MarkerOptions().position(Santiago).title("Tienda Santiago"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Santiago));
        LatLng Viña = new LatLng(-33.00694503647138, -71.54747983927574);
        map.addMarker(new MarkerOptions().position(Viña).title("Tienda Viña del Mar"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Viña));

    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }





}