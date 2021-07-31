package com.poo;

public class Perro {
	
//Variable de instancia	
	int numPatas;
	String color, tamano, raza;
	
// Constructor	ayuda a contruir el objeto "perro"
	//This es para traerse algo de la variable de instancia
	public Perro(int numPatas, String color, String tamano, String raza){
		this.numPatas = numPatas;
		this.color = color;
		this.tamano = tamano;
		this.raza = raza;
	}
	
	public Perro(String color, String tamano, String raza){
		this.numPatas = 3;
		this.color = color;
		this.tamano = tamano;
		this.raza = raza;
	}	
	//Método para obtener raza
	public String getRaza() {
		return this.raza;
	}
	
	public int getNumPatas() {
		return this.numPatas;
	}
	
	//Método para ingresar data
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
		}

}
