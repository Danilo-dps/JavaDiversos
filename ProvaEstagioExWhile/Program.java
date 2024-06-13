
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		
		for(int i = x; i <= y; i++) {
			 count += i;
		}
		System.out.println(count);
		sc.close();
	}

}
