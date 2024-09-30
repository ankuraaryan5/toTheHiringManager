class Bro{
    private int a; // instance variable
    Bro(int a){
        // a=a; this will return 0 because it generates confusion
        this.a=a; // this provides a reference to the object to the class which is being created
    }
    public int getA(){
        return a;
    }
}
class BFF extends Bro{
    BFF(int a){
        // if a parent class doesn't have a default constructor then we have to use super keyword
        super(a);// a reference variable used to refer immediate parent class object
        System.out.println("I am BFF");
        //super can be used to invoke immediate parent class methods, constructors and instance variables
    }
}
public class this_and_super_36 {
    public static void main(String[] args) {
        Bro b= new Bro(35);
        BFF c = new BFF(32);
        System.out.println(b.getA());
        System.out.println(c.getA());
        
    }
}
