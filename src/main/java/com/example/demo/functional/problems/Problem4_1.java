package com.example.demo.functional.problems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

public class Problem4_1 {

	public static void main(String[] args) {
		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		
		//Sort using Id:

		List<Employee> sortedEmployeeList =  employeeList.stream()
				.sorted((e1, e2) -> (int) e.getId() - e2.getId())).collect(Collectors.toList());
				
		List<Employee> sortedEmployeeList2 =  employeeList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
	}

}
