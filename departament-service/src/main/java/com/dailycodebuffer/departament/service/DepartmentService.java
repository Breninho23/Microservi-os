package com.dailycodebuffer.departament.service;

import com.dailycodebuffer.departament.entity.Department;
import com.dailycodebuffer.departament.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(@RequestBody Department department) {
    log.info("Inside saveDepartment in DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment in DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
