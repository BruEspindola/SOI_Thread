package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int vetor [] = new int [1000];
		int Num;
		
		 Random gerador = new Random();
		 
		 for(int i = 0; i< vetor.length;i++) {
			 vetor [i] = gerador.nextInt(100)+1;
		 }
		 
		 for(Num = 1; Num <= 2; Num ++) {
			 Thread sorte = new ThreadVetor(vetor, Num);
				sorte.start();
		 }
	}
}
