package com.mouni.OopsPrograms;
class I{
	int i;
	int j;
	public I(int i,int j) {
		this.i=i;
		this.j=j;
		
	}
	public void display() {
		System.out.println(i+" "+j);
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		I i=new I(10,20);
		i.display();

	}

}
