package Lec7.DiningPhilosopher;

public class Main {
	public static void main(String args[]){
		Forks forks = new Forks();
		for(int i=0; i<5; ++i){
			Philosopher p = new Philosopher(i, forks);
			p.start();
		}
	}
	

}
