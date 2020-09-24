package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int matriz [][] = new int [3][5];
		
		Random sorteio = new Random();
		for (int i =0; i<3; i++) {
			for(int j=0; j<5; j++) {
			matriz[i][j]= sorteio.nextInt(10);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			Thread t = new ThreadVetor(i, matriz[i]);
			t.start();
	}
	
}
}
