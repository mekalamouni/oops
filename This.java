package com.mouni.OopsPrograms;

public class This {
	int i;
	public void intialize(int i) {
		this.i=i;
		
	}
	public void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		This t=new This();
		t.intialize(20);
		t.display();
		

	}

}
