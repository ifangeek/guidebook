package com.example.myapplication.domain.repository

import com.example.myapplication.data.datasource.model.response.DepartmentResponse
import com.example.myapplication.domain.model.DepartmentEntity
import io.reactivex.Single

interface DepartmentRepository {
    fun listDepartment() : Single<List<DepartmentEntity>>
}