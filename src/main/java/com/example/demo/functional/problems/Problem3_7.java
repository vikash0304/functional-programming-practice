package com.example.demo.functional.problems;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.7 : What is the average salary of each department?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_7 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Map<String, Double> avgSalaryOfDepartments=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
				         
				Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
				         
				for (Entry<String, Double> entry : entrySet) 
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
				
				System.out.println("---------------------");
				System.out.println(avgSalaryOfDepartments);
	}
}
