package Lec7.DiningPhilosopher;

public class Philosopher extends Thread {
	int id;
	Forks forks;
	public Philosopher(int i, Forks forkIn){
		id = i;
		forks = forkIn;
	}

	public void run(){
		while(true){
			System.out.println("Philosopher" + id + "Thinking");
			forks.takeForks(id);
			System.out.println("Philosopher" + id + "eating");
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
			forks.releaseForks(id);
		}
	}
}
