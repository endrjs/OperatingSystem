/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicthreads;

/**
 *
 * @author Andrew
 */
public class PrintP extends Thread {
    
    public void run(){
        
        for(int i = 0; i < 100; ++i){
            System.out.print("P");
            //waste some time
            int n = 0;
            for(int j = 0; j < 1000000; ++j){
                ++n;
                --n;
            }
            /*try{
              Thread.sleep(30);
            } catch (InterruptedException e){
              e.printStackTrace();
            }*/
        }
  }

}
