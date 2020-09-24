package controller;

public class ThreadSaida extends Thread {
	public ThreadSaida(){
		super();
	}
	
	@Override
	public void run() {
				
		int id = (int) getId();
		
		System.out.println("id# "+id);
		
	}
	
	
	
}