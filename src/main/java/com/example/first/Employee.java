package com.example.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="employee")
public class Employee {
	@Column(name="first_name")
	String f;
	@Column(name="last_name")
	String l;
	@Id
	@Column(name="email")
	String e;
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}

}
