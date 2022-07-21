package introducaoJava.exercicios;
import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1,
o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Calcule e mostre o valor a ser pago.
 */
public class Ex05_mod1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dado = new Scanner(System.in);
		int codPeca1,numPeca1,codPeca2,numPeca2;
		double valorPeca1,valorPeca2,totalPagar;
		
		System.out.println("Qual o codigo da primeira peça?");
		codPeca1 = dado.nextInt();
		System.out.println("Quantas peças ira comprar?");
		numPeca1 = dado.nextInt();
		System.out.println("Qual o valor de cada peça?");
		valorPeca1 = dado.nextDouble();
		System.out.println("Qual o codigo da segunda peça?");
		codPeca2 = dado.nextInt();
		System.out.println("Quantas peças ira comprar?");
		numPeca2 = dado.nextInt();
		System.out.println("Qual o valor de cada peça?");
		valorPeca2 = dado.nextDouble();
		
		totalPagar = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		
		System.out.printf("O total que o cliente deverá pagar é: R$ %.2f.",totalPagar);
		
		
		
		dado.close();
	}
}