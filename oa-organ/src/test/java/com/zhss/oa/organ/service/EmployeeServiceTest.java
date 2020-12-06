package com.zhss.oa.organ.service;

import com.zhss.oa.organ.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

@ContextConfiguration(locations = {"classpath:application-organ.xml"})  
@RunWith(SpringJUnit4ClassRunner.class)  
public class EmployeeServiceTest {


	@Autowired  
	private EmployeeService employeeService;
	
	@Test
	public void testAddEmployee() {
		Employee employee = new Employee();
		employee.setName("李四");
		employee.setAge(36); 
		employeeService.addEmployee(employee); 
	}
	
}
