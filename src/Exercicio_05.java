import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int qte1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qte2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double total = (qte1 * preco1 + qte2 * preco2);
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total, cod1, cod2);
		
		sc.close();
				
	}
}
