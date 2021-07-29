package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte abc = 127;
		short var = 30000;
		
		long var2 = 92233720;
		
	//	int altura = (int) 2.54;
		double altura = 2.54;
		System.out.println(altura);
		
		char letra = '\u00D4';
		System.out.println(letra);
		
		String frase = "Hola";
		String frase2 = "Mundo";
		int frase3 = 4;
		int frase4 = 5;
		
		System.out.println(frase+frase2+frase3);
		
		System.out.println(frase3+frase4);
		
		boolean isDog = true;
		
		int x = 4;
		int y = 3;
		int suma = x+y;
		System.out.println("La suma es "+ suma);
		
		//UNARIO 
		int a = 3;
		a--;
		a++;
		System.out.println("El valor de a es "+ a);
		
		//Relacionales
		int varr1 = 3;
		int varr2 = 4;
		boolean varr3 = true;
		
		if(varr1<=varr2 && varr3) {
			System.out.println("HERE");
		}
		
		

	}

}
