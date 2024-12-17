package Inheritance_JPA;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Manager")
public class Manager extends Employee{
	
	private String department;
	private int salary;
	
	public Manager(String name, String department, int salary) {
		super(name);
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Manager [epartment=" + department + ", salary=" + salary + "]";
	}

	public Manager() {
		
	}

	
	
	
	
}
