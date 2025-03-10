package com.furkanpatat.service.impl;

import com.furkanpatat.dto.DtoDepartment;
import com.furkanpatat.dto.DtoEmployee;
import com.furkanpatat.exception.BaseException;
import com.furkanpatat.exception.ErrorMessage;
import com.furkanpatat.exception.MessageType;
import com.furkanpatat.model.Department;
import com.furkanpatat.model.Employee;
import com.furkanpatat.repository.EmployeeRepository;
import com.furkanpatat.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee = optional.get();
        Department department = employee.getDepartment();
        BeanUtils.copyProperties(employee,dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);
        return dtoEmployee;
    }
}
