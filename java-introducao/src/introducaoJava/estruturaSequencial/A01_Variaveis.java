package introducaoJava.estruturaSequencial;
/*
 * no java as variaveis sao tipadas , isos quer dizer que cada uma tem um tipo referente ao tipo de dado
 * que ela armazena, sendo assim em contexto computacional variavel e um espaço de memoria onde sera
 * armazenado dados a serem trabalhados;
						sintaxe de declaraçao = ( tipo nome = value;)
 */
public class A01_Variaveis {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		int idade = 25; // declaraçao e atribuiçao
		int mes; //decalraçao
		mes = 12; //atribuiçao
		
		//tipos numericos inteiros
		byte a;
		short b;
		int c; //(standard)
		long d;
		
		//tipos numericos flutuantes
		float e;
		double f; //(standard)
		
		//booleanos
		boolean g;
		
		//caracteres
		char h;
		
		//texto (nao é um tipo primitivo)
		String x;
	}
}