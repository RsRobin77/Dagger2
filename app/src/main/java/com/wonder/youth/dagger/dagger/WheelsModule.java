package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.Rims;
import com.wonder.youth.dagger.car.Tires;
import com.wonder.youth.dagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }


    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
