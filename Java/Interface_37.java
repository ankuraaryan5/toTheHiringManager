import java.util.Scanner;

interface Bicycle{
    int pedalCount =0;
    
    //interface is a group of related methods with empty bodies
    void applyBreak(int decrement);// methods inside an interface is public by Default
    void speedUp(int increment);
}
interface Horn{
    private void greet(){
        System.out.println("good morning");
    }
    void blowHorn();
    default void blowMusic(){
        greet();
        System.out.println("come on let's get grooving");
    }
}
class twoWheeler{
    public void Wheels(){
        System.out.println("i am a two wheeler");
    }
}
class avonCycle extends twoWheeler implements Bicycle, Horn{
    // if we are implementing an interface then we have to implement each of its method but not property
    // for example in interface Bicycle we have a property pedalCount so it is not necessary to implement it in this class we can skip that, but we cannot skip applyBreak or speedUp methods
    public int speed;
    // to implement a method from the interface we have to use public keyword
    public void applyBreak(int decrement) {
        speed = speed-decrement;
    }
    
    public void speedUp(int increment) {
        speed=speed+increment;
    }
    public void blowHorn(){
        System.out.println("Peepeepeep");
    }
    // public void blowMusic(){ // this will override the default method
    //     System.out.println("Waka Waka Ae Ae");
    // }
}
public class Interface_37 {
    public static void main(String[] args) {
        // what is the basic difference between interface and abstract class?
        // A class can implement multiple interfaces but can only extend one abstract class
        Scanner sc = new Scanner(System.in);
        avonCycle a = new avonCycle();
        a.Wheels();
        System.out.print("Enter the speed: ");
        a.speed = sc.nextInt();
        a.speedUp(7);
        System.out.println("speed after increment: "+a.speed);
        a.applyBreak(3);
        System.out.println("speed after decrement: "+ a.speed);
        // a.pedalCount=45; // we cannot modify the properties in a inteerface because they are final
        a.blowHorn();
        a.blowMusic();
        
    }    
}
