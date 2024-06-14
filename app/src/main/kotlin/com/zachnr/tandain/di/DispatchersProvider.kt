package com.zachnr.tandain.di

import kotlinx.coroutines.CoroutineDispatcher

data class DispatchersProvider (
    val io: CoroutineDispatcher,
    val main: CoroutineDispatcher,
    val default: CoroutineDispatcher,
    val unconfined: CoroutineDispatcher
)
