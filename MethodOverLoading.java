package com.mouni.OopsPrograms;
class L{
	public void m1() {
		System.out.println("NO-argument");
	}
	public void m1(int a) {
		System.out.println(a);
	}
	public void m1(int a,int b) {
		System.out.println(a+" "+b);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
	   L l=new L();
	   l.m1();
	   l.m1(10);
	   l.m1(10,20);

	}

}
