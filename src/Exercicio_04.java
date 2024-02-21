import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		double C = sc.nextDouble();
		
		double salary = (double) B * C;
		
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = US %.2f%n",salary);
		
		sc.close();

	}

}
