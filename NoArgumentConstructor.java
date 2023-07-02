package com.mouni.OopsPrograms;
class H{
	int i;
	int j;
	public H() {
		i=10;
		j=30;
		
	}
	public  void display() {
		System.out.println(i+" "+j);
		
	}
}

public class NoArgumentConstructor {

	public static void main(String[] args) {
		H h=new H();
		h.display();

	}

}
