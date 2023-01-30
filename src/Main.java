import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double C, F;
		char resp;
		
		do {
			System.out.println("Qual a temperatura en Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.1f.%n", F);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		}
		while(resp != 'n');
			


		sc.close();
	}
}
