package com.gitdemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
	
		
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(105, "komal", "nashik"));
		emp.add(new Employee(109, "adshda", "punek"));
		emp.add(new Employee(119, "shilpa", "beed"));
		emp.add(new Employee(122, "prithvi", "karad"));
		emp.add(new Employee(203, "aakash", "ozar"));

        System.out.println(emp);
		
		
	}

}
