package com.employee.entity;

import lombok.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Department {

    private Long departmentId;

    private String departmentName;

    private List<Employee> employeeList = new ArrayList<Employee>();
}
