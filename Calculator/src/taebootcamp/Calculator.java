package taebootcamp;

import java.util.Scanner;

public class Calculator {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int Substract(int c, int d) {
		return c - d;
	}

	public static float division(float x, float y) {
		return x / y;
	}

	public static int multiplicacion(int z, int w) {
		return z * w;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);

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

		System.out.println("MULTPIPLICACION");
		System.out.print("Introduzca primer n�mero: ");

		int z = teclado.nextInt();
		System.out.print("Introduzca segundo n�mero: ");

		int w = teclado.nextInt();
		System.out.println("La Multiplicacion es " + z + "*" + w + " = " + z * w);

		System.out.println("DIVISION");
		System.out.print("Introduce el primer n�mero:");

		float x = reader.nextFloat();
		System.out.print("Introduce el segundo n�mero:");

		float y = reader.nextFloat();
		System.out.println("La divisi�n es " + x + " / " + y + " = " + x / y);
	}

}