package com.yangtao.service.impl;

import com.yangtao.entity.Department;
import com.yangtao.mapper.DepartmentMapper;
import com.yangtao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        List<Department> res = departmentMapper.getAll();
        System.out.println(res);
        return departmentMapper.getAll();
    }

    @Override
    public List<Department> findDepartmentsByName(String name) {
        return departmentMapper.findDpartmentsByName(name);
    }

    @Override
    public Integer deleteDeptById(String deptId) {

        return departmentMapper.deleteDeptById(deptId);
    }

    @Override
    public Department findDepartmentById(String deptId) {

        return departmentMapper.findDepartmentById(deptId);
    }
}
