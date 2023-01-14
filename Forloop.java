package aula;import java.util.Scanner;

public class Forloop {

	
	public static void main(String[] args) {
		
		int idade = 0; // fique mudando a variável
		
				String nome;
				
				Scanner teclado= new Scanner(System.in);
				
				for (int i= 0; i<5; i++) {
					System.out.println("Informe seu nome: ");
					nome = teclado.nextLine();
					
					System.out.println("Informe sua idade:");
					idade= Integer.parseInt(teclado.nextLine());
					
					System.out.println(nome +" tem "+ idade+" anos");
					break;
				}
				
				teclado.close();
	}
}
