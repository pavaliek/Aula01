import java.util.Scanner;

public class TrabalhandoComNumeros {
	
	// + soma
	// - subtra��o
	// * multiplica��o
	//   / divis�o

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		double divisao;
		int multiplicacao;
		System.out.println("PROGRAMA CALCULADORA!");
		System.out.println("Por favor, informe o primeiro valor:");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, informe o segundo valor: ");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma dos dois valores � " + soma); 
		subtracao = valor1 - valor2;
		System.out.println("A subtra��o entre os valores � " + subtracao);
		divisao = valor1 / (double)valor2;
		System.out.println("A divis�o entre os valores � " + divisao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplica��o entre os valores � " + multiplicacao);
		leitor.close();
	}

}
