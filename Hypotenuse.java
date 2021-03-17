import java.util.Scanner;

public class Hypotenuse {
		
	public double getHypotenuse(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de Pitagoras!");
		System.out.print("Informe o valor de um dos catetos \n A: ");
		int value_a = sc.nextInt();
				
		System.out.print("Informe o valor do outro cateto \n B: ");
		int value_b = sc.nextInt();
		
		Hypotenuse hypotenuse = new Hypotenuse();
		
		double result = hypotenuse.getHypotenuse(value_a, value_b);
		
		System.out.println("O valor da hipotenusa e: " + result);
	}
}