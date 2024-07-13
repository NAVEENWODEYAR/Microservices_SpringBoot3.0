package com.employee.controller;

import com.employee.entity.Department;
import com.employee.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Welcome to Employee-Department,");
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addDepartment(@RequestBody Department request){
        LOGGER.info("Department added: {}",request);
        return ResponseEntity.ok(departmentService.addDepartment(request));
    }

    @GetMapping
    public ResponseEntity<Object>  findAll(){
        LOGGER.warn("Department list found");
        return ResponseEntity.ok(departmentService.findAll());
    }

    @GetMapping("/get-byId/{deptId}")
    public ResponseEntity<Object> getById(@PathVariable Long deptId){
        return ResponseEntity.ok(departmentService.findById(deptId));
    }


}
