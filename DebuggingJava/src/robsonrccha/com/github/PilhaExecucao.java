package robsonrccha.com.github;

public class PilhaExecucao {
	public static void main(String[] args) {
		
		// Programa para aprender sobre Pilha de Execução e Debugging
		
		System.out.println("O programa iniciou no método 'MAIN'");
		a();
		System.out.println("Finalizou o método 'MAIN'");
	}

	static void a() {
		System.out.println("Entrou no método 'A'");
		b();
		System.out.println("Finalizou o método 'A'");
		
	}

	static void b() {
		System.out.println("Entrou no método 'B'");
		for(int i = 1; i <= 4; i++)
			System.out.println(i);
		c();
		System.out.println("Finalizou o método 'B'");
		
	}

	static void c() {
		System.out.println("Entrou no método 'C'");
		
		//Thread.dumpStack();
		// A linha cima é utilizada para visualizar a pilha de execução
		
		System.out.println("Finalizou o método 'C'");
		
	}

}
