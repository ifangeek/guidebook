package com.example.myapplication.data.datasource.rest.api.interfaces

import com.example.myapplication.data.datasource.model.response.DepartmentResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiGuideBookService {

    @GET("api/v1/personas/")
    fun listDepartment() : Single<Response<List<DepartmentResponse>>>
}