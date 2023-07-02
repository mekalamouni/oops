package com.mouni.OopsPrograms;
class Parent{
	public void call() {
		System.out.println("9581573226");
	}
}
class Child extends Parent{
	public void call() {
		System.out.println("8712244857");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.call();

	}

}
