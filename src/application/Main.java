package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entro com as medidas do tríângulos [ X ]");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entro com as medidas do tríângulos [ Y ]");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A maior área do tringulo é X = %.4f%n", areaX);
		System.out.printf("A maior área do tringulo é Y = %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("A maior área do tringulo é X");
		}
		else {
			System.out.printf("A maior área do tringulo é Y");
		}

		sc.close();
	}
}
