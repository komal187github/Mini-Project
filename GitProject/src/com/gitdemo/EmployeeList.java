package com.gitdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(15, "komal", "nashik"));
		emp.add(new Employee(109, "adshda", "punek"));
		emp.add(new Employee(119, "shilpa", "beed"));
		emp.add(new Employee(52, "prithvi", "karad"));
		emp.add(new Employee(3, "aakash", "ozar"));

		System.out.println(emp);

		Collections.sort(emp, new CompareId());

		System.out.println("after sorting:" + emp);
	}

}
