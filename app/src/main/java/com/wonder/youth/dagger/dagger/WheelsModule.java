package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.Rims;
import com.wonder.youth.dagger.car.Tires;
import com.wonder.youth.dagger.car.Wheels;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Singleton
    @Provides
    static Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }


    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
