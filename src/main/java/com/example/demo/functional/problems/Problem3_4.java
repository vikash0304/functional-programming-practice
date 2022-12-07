package com.example.demo.functional.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.4 : Get the details of highest paid employee in the organization?
 * @author Vikash_Kumar2
 *
 */
public class Problem3_4 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Optional<Employee> highestPaidEmployeeWrapper=
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
				         
				Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
				         
				System.out.println("Details Of Highest Paid Employee : ");
				         
				System.out.println("==================================");
				         
				System.out.println("ID : "+highestPaidEmployee.getId());
				         
				System.out.println("Name : "+highestPaidEmployee.getName());
				         
				System.out.println("Age : "+highestPaidEmployee.getAge());
				         
				System.out.println("Gender : "+highestPaidEmployee.getGender());
				         
				System.out.println("Department : "+highestPaidEmployee.getDepartment());
				         
				System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
				         
				System.out.println("Salary : "+highestPaidEmployee.getSalary());
	}
}
