import java.util.Scanner;

public class TrabalhandoComNumeros {
	
	// + soma
	// - subtração
	// * multiplicação
	//   / divisão

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
		System.out.println("A soma dos dois valores é " + soma); 
		subtracao = valor1 - valor2;
		System.out.println("A subtração entre os valores é " + subtracao);
		divisao = valor1 / (double)valor2;
		System.out.println("A divisão entre os valores é " + divisao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicação entre os valores é " + multiplicacao);
		leitor.close();
	}

}
