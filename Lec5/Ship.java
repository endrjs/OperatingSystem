package Lec5Tutorial;

public class Ship extends Vehicle implements Runnable {

	public Ship(String nameIn){
		super(nameIn,true);
	}
	
	public void run(){
		for(int i=0; i<3; ++i){
			try{
				if(carCount==0){
					bridgeAvailable.acquire();
					bridgeOpen = true;
					crossBridge();
					bridgeAvailable.release();
				}else if(carCount > 0){
					while(carCount==0){
						bridgeAvailable.acquire();
						bridgeOpen = true;
						crossBridge();
						bridgeAvailable.release();
					}
				}
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	public void crossBridge(){
		if(bridgeOpen == false){
			bridgeOpen = true;
			System.out.println("bridge is opened");
		}System.out.println(name + "is Sailing underneath the bridge");
		try{
			Thread.sleep(150);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
