package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b = 1;
        a = sc.nextDouble();
        while (a >= 0 && a <= 12) {
            if (a == 0) {
                System.out.printf("%.0f%n", b);
                break;
            } else {
                while (a > 1 && a <= 12) {
                    b *= a;
                    a--;
                }
                System.out.printf("%.0f%n", b);
                a = sc.nextDouble();
                b = 1;
            }
        }	
        sc.close();
	}
}
