package com.poo;

public class Main {

	public static void main(String[] args) {
			
		// Creación de objeto 
		Perro labrador = new Perro(4, "Dorado", "Grande", "Golden Labrador");
		System.out.println("Mi Perro es de raza "+ labrador.getRaza());
		
		Perro chihuahua = new Perro(4, "Blanco", "Chico", "Chihuahua Cabeza de Manzana");
		System.out.println("Mi Perro es de raza "+ chihuahua.getRaza());
		
		Perro chihuahua_2 = new Perro("Blanco", "Chico", "Chihuahua Cabeza de Manzana");
		System.out.println("Mi Perro es de raza "+ chihuahua_2.getRaza() + " y mi perro tiene "+ chihuahua_2.getNumPatas() + " patas");

	}
	

}
