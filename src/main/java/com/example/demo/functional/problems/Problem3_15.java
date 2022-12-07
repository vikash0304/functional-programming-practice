package com.example.demo.functional.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.15 : Who is the oldest employee in the organization? What is his age
 * and which department he belongs to?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_15 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

		Employee oldestEmployee = oldestEmployeeWrapper.get();

		System.out.println("Name : " + oldestEmployee.getName());

		System.out.println("Age : " + oldestEmployee.getAge());

		System.out.println("Department : " + oldestEmployee.getDepartment());
	}
}
