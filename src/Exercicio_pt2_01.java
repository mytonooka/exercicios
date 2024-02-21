import java.util.Scanner;

public class Exercicio_pt2_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		if (entrada < 0) {
			System.out.println("NEGATIVO");
		}
		
		else {
				System.out.println("NAO NEGATIVO");
		}			
		sc.close();
		
		
		
	}
}
