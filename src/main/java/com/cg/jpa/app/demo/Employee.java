package com.cg.jpa.app.demo;

import javax.persistence.*;

// explain PK FK and cardinality of entities here 

@Entity
@Table(name = "emp_table")
public class Employee { // entity classes

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	@Column(name = "employee_name", length = 10, nullable = false)
	private String ename;

	@Column
	private double salary;

	@OneToMany(targetEntity = Department.class)
	private Department department;

}
