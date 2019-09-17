package com.example.myapplication.data.datasource.rest.api

import com.example.myapplication.BuildConfig
import com.example.myapplication.utils.Constants
import com.example.myapplication.data.datasource.rest.api.interfaces.ApiGuideBookService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class ApiClient {

    fun getGuideBookService(): ApiGuideBookService? {

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level =
            if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE


        val securityInterceptor = object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
                val original = chain.request()

                val request = original.newBuilder()
                    .method(original.method, original.body)
                    .build()

                return chain.proceed(request)

            }
        }

        val okHttpClient = OkHttpClient().newBuilder()
            .connectTimeout(180, TimeUnit.SECONDS)
            .readTimeout(180, TimeUnit.SECONDS)
            .writeTimeout(180, TimeUnit.SECONDS)
            .addInterceptor(securityInterceptor)
            .addInterceptor(httpLoggingInterceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(ApiGuideBookService::class.java)


    }
}