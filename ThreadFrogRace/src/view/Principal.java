package view;
import controller.CorridaThread;

public class Principal {
	public static void main(String[] args) {
		
		int qtdeSapos = 5;	
		int Distancia = 10; //Tamanho da pista em Metros
		
		for (int i = 0; i < qtdeSapos ; i++) {
			Thread Sp_corre = new CorridaThread("O sapo_"+ i, Distancia);
			Sp_corre.start();
		}
	}
	
}
