import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		float b, B, h, area;
		b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		
	}
}
