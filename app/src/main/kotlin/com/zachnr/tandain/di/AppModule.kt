package com.zachnr.tandain.di

import kotlinx.coroutines.Dispatchers
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dispatchersProviderModule = module {
    single {
        DispatchersProvider(
            get(named("IO")),
            get(named("Main")),
            get(named("Default")),
            get(named("Unconfined")),
        )
    }
    single (named("IO")) { Dispatchers.IO}
    single (named("Main")) { Dispatchers.Main}
    single (named("Default")) { Dispatchers.Default}
    single (named("Unconfined")) { Dispatchers.Unconfined}
}
