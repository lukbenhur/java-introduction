package introducaoJava.exercicios;
import java.util.Scanner;

public class Ex01_mod1 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int x,y,soma;
		
		System.out.println("Entre com o primeiro valor: ");
		x = dado.nextInt();
		System.out.println("Entre com o segundo valor: ");
		y = dado.nextInt();
		
		soma = x + y;
		System.out.printf("A soma dos dois valores é de: %d.", soma );
		dado.close();
	}
}