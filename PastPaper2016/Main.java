package PastPaper2016;

public class Main {
	public static void main(String args[]){
		LevelCrossing lc = new LevelCrossing();
		
		for(int i=0; i<5; ++i){
			Thread car = new Thread(new Vehicle("car", "north","car"+i, lc ));
			car.start();
		
		}
		
	
	}
}
