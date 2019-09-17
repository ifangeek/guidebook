package com.example.myapplication.data.datasource.model.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class DepartmentResponse(
    @Json(name = "name")val  name : String,
    @Json(name = "id") val id:Long
)