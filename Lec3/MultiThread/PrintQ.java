package Lec3.MultiThread;

public class PrintQ extends Thread implements Runnable {
	public void run(){
		for(int i=0; i < 30; ++i){
			System.out.println("Q");
		}try{
			Thread.sleep(50);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
