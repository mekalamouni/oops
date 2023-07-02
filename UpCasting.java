package com.mouni.OopsPrograms;
class M{
	public void m1() {
		System.out.println("m1 is defined class M");
	}
	public void m2() {
		System.out.println("m2 is defined class M");
	}
}
class N extends M {
	@Override
	public void m2() {
		System.out.println("m2 is defined class N");
		
	}
	public void m3() {
		System.out.println("m3 is defined cass N");
	}
}


public class UpCasting {

	public static void main(String[] args) {
		M m=new N();//Up casting
		m.m1();
		m.m2();
		N n=(N)m;
		n.m3();//Down Casting
	

	}

}
