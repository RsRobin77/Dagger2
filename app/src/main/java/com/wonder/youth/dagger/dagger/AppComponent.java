package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
