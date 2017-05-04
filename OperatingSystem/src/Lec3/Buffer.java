package Lec3;

public class Buffer {
	int[] buffer;
	boolean available = false;
	
	public Buffer(int bufferIn, boolean availableIn){
		buffer = new int[bufferIn];
		available = availableIn;
	}
	
	public int produce(){
		while(available == false){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			available = false;
			notifyAll();
			return contents;
		}
	}

}
