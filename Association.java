package com.mouni.OopsPrograms;
class Mom{
	public void m1() {
		System.out.println("call to mouni");
	}}
	class Daughter{
		public void m2() {
			System.out.println("yaah amma");
			Mom m=new Mom();
			m.m1();
		}
	}


public class Association {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.m2();

	}

}
