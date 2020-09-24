package controller;

public class ThreadVetor extends Thread {
	private int[] vetor;
	private int Num;

	public ThreadVetor(int[] vetor, int num) {
		this.Num = num;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		Verificar();
	}

	private void Verificar() {
		if(Num == 1) {
		int soma = 0;
			double tempoInicial = System.nanoTime();
			for( int i : vetor ) {
				soma += i;
			}
			double tempoFinal = System.nanoTime();		
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Foreach Tempo "+tempoTotal+ ".s \n");
			System.out.println("Soma Foreach: " +soma + "\n ");
		}
		
		if (Num == 2) {
			int soma = 0;
			double tempoInicial = System.nanoTime();
			
			for (int i = 0 ; i < vetor.length; i++) {
				soma += vetor[i];
			}
			double tempoFinal = System.nanoTime();		
			double tempoTotal = tempoFinal - tempoInicial;
			
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("For Comum Tempo "+tempoTotal+ ".s \n");
			System.out.println("Soma For Comum: " +soma +"\n");

		}
	}

}
