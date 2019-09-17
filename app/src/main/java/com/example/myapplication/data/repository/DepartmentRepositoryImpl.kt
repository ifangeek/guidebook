package com.example.myapplication.data.repository

import com.example.myapplication.data.datasource.rest.IDepartmentDataSource
import com.example.myapplication.domain.model.DepartmentEntity
import com.example.myapplication.domain.repository.DepartmentRepository
import io.reactivex.Single

class DepartmentRepositoryImpl : DepartmentRepository{

    private val departmentDataSource : IDepartmentDataSource? = null

    override fun listDepartment(): Single<List<DepartmentEntity>> {
        return departmentDataSource!!.listDepartment()
    }
}