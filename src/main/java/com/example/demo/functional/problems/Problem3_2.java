package com.example.demo.functional.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.2 : Print the name of all departments in the organization?
 * @author Vikash_Kumar2
 *
 */
public class Problem3_2 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		
				employeeList.stream().map(Employee::getDepartment)
				.distinct().forEach(System.out::println);
				
				System.out.println("-----------------");
				employeeList.stream().map(Employee::getDepartment).forEach(System.out::println);
	}
}
