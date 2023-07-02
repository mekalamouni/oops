package com.mouni.OopsPrograms;

	class J{
		public J() {
			System.out.println("no argument constructir");
		}
		public J(int i) {
			System.out.println("1-argument Construvtor");
		}
		public J(int i,int j) {
			System.out.println("2-argument Constror");
		}
	}
	public class ConstructorOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J j=new J();
		J j1=new J(10);
		J j2=new J(10,3);
		
		

	}

}
