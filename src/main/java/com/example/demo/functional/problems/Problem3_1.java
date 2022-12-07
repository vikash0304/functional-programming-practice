package com.example.demo.functional.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.1 : How many male and female employees are there in the organization?
 * @author Vikash_Kumar2
 *
 */
public class Problem3_1 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				System.out.println(noOfMaleAndFemaleEmployees);
	}
}
