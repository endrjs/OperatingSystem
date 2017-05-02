/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicthreads;

/**
 *
 * @author Andrew
 */
public class BasicThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread p = new PrintP();
	Thread q = new Thread(new PrintQ());
	p.start();
	q.start();
        /*try{
            p.join();            
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/
	for(int i = 0; i < 200; ++i){
	   System.out.print("R");
	}
  }

    
}
