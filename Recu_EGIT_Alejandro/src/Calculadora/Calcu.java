package Calculadora;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int opc = 0;
		
		System.out.println("CALCULADORA");
		System.out.println("Introduce el primer numero");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Intoruduce el segundo numero");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Eliga una opcion");
		System.out.println("1. Sumar\n2. Restar");
		opc = Integer.parseInt(sc.nextLine());
	
		switch (opc) {
	case 1:
		System.out.println("SUMA");
		System.out.println(num1 + num2);
		break;
		
	case 2:
		System.out.println("RESTA");
		System.out.println(num1 - num2);
		break;	
	default:
		break;
	}
		
		
	}

}
