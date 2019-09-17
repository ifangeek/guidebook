package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.datasource.rest.DepartmentDataSource
import com.example.myapplication.data.datasource.rest.IDepartmentDataSource
import com.example.myapplication.data.datasource.rest.api.ApiClient
import com.example.myapplication.data.repository.DepartmentRepositoryImpl
import com.example.myapplication.domain.repository.DepartmentRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    var listofModules = module {
        single { ApiClient() }
        single<DepartmentRepository>{ DepartmentRepositoryImpl()}
        single<IDepartmentDataSource>{DepartmentDataSource()}
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(listofModules)
        }
    }
}