package com.example.demo.functional.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.10 : How many male and female employees are there in the sales and marketing team?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_10 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
				employeeList.stream()
				            .filter(e -> e.getDepartment()=="Sales And Marketing")
				            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				 
				System.out.println(countMaleFemaleEmployeesInSalesMarketing);
	}
}
