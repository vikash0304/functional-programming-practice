package com.example.demo.functional.problems;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.11 : What is the average salary of male and female employees?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_11 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
				         
				System.out.println(avgSalaryOfMaleAndFemaleEmployees);
	}
}
