class GoodMorning extends Thread{
    public void run(){
        int i =1;
        while (i<10) {
            System.out.println("good morning");
            i++;
        }
        System.out.println(Thread.currentThread().getName());
    }
    
}
class Welcome extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(3);
                
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}
public class Practice_47 {
    public static void main(String[] args) {
    GoodMorning g = new GoodMorning();
    g.start();
    Welcome w = new Welcome();
    // w.start();
    g.setPriority(3);
    System.out.println(g.getPriority());
    System.out.println(g.getState());
    System.out.println(Thread.currentThread().getName());
    w.setPriority(9);
    System.out.println(w.getPriority());
    System.out.println(w.getState());
    System.out.println(Thread.currentThread().getName());

    
    }
}
