package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * LER OS DADOS DE DOIS TRINÂNGULAS: X e Y
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Entro com as medidas do tríângulos [ X ]");
		System.out.print("Lado XA: ");
		xa = sc.nextDouble();
		System.out.print("Lado XB: ");
		xb = sc.nextDouble();
		System.out.print("Lado XC: ");
		xc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areaX = Math.sqrt(p*(p - xa)* (p - xb) * (p - xc));

		System.out.println("Entro com as medidas do tríângulos [ Y ]");
		System.out.print("Lado YA: ");
		ya = sc.nextDouble();
		System.out.print("Lado YB: ");
		yb = sc.nextDouble();
		System.out.print("Lado YC: ");
		yc = sc.nextDouble();
		
		double py = (ya + yb + yc) / 2.0;
		double areaY = Math.sqrt(py*(py - ya)* (py - yb) * (py - yc));
		
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
