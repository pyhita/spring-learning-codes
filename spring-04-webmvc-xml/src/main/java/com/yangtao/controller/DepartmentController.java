package com.yangtao.controller;

import com.yangtao.entity.Department;
import com.yangtao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/list")
    public String getAll(@RequestParam(value = "name", required = false) String name) {
        List<Department> deptList = departmentService.findDepartmentsByName(name);
        System.out.println(deptList);
        request.setAttribute("deptList", deptList);

        return "dept/deptList";
    }

    @RequestMapping("/delete")
    public String deletById(@RequestParam(value = "id", required = true) String deptId) {
        departmentService.deleteDeptById(deptId);

        return "redirect:/department/list";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam(value = "id") String deptId, Model model) {
        // 1 查询出要修改的部门信息
        Department department = departmentService.findDepartmentById(deptId);
        model.addAttribute("dept", department);

        return "dept/deptInfo";
    }

    @RequestMapping("/save")
    public String save(@Validated Department department, BindingResult result) {
        if (StringUtils.isEmpty(department.getName())) {
            throw new IllegalArgumentException("部门名字不能为空！");
        }

        if (result.hasErrors()) {
            result.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            throw new RuntimeException("部门名格式不正确！");
        }

        System.out.println(department);
        return "department";
    }

    @RequestMapping("/saveJson")
    public String saveJson(@RequestBody Department department) {
        System.out.println(department);

        return "redirect:/department/list";
    }
}
