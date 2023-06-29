package com.mouni.abstraction;
abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzzzzz");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("bow bow ");
	}
}

public class abstraction {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sleep();
		dog.animalSound();
}

}
