import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade:");
		int x = sc.nextInt();
		
		if(x >= 0 && x <= 11) {
			System.out.println("É uma criança!");
		}
		else if(x > 11 && x <= 17) {
			System.out.println("É um adolescente!");
		}
		else if(x > 17 && x <=60) {
			System.out.println("É um adulto!");
		}
		else if(x > 60) {
			System.out.println("É um idoso!");
		}
		
		sc.close();
	}

}