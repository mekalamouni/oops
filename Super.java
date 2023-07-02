package com.mouni.OopsPrograms;
class A
{
	int i=55;
}
class B extends A{
	int i=100;
	int j=30;
public void display() {
	System.out.println(this.i);
	System.out.println(this.j);
	System.out.println(super.i);
}
	
}


public class Super {

	public static void main(String[] args) {
       B b=new B();
       b.display();

	}

}
