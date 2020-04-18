package com.wonder.youth.dagger;

import android.app.Application;

import com.wonder.youth.dagger.dagger.CarComponent;
import com.wonder.youth.dagger.dagger.DaggerCarComponent;

public class ExampleApp extends Application {

    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }

    public CarComponent getComponent(){
        return component;
    }

}
