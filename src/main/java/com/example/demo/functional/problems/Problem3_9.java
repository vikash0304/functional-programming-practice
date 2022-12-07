package com.example.demo.functional.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.9 : Who has the most working experience in the organization?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_9 {

	List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
	Optional<Employee> seniorMostEmployeeWrapper=
			employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
			         
			Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
			         
			System.out.println("Senior Most Employee Details :");
			         
			System.out.printlOn("----------------------------");
			         
			System.out.println("ID : "+seniorMostEmployee.getId());
			         
			System.out.println("Name : "+seniorMostEmployee.getName());
			         
			System.out.println("Age : "+seniorMostEmployee.getAge());
			         
			System.out.println("Gender : "+seniorMostEmployee.getGender());
			         
			System.out.println("Age : "+seniorMostEmployee.getDepartment());
			         
			System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
			         
			System.out.println("Salary : "+seniorMostEmployee.getSalary());
}
