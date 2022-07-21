package introducaoJava.exercicios;
import java.util.Scanner;

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
 */
public class Ex06_mod1 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double a,b,c,area;
		
		System.out.println("qual o primeiro valor?");
		a = dado.nextDouble();
		System.out.println("qual o segundo valor?");
		b = dado.nextDouble();
		System.out.println("qual o terceiro valor?");
		c = dado.nextDouble();
		area = (a * c) / 2;
		System.out.printf("A area do triangulo retangulo é de:%.3f%n",area);
		area = Math.PI * Math.pow(c, 2);
		System.out.printf("A area do circulo é de: %.3f%n",area);
		area = (a + b)*c / 2 ;
		System.out.printf("A area do trapezio é de:%.3f%n",area);
		area = Math.pow(b, 2);
		System.out.printf("A area do quadrado é de:%.3f%n",area);
		area = a * b;
		System.out.printf("A area do retangulo é de:%.3f%n",area);
		dado.close();
	}
}