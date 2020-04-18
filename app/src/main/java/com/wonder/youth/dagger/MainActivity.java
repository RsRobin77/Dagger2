package com.wonder.youth.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wonder.youth.dagger.car.Car;
import com.wonder.youth.dagger.dagger.ActivityComponent;
import com.wonder.youth.dagger.dagger.DaggerAppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        ActivityComponent component= DaggerActivityComponent.builder()
                .horsePoer(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp)getApplication()).getComponent())
                .build();
        component.inject(this);

        car1.Drive();
        car2.Drive();
    }
}
