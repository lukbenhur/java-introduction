package introducaoJava.exercicios;

import java.util.Scanner;
public class Ex02_mod1 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double raio,area;
		
		System.out.println("Qual o valor do raio do círculo?");
		raio = dado.nextDouble();
		
		area = Math.PI * Math.pow(raio,2);
		
		System.out.printf("A area do círculo é de : %.4f" , area);
		dado.close();
	}
}