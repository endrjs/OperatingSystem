package Lec5Tutorial;

import java.util.concurrent.Semaphore;

public abstract class Vehicle {
	//sharedVariable
	static Semaphore bridgeAvailable = new Semaphore(1);
	static Semaphore carAvailable = new Semaphore(1);
	static boolean bridgeOpen = false;
	static int carCount = 0;

	protected boolean needsBridgeOpen;
	protected String name;
	
	public Vehicle(String nameIn, boolean landBasedIn){
		name = nameIn;
		needsBridgeOpen=landBasedIn;
	}
	
}
