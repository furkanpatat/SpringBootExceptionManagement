package com.furkanpatat.controller;

import com.furkanpatat.dto.DtoEmployee;
import com.furkanpatat.model.RootEntity;

public interface RestEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
