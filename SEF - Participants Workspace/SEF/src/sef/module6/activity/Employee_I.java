package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I  {

	public Employee_I(){
		System.out.println("I'm an Employee_I Constructor");
	}
	
	//Attributes
	private double salary;
	private String title;
	private String name;
	private int age;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
	
	// write getter for int salary
	
	
	// write setter for int salary
	
	
	// write getter for String title
	
	
	// write setter for String title
	
}
