import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um texto");
		String texto = leitor.nextLine();

		System.out.println("Você escreveu: "+ texto);	
	}
}
