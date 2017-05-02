package PastPaper2016;

public class LevelCrossing {
	
	private boolean roadClosed = false;
	private String trainDirection = "west";
	int vehiclesOnCrossing = 0;
	
	public void useCrossing(Vehicle v){
		System.out.println("Vehicle" + v.vehicleName() + "Using Crossing in Direction " + v.getDirection());
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Vehicle" + v.vehicleName() + "Leaving Crossing in Direction" + v.getDirection());
	}
}
