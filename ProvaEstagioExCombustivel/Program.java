import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um combustível");
		System.out.println("1 para gasolina 2 para etanol:");
	    double x = sc.nextDouble();
	    System.out.println("Quantos litros irá abastecer?");
	    double y = sc.nextDouble();
	    
	    double gas = 4.59;
	    double etanol = 3.69;
	    double totalCom;
	    
	    if(x == 1 && y >= 20) {
	       totalCom = (gas * y);
	       System.out.println(totalCom - (totalCom * 0.3));
	    }
	    else if(x == 2 && y >= 20) {
	    	totalCom = etanol * y;
	    	System.out.println(totalCom - (totalCom * 0.5));
	    }
	    else if(x==1 && y < 20){
	    	totalCom = y * 4.59;
	    	System.out.println(totalCom);
	    }
	    else if(x == 2 && y < 20) {
	    	totalCom = y * 3.69;
	    	System.out.println(totalCom);
	    }
	    
		sc.close();
	}

}