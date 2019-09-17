package com.example.myapplication.data.datasource.rest

import com.example.myapplication.data.datasource.model.mapper.AllDepartmentMapper
import com.example.myapplication.data.datasource.rest.api.interfaces.ApiGuideBookService
import com.example.myapplication.domain.model.DepartmentEntity
import io.reactivex.Single

class DepartmentDataSource : IDepartmentDataSource{

    private val service : ApiGuideBookService? = null

    override fun listDepartment(): Single<List<DepartmentEntity>> {
        return service!!.listDepartment().map(AllDepartmentMapper()::map)
    }
}