package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		
		//While
		int numero = 1;
		while(numero <=10) {
			System.out.println("El número es:"+numero);
			++numero;
		}		
		
		//Do-While cuantas se tiene que sumar a si mismo "numeroSum" para llegar a 100
		
		int numeroSum = 5;
		int sumTotal = 0;
		int count = 0; 
		
		do {
//			sumTotal = sumTotal + numeroSum;
			sumTotal += numeroSum;
			++count;
		} while(sumTotal < 100);
		
		System.out.println("El número se sumo= "+count);
		
		//FOR
		
		int numeroFor = 10;
	
		System.out.println(suma(1,2,4));
		
	}

	public static void contador(int numero) {	
		for(int i= 1;i<=numero; i++) {
			
			System.out.println("El número FOR es "+ i);
			
	   }
	}
	
	public static int suma(int num1, int num2) {	
		int sumTotal = num1+num2; 
		return sumTotal;
		
	}
	
	//Sobre carga de metodo
	
	public static int suma(int num1, int num2, int num3) {	
		int sumTotal = num1+num2+num3; 
		return sumTotal;
		
	}
}
