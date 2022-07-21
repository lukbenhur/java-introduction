package introducaoJava.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Ex03_mod1 {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int a,b,c,d,diferenca;
		
		System.out.println("Qual o primeiro valor?");
		a = dado.nextInt();
		System.out.println("Qual o segundo valor?");
		b = dado.nextInt();
		System.out.println("Qual o terceiro valor?");
		c = dado.nextInt();
		System.out.println("Qual o quarto valor?");
		d = dado.nextInt();
		
		diferenca = (a * b - c * d);
		System.out.printf("O resultado será de: %d", diferenca);
		dado.close();
	}
}