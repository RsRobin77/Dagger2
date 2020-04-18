package com.wonder.youth.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wonder.youth.dagger.car.Car;
import com.wonder.youth.dagger.dagger.CarComponent;
import com.wonder.youth.dagger.dagger.DaggerCarComponent;
import com.wonder.youth.dagger.dagger.DieselEngineModule;
import com.wonder.youth.dagger.dagger.PetrolEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component=((ExampleApp)getApplication()).getComponent();
        component.inject(this);

        car1.Drive();
        car2.Drive();
    }
}
