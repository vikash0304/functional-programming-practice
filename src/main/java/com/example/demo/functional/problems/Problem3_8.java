package com.example.demo.functional.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.example.demo.functional.model.Employee;
import com.example.demo.functional.utils.PopulateEmployeeUtils;

/**
 * Query 3.8 : Get the details of youngest male employee in the product
 * development department?
 * 
 * @author Vikash_Kumar2
 *
 */
public class Problem3_8 {

	public static void main(String[] args) {

		List<Employee> employeeList = PopulateEmployeeUtils.populateEmployeeList();
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("Details Of Youngest Male Employee In Product Development");

		System.out.println("----------------------------------------------");

		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

	}
}
