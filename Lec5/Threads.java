package Lec5;

public class Threads extends Thread {
 
	public void run(){
		for(int i=0; i<100; ++i){
			System.out.println("P");
			try{
				Thread.sleep(30);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
