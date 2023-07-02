package com.mouni.OopsPrograms;
class F{
	public  F() {
		this(3);
		System.out.println("No Argument Constructor");
	}
	public F(int i) {
		this(4,6);
		System.out.println("1-Argument Constructor");
		
	}
	public F(int i,int j) {
		System.out.println("2-Argument Constructor");
	}
}

public class CallTOThis {

	public static void main(String[] args) {
		F f=new F();

	}

}




