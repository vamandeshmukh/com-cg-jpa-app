package com.cg.jpa.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "my_dept")
public class Department2 {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq_generator")
	@SequenceGenerator(name = "dept_seq_generator", sequenceName = "dept_seq")
	private int did;
	@Column
	private String dname;
	@Column
	private String city;

	public Department2() {
		super();
	}

	public Department2(String dname, String city) {
		super();
		this.dname = dname;
		this.city = city;
	}

	public Department2(int did, String dname, String city) {
		super();
		this.did = did;
		this.dname = dname;
		this.city = city;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", city=" + city + "]";
	}

}
