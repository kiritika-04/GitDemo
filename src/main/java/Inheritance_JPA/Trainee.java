package Inheritance_JPA;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Trainee")
public class Trainee extends Employee {
	private double salary;
	private int vacationdays;
	
	public Trainee() {
	}

	public Trainee(String name, double salary, int vacationdays) {
		super(name);
		this.salary = salary;
		this.vacationdays = vacationdays;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationdays() {
		return vacationdays;
	}

	public void setVacationdays(int vacationdays) {
		this.vacationdays = vacationdays;
	}

	@Override
	public String toString() {
		return "Trainee [salary=" + salary + ", vacationdays=" + vacationdays + "]";
	}
	
	
	
	

}
