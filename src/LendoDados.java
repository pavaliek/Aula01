import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		//A linha abaixo cria uma vari�vel (espa�o na RAM) que guarda texto
		String nome; 
		//A linha abaixo exibe uma mensagem
		System.out.println("Por faovr,digite seu nome: ");
		//A linha abaixo cria um Scanner, que � quem permite ler dados do teclado
        Scanner leitor = new Scanner(System.in);
        //A linha abaixo exibe uma mensagem com o conte�do da vari�vel nome
        nome = leitor.next();
        System.out.println("Boa noite para voc�, " + nome);
        //Como abrimos um recurso externo (a leitura de dados pelo teclaro) precisamos fechar para evitar erros em outros sistemas
        leitor.close();
	}

}
