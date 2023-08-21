package oop_tutorial;

public class Senior extends Student {
	int gpa;
	
	public Senior(String name,int age,int gpa) {
		super(name, age);
		this.gpa=gpa;
	}
	
	public void display() {
		System.out.println("name :" + name + "\nage : " + age + "\ngpa : " + gpa );
	}

	
	
	
	
}
