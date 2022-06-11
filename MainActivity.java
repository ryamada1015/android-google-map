package edu.sjsu.android.mygooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}