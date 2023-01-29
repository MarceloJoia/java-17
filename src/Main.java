import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		System.out.println("Você digitou " + x);

		sc.close();
	}
}
