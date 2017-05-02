package PastPaper2016;

public class Vehicle extends Thread {
	
	String type, direction, name;
	LevelCrossing crossing;
	int carCount;
	
	
	
	public Vehicle(String typeIn, String directionIn, String nameIn, LevelCrossing levelCrossing){
		type = typeIn;
		direction = directionIn;
		name = nameIn;
		crossing = levelCrossing;
	}
	
	public void cross(){
		crossing.enterCrossing(this);
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}crossing.leaveCrossing(this);
	}

	public String getType(){
		return type;
	} 
	
	public synchronized void enterCrossing(Vehicle v){
		while(carCount > 0 ){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		} ++vehiclesOnCrossing;
	}
	
	public synchronized void exitCrossing(Vehicle v){
		--carCount;
		System.out.println(v.name + "is exiting to " + v.direction + "way");
		notifyAll();
	}	
	public String getDirection(){
		return direction;
	}
	
	public String vehicleName(){
		return name;
	}
}
