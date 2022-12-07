package com.example.demo.functional.problems;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.13 : What is the average salary and total salary of the whole organization?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_13 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		DoubleSummaryStatistics employeeSalaryStatistics=
				employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	}
}
