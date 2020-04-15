package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.Engine;
import com.wonder.youth.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
