package com.model;
import java.io.serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence. GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Employee {

}
@Entity
@Table(name="mytable")
public class Employee implements Serializable {​​

	@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int empId;

@Column(name="firstname" ,length=25)
private String firstName;

@Column(name="lastname" ,length=25)
private String lastName;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
