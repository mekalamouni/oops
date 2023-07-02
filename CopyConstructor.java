package com.mouni.OopsPrograms;
class K{
	int i;
     public K(int i) {
    	  this.i=i;
		
	}
    public  K( K k) {
    	this.i=k.i;
    }
    public void display() {
    	System.out.println(i);
    }
}

public class CopyConstructor {

	public static void main(String[] args) {
	
        K k1=new K(10);
        k1.display();
        K k2=new K(k1);
        k2.display();
        
        
        
	}

}
