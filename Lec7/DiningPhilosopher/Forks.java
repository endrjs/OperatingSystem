package Lec7.DiningPhilosopher;

public class Forks {
	int[] forks = {2,2,2,2,2};
	
	public synchronized void takeForks(int i){
		while(forks[i] != 2){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		int left = i-1;
		if(left == -1) left = 4;
		int right = i+1;
		if(right == 5) right = 0;
		--forks[left];
		--forks[right];
	}
	

	public synchronized void releaseForks(int i){
		int left = i-1;
		if(left == -1) left = 4;
		int right = i+1;
		if(right == 5) right = 0;
		++forks[left];
		++forks[right];
		notifyAll();
	}
}
