package com.wonder.youth.dagger;

import android.app.Application;

import com.wonder.youth.dagger.dagger.ActivityComponent;
import com.wonder.youth.dagger.dagger.AppComponent;
import com.wonder.youth.dagger.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerAppComponent.create();

    }

    public AppComponent getComponent(){
        return component;
    }

}
