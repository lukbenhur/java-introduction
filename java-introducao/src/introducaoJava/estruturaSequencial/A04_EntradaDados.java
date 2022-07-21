package introducaoJava.estruturaSequencial;

import java.util.Scanner;

public class A04_EntradaDados {
	public static void main(String[] args) {
		Scanner dado =  new Scanner(System.in); //metodo de entrada de dados , necessita importaçao do Scanner
		String x,h;
		int y;
		double z;
		char p;
		
		x = dado.next(); //(Cuidado!)pega so a primeira palavra o next pega a palavra ate o espaço e mantem o cursor na mesma linha
		p = dado.next().charAt(0); //paga o primeiro caractere da palavra
		h = dado.nextLine().trim();	//pega uma linha de codigo inteira .trim() > remove o espaço
		y = dado.nextInt();	//pega um numero inteiro	
		z = dado.nextDouble(); //pega um numero flutuante
		
		System.out.println("Você Digitou: " + x);
		System.out.println("Você Digitou: " + p);
		System.out.println("Você Digitou: " + h);
		System.out.println("Você Digitou: " + y);
		System.out.println("Você Digitou: " + z );
		dado.close();//fechar o scanner;
	}
}
