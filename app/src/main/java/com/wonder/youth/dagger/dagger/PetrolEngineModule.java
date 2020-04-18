package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.DieselEngine;
import com.wonder.youth.dagger.car.Engine;
import com.wonder.youth.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {
    public PetrolEngineModule() {
    }

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
