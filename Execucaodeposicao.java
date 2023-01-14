package aula;

public class Execucaodeposicao {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("João");
		aluno2.setNome("Joana");
		aluno3.setNome("Luiza");
		
		Vetor lista = new Vetor();
		
		// Adicionar aluno em uma dada posição

		lista.adicionar(aluno3);
		lista.adicionar(aluno2);
		lista.adicionar(aluno1);
		
		System.out.println(lista);

		
	//	lista.adicionar(0, aluno3);
	//	lista.adicionar(1, aluno2);
	//	lista.adicionar(aluno1);
		
	//	System.out.println(lista);

		// pegar um aluno em dada posição
		
		Aluno alunoemPosicao = lista.pegar(0);
		System.out.println(alunoemPosicao);
		
	//	System.out.println(lista.pegar(0));// faz direto 
		
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.contem(aluno1));
		System.out.println(lista.contem(aluno2));
		
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
	}

}


