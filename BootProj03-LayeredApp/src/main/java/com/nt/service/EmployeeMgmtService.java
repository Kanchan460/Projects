package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Component("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = empDAO.getEmployeeByDesg(desg1, desg2, desg3);
		return list;
	}
}
