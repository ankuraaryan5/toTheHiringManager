class Base{
    private int x;
    private int y;
    Base(int x, int y){
        System.out.println("I m Base constructor");
        this.x=x;
        this.y=y;
    } 
    // i only had this constructor earlier but when i inherited this class i got an error msg like 
    // "Implicit super constructor Base() is undefined. Must explicitly invoke another constructor" because the Derived class was trying to call the no-argument constructor of the Base class, but it did not exist.
    // so i made one below
    Base(){
        System.out.println("I m Base constructor");
    }
    Base(int x){
        System.out.println("x is equal to: "+x);
    }
}
class Derived extends Base{
    Derived(){
        // super(5,6) this is also one of the way to tackle the error, here we are explicitly calling the Base class's constructor with the required parameters from the Derived class's constructor
        System.out.println("i m derived constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("y is equal to: "+y);
    }
}

class Deriving extends Derived{
    Deriving(int x, int y, int z){
        super(x,y);
        System.out.println("z is equal to: "+z);
    }
}
public class Constructor_in_Inheritance_35 {
    public static void main(String[] args) {
        // Base base = new Base(5,3);
        // Derived d = new Derived();
        Deriving d =new Deriving(34,23,90);
    }
}