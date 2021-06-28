package com.cg.jpa.app;

import javax.persistence.*;

// explain PK FK and cardinality of entities here 

@Entity
@Table(name = "cg_emp_3")
public class Employee { // entity classes

	@Id // primary key
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "employee_name", length = 10, nullable = false)
	private String name;

	@Column
//	@Column(name = "employe_salary")
	private double salary;

//	@OneToMany(targetEntity = Department.class)
//	private Department department;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
