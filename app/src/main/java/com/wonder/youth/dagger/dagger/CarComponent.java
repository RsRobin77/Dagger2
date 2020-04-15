package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.MainActivity;
import com.wonder.youth.dagger.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

void inject(MainActivity mainActivity);
}
