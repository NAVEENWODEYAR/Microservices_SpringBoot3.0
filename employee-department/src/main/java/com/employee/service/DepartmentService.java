package com.employee.service;

import com.employee.entity.Department;
import com.employee.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    public Department findById(Long deptId){
        return departmentRepository.findById(deptId)
                .orElseThrow(null);
    }
}
