class Thr_Const extends Thread{
    Thr_Const(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while (i<4321) {
            System.out.println(i);
            i++;
        }
    }
}

class NewThread implements Runnable{
   
    public void run(){
        int i=0;
        while (i<76) {
            System.out.println(i);
            i++;
        }   
    }
}
public class ThreadCons_46 {
    public static void main(String[] args) {
        Thr_Const t = new Thr_Const("ankur");
        Thr_Const t1 = new Thr_Const("ankit");
        // t.start();
        // t1.start();
        // System.out.println("id of thread is "+ t.getId());// this ,method got deprecated from Java 19
        // System.out.println("name of the thread is "+t.getName());
        // System.out.println("name of the thread is "+t1.getName());
        // System.out.println("priority of this thread is "+ t.getPriority());
        // System.out.println("priority of this thread is "+ t1.getPriority());
        NewThread n = new NewThread();
        Thread kit = new Thread(n,"ankesh");
        System.out.println(kit.getName());
        // kit.setPriority(3);
        kit.setPriority(Thread.MAX_PRIORITY);
        System.out.println(kit.getPriority());
        Thread kit2 = new Thread(n, "ashish");
        System.out.println(kit2.getName());
        // kit2.setPriority(7);
        kit2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(kit2.getPriority());
        // thread methods
        // kit.start();
        // kit2.start();
        try {
            kit.join(); //this method might produce an exception so we have to put it in try block
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
