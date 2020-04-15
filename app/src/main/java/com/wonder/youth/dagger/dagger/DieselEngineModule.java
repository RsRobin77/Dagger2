package com.wonder.youth.dagger.dagger;

import com.wonder.youth.dagger.car.DieselEngine;
import com.wonder.youth.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
