package com.dailycodebuffer.departament.controller;


import com.dailycodebuffer.departament.entity.Department;
import com.dailycodebuffer.departament.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment methor of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById (@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method by DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}

