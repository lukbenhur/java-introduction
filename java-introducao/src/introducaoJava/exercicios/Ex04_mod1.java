package introducaoJava.exercicios;
import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
 */
public class Ex04_mod1 {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int func,horas;
		double salhora,remFinal;
		
		System.out.println("Qual o numero do funcionario?");
		func = dado.nextInt();
		System.out.println("Qual a quantidade de horas trabalhadas?");
		horas = dado.nextInt();
		System.out.println("Quanto o funcionario recebe por hora trabalhada?");
		salhora = dado.nextDouble();
		
		remFinal = horas * salhora;
		
		System.out.printf("A remuneraçao do funcionario %d é de: R$ %.2f",func,remFinal);
		
		dado.close();
	}
}