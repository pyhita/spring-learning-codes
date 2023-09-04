package com.yangtao.mapper;

import com.yangtao.entity.Department;
import com.yangtao.service.DepartmentService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentMapper {

    List<Department> getAll();

    List<Department> findDpartmentsByName(String name);

    @Select("SELECT * from tbl_dept WHERE id = #{deptId}")
    Department findDepartmentById(String deptId);
    Integer deleteDeptById(String deptId);
}
