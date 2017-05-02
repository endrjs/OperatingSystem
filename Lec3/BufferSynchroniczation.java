package Lec3;

public class BufferSynchroniczation {
	public static void main(String[] args){
		Buffer buffer = new Buffer(10);
		Thread p = new Producer(buffer, 1);
		Thread q = new Producer(buffer, 2);
		p.start();
		q.start();
		
	}
}
