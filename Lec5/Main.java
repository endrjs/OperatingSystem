package Lec5Tutorial;

public class Main {
	public static void main(String aregs[]){
		JavaSwingBridge bridge = new JavaSwingBridge();
		
		for(int i=0; i<3; ++i){
			Thread ship = new Thread(new Ship("ship"+i));
			ship.start();
		}
		
		for(int i=0; i<5; ++i){
			Thread car = new Thread(new Car("car"+i));
			car.start();
		}
	}

}
