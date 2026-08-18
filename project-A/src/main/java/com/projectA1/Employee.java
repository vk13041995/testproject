package com.projectA1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String name;
	private int age;
	private String dept;
	private double salary;

}
