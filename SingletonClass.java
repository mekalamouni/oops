package com.mouni.OopsPrograms;
class P{
	private static P t;
	static int count;
	private P(){
		count++;
		
	}
	public static P getInstance() {
		if(t==null)t=new P();
		return t;
		
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P o1= P.getInstance();
		P o2=P.getInstance();
		P o3=P.getInstance();
		System.out.println(o1==o2);
		System.out.println(o1==o3);
		System.out.println(o2==o3);
		//System.out.println("02==02");
		System.out.println(P.count);

	}
	}

