package introducaoJava.estruturaSequencial;

import java.util.Locale;

//(%n \n) sao quebras de linha
public class A02_SaidaDeDados {
	public static void main(String[] args) {
		String i = "Ola mundo!!!";
		int f = 14;
		double x = 10.35784;
		//três formas de saida de dados
		
		System.out.println("Olá mundo \n"); //com quebra de linha
		
		System.out.print("Olá mundo \n");	//sem quebra de linha
		
		System.out.printf("%n%s %d",i,f); //usa-se formataçao e sem quebra de linha
		
		System.out.printf("%n\n%.2f",x);
		
		Locale.setDefault(Locale.US); //muda o padrao de localizacao usado para US , usando separador ponto
		
		System.out.printf("%n\n%.2f",x);
	}
}
