package com.furkanpatat.controller.impl;

import com.furkanpatat.controller.RestEmployeeController;
import com.furkanpatat.dto.DtoEmployee;
import com.furkanpatat.model.RootEntity;
import com.furkanpatat.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
