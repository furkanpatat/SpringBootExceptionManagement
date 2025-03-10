package com.furkanpatat.service;

import com.furkanpatat.dto.DtoEmployee;
import com.furkanpatat.model.Employee;
import com.furkanpatat.repository.EmployeeRepository;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Long id);
}
