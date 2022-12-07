package com.example.demo.functional.problems;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.5 : Get the names of all employees who have joined after 2015?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_5 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
		
		System.out.println("---- With comma Seperated----------");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.collect(Collectors.joining(", ")).concat(getName);
//				.forEach(System.out::println);
	}
}
