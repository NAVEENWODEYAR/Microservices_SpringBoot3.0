package com.employee.repository;

import com.employee.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartmentRepository{

    private List<Department> deptList = new ArrayList<>();

    public Department addDepartment(Department department){
        deptList.add(department);
        return department;
    }

    public Department findById(Long deptId){
        return deptList.stream().filter(a->a.equals(deptId))
    }

}
