package taebootcamp;

import java.util.Scanner;

public class Calculator {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int Substract(int c, int d) {
		return c - d;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("SUMA");
		System.out.print("Introduzca primer n�mero: ");
		
		int a = teclado.nextInt();
		System.out.print("Introduzca segundo n�mero: ");
		
		int b = teclado.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
		
		System.out.println("RESTA");
		System.out.print("Introduzca primer n�mero: ");
		
		int c = teclado.nextInt();
		System.out.print("Introduzca segundo n�mero: ");
		int d = teclado.nextInt();
		
		System.out.println(c + "-" + d + "=" + (c - d));

	}

}