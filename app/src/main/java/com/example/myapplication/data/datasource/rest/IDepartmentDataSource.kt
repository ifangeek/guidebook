package com.example.myapplication.data.datasource.rest

import com.example.myapplication.domain.model.DepartmentEntity
import io.reactivex.Single

interface IDepartmentDataSource {
    fun listDepartment() : Single<List<DepartmentEntity>>
}