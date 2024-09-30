class Phone{
    // public Phone(){
    //     System.out.println("I m nokia 1100");
    // }
    public void on(){
        System.out.println("turning on Phone...");
    }
}
class SmartPhone extends Phone{
    // public SmartPhone(){
    //     System.out.println("i m moto G62");
    // }
    public void on(){
        System.out.println("turning on SmartPhone...");
    }
    public void turnMusic(){
        System.out.println("mera jo safar hai");
    }
}
public class Dynamic_method_dispatch_38 {
    public static void main(String[] args) {
        Phone nokia = new Phone(); // allowed
        SmartPhone moto = new SmartPhone(); // allowed
        Phone micromax = new SmartPhone(); //allowed
        // SmartPhone mi = new Phone() //disallowed
        micromax.on(); // micromax is referencing to Smartphone' method so it will run on method inside smartphone
        // this is called dynamic method dispatch because which method will run is decided on run time, because object is created at run time
        // micromax.turnMusic();// micromax is an object of Phone and phone doesn't have any turnMusic method inside it so it will generate error
        // a superclass reference can point to a subclass object, but a subclass reference cannot point to a superclass object.
        
    }    
}
