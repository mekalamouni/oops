package com.mouni.encapsulation;
class Student{
	private String name;
	private String qualification;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}

public class Encapusulation {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("mouni");
		System.out.println(s.getName());

	}

}
