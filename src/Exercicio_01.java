import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada1 = sc.nextInt();
		int entrada2 = sc.nextInt();
		
		int soma = entrada1 + entrada2;
		
		System.out.println("SOMA = " + soma);		
		
		sc.close();
		

	}

}
