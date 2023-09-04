package com.yangtao.controller.b_response_resp;

import com.yangtao.entity.Department;
import com.yangtao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.management.modelmbean.ModelMBean;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class ViewDataController {

    /**
     * 数据传送视图的几种方式：
     * 1 Request 域
     * 2 ModelAndView
     * 3 ModelMap
     */
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/list1")
    public String getAll(HttpServletRequest request) {
        List<Department> deptList = departmentService.getAll();
        System.out.println(deptList);
        request.setAttribute("deptList", deptList);
        return "dept/deptList";
    }


    @RequestMapping("/list2")
    public ModelAndView getAll2(ModelAndView modelAndView) {
        List<Department> deptList = departmentService.getAll();
        System.out.println(deptList);
        modelAndView.addObject("deptList", deptList);
        modelAndView.setViewName("dept/deptList");

        return modelAndView;
    }

    @RequestMapping("/list3")
    public String getAll3(ModelMap map) {
        List<Department> deptList = departmentService.getAll();
        System.out.println(deptList);
        map.put("deptList", deptList);

        return "dept/deptList";
    }

}
