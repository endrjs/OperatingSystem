package Lec5Tutorial;

public class Car extends Vehicle implements Runnable {

	public Car(String nameIn){
		super(nameIn,false);
	}
	
	public void run(){
		for(int i=0; i<5; ++i){
			try{
				carAvailable.acquire();
				if(carCount == 0){
					bridgeAvailable.acquire();
				}
				++carCount;
				carAvailable.release();
				crossBridge();
				carAvailable.acquire();
				--carCount;
				if(carCount == 0){
					bridgeAvailable.release();
				}
				carAvailable.release();
				}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	
	public void crossBridge(){
		if(bridgeOpen == true){
			bridgeOpen = false;
			System.out.println("bridge is closed");
		}
		System.out.println(name +"is crossing the bridge");
	try{
		Thread.sleep(100);
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("Done");
}
}
