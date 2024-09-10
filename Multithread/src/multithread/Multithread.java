package multithread;

public class Multithread {
    
    public static void main(String[] args) {
        Mythread [] threads = new Mythread[5];
        
        for (int i=0;i<5;i++){
            threads[i]= new Mythread("thread"+(i+1));
            threads[i].start();
        }
        Thread thread = new Thread(new MythreadRunner());
      thread.start();
      new Thread (new MythreadRunner()).start(); 
    }  
}
