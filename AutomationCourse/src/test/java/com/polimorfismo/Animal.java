package com.polimorfismo;

//Abstract para el polimorfismo

public abstract class Animal {
	
	String Animal;
	
	public Animal(String animal) {
		this.Animal = animal;
	}
	
	public String getAnimal() {
		return this.Animal;
	}
	
	public abstract void speak();
	
	
	

}
