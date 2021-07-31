package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int velocidad = 80; // km/h
		int limiteVelocidad = 80;
		
		
		//IF Anidado - IF ELSE IF
		
		boolean carretera = true;
		
		if(carretera) {
			//block code
			System.out.println("Carretera");
			
			limiteVelocidad = 110;
			
			if(velocidad > limiteVelocidad) {
				System.out.print("El coche va a exceso de velocidad, multa!!");
			}else {
				System.out.print("El coche va en la velocidad adecuada, felicidades!!");
			}
		
		}else if (velocidad > limiteVelocidad) {
			System.out.println("Calle");
			System.out.print("El coche va a exceso de velocidad, multa!!");
		}else {
			System.out.print("El coche va en la velocidad adecuada, felicidades!!");
		}
		
		
		//Switch case 
		
		int temperatura = 20;
		
		switch(temperatura) {
		
		case 5:
			System.out.println("Clima Muy Frio");
			break;
			
		case 10:
			System.out.println("Clima Frio");
			break;
		
		case 20:
			System.out.println("Clima Templado");
			break;
		
		case 30:
			System.out.println("Clima Cálido");
			break;
			
			default:
				System.out.println("Clima no reconocible por el sistema");
				break;
			
		}
			
	}

}
