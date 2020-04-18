package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.DieselEngine;
import com.wonder.youth.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
