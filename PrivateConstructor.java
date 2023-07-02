package com.mouni.OopsPrograms;
class O{
	static int count;
	private O(){
		count ++;
	}
	public static O getInstance() {
		return new O();
		
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		O o1= O.getInstance();
		O o2=O.getInstance();
		O o3=O.getInstance();
		System.out.println(o1==o2);
		System.out.println(01==03);
		System.out.println(02==03);
		//System.out.println("02==02");
		System.out.println(O.count);

	}

}
