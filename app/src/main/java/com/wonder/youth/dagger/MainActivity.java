package com.wonder.youth.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wonder.youth.dagger.car.Car;
import com.wonder.youth.dagger.dagger.CarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component=DaggerCarComponent.create();
        component.inject(this);

        car.Drive();
    }
}
