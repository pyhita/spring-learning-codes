package com.yangtao.service;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.yangtao.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAll();

    List<Department> findDepartmentsByName(String name);

    Integer deleteDeptById(String deptId);

    Department findDepartmentById(String deptId);
}
