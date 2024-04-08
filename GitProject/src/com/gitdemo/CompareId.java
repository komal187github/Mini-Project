package com.gitdemo;

import java.util.Comparator;

public class CompareId implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {

		if (obj1.getId() > obj2.getId()) {
			return 1;
		} else if (obj1.getId() < obj2.getId()) {
			return -1;
		} else {
			return 0;
		}

	}
}