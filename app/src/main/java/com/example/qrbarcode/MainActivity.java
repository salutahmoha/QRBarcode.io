package com.example.qrbarcode;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.tech.NfcBarcode;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.TextView;

import com.google.android.gms.vision.CameraSource;

public class MainActivity extends AppCompatActivity {

    SurfaceView surfaceView;
    CamereSource cameresource;
    TextView textView;
    Barc


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceView = (SurfaceView) findViewById(R.id.camerapreview);
        textView = (TextView) findViewById(R.id.textView);

    }
}