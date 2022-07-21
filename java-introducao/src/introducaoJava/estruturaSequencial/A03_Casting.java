package introducaoJava.estruturaSequencial;


public class A03_Casting {
	
	public static void main(String[] args) {
		int B,b,h;
		double area1,area2;
		
		B = 8;
		b = 5;
		h = 3;
		
		area1 =         ((b + B)*h )/2; // como os valores usados sao inteiros o resultado sera inteiro
		area2 = (double)((b + B)*h )/2; // para dar o valor exato e preciso fazer casting da operaçao
		
		System.out.println(area1);
		System.out.println(area2);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		/*casting serve para armazenar valores com informaçao maior em tipos de variaveis menores 
		ex:. armazenar uma dado flutuante em uma variavel int*/
		
		double p = 3.50;
		int z;
		
		z = (int) p; //armazenando uma valor flutuante em uma variavel inteira e nao arredonda
		
		System.out.println(z);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int v = 3;
		double n;
		n = v; //armazenar um valor inteiro em uma variavel double nao tem problema pois nao ha perca de inf.
		
		System.out.println(n);
	}
}	