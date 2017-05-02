package Lec3;

public class Producer extends Thread {
	
	int value;
	Buffer buffer;
	
	public Producer(Buffer toUse, int toProduce){
		value = toProduce;
		buffer = toUse;
	}
	
	public void run(){
		for(int i = 0; i <5; ++i){
			buffer.add(value);
			buffer.printBuffer();
			wasteSomeTime();
		}
	}
	
	public void wasteSomeTime(){
		int n =0;
		for(int j =0; j < 1000000; ++j ){
			++n;
			--n;
		}
	}
}
