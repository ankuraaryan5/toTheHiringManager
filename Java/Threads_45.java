class MyThread extends Thread{ 
    public void run(){
        int i=0;
    while (i<5430) {
        
        System.out.println("The thread is up and running"); //--> stage3(running) and stage 4(non runnable i/o waiting)
        i++;
    }    
    }
    // --> stage 5 (terminated)
}

class YourThread extends Thread{
    public void run(){
        int i=0;
        while (i<4302) {
            
            System.out.println("The thread is up and running again");
            i++;
        }
    }
}
class NewThread implements Runnable{
    public void run(){
        while (true) {
            
            System.out.println("Running New Thread");
        }
    }
}
class LatestThread implements Runnable{
    public void run(){
        while(true){
            System.out.println("Running Latest Thread");
        }
        
    }
}
public class Threads_45 {
    public static void main(String[] args) {
        // MyThread m = new MyThread(); --> stage 1(new)
        // // m.run(); 
        // m.start(); --> stage 2 (runnable)
        // YourThread y = new YourThread();
        // y.start();
        // on running this program we will see clearly what is happening 
        NewThread n = new NewThread();
        LatestThread l = new LatestThread();
        Thread hit = new Thread(n);
        Thread sit = new Thread(l);
        hit.start();
        sit.start();
    }
}
