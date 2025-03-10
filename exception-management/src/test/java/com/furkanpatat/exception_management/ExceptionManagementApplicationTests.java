package com.furkanpatat.exception_management;

import com.furkanpatat.dto.DtoEmployee;
import com.furkanpatat.service.IEmployeeService;
import com.furkanpatat.starter.ExceptionManagementStarter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("beforeEach çalıştı...");
	}

	@Test
	public void testFindEmployeeById(){
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		assertNotNull(employee);

	}
	@AfterEach
	public void afterEach(){
		System.out.println("afterEach çalıştı...");
	}
}
