package com.example.myapplication.domain.interactor

import com.example.myapplication.domain.model.DepartmentEntity
import com.example.myapplication.domain.repository.DepartmentRepository
import com.tismart.wabu.core.interactor.Interactor
import io.reactivex.Single

class GetAllDepartments(private val departmentRepository :DepartmentRepository)
    : Interactor<Interactor.None, Single<List<DepartmentEntity>>>{

    override fun execute(params: Interactor.None): Single<List<DepartmentEntity>> {
        return departmentRepository.listDepartment()
    }
}