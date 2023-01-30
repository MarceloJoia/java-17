import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre três números:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);

		sc.close();
	}

	private static int max(int a, int b, int c) {
		
		int maior;
		if(a> b && a > c) {
			maior = a; 
		}
		else if (b > c) {
			maior = b;
		}
		else {
			maior = c;
		}
		return maior;
	}
	
	private static void showResult(int value) {
		System.out.println("É o maior " + value);
	}
	
}
