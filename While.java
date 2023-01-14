package aula;
import java.util.Scanner;
public class While {
	
	public static void main(String[] args) {
		
	int idade = 0;
			
			String nome;
			
			Scanner teclado = new Scanner(System.in);
			
			while(idade >= 0) {		// ATENÇÃO , OS OPERADORESPRECISAM SER EXPLICITOS
				System.out.println("Informe seu nome :");
				nome = teclado.nextLine();
				
				System.out.println("Informe seu idade:");
				idade = teclado.nextInt(); // Isso vai gerar Bug
			
				System.out.println(nome + " tem "+ idade +" anos");
				 idade = -1;
				//break;
				
				//Isso soluciona um bug
				//idade = Integer.parseInt(teclado nextLine());
			}
			
			teclado.close();
			
			
	}
	
}
