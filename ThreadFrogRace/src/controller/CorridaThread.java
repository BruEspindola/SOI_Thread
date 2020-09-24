package controller;

import java.util.Random;

public class CorridaThread extends Thread{
	private int Pulo;
	private String nome;
	private int distancia;
	private int p;
	private Random TamanhoPulo = new Random();
	static int lugar;
	
	public CorridaThread(String nome, int distancia){
	this.nome = nome;
	this.distancia = distancia;
	}
	
	@Override
	public void run() {
		Corrida();
	}
	
	public void Corrida() {
		while(Pulo < distancia){
			p = TamanhoPulo.nextInt(10);
			Pulo += p;
			System.out.println(nome+ " pulou " +p+ "M, e ele percorreu " +Pulo+ "M" );
			if(Pulo >= distancia){
				lugar++;
				System.out.println(nome+ " pulou " +p+ "M e terminou a corrida em " +lugar+ " lugar ");
			}
		}	
	}
}
