package multithread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mythread  extends Thread{
    private String threadName;
    private int blocktime;
    
    Random rand = new Random();

    public Mythread(String threadName) {
        this.threadName = threadName;
        this.blocktime = rand.nextInt(10)*1000;
    }

    @Override
    public void run() {
        super.run();
         System.out.println(this.threadName+" is running");
         
        try {
            Thread.sleep(this.blocktime);
            System.out.println(this.threadName+"("+this.blocktime+") is completed");
        } catch (InterruptedException ex) {
            Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
}
