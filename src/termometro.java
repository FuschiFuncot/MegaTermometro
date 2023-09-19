import java.util.Locale;
import java.util.Scanner;
public class termometro {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	double celsius, fahrenit; 
	
	
	Scanner te = new Scanner(System.in);
	System.out.println("Digite a temperatura em Celsius: ");
	celsius = te.nextDouble();
	
	fahrenit = (celsius * 9/5) + 32;
	
	System.out.println("Fahrenit" + fahrenit);
	}

}
