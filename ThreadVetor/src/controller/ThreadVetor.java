package controller;

public class ThreadVetor extends Thread {
	
	private int i;
	private int soma;
	private int vetor[] = new int[5];

	public ThreadVetor(int i, int[] matriz) {
		this.i = i;
		this.vetor = matriz;
		
	}

	@Override
	public void run() {
		soma();
	}

	private void soma() {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
		
			soma += vetor[j];
			if(j==4) {
				System.out.print(" " + vetor[j]);
			}else {
				System.out.print(" " + vetor[j] + " +");
			}
		}

		System.out.println("\n Id#"+ getId() +"  =>  " + soma + "\n ");
		
	}
}
