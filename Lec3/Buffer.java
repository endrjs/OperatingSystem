package Lec3; // Threads and Critical Section Problem

public class Buffer {
	
	int[] buffer;
	int spaceUsed;
	
	public Buffer(int size){
		buffer = new int[size];
		spaceUsed =0;
	}
	
	public synchronized void add(int toAdd){ //Synchronized keyword
		buffer[spaceUsed] = toAdd;
		++spaceUsed;
	}
	
	public synchronized void printBuffer(){
		System.out.print("[" + buffer[0]);
		for(int i = 1; i < spaceUsed; ++i){
			System.out.println("," + buffer[i]);
		}
		System.out.print("]");
	}
}
