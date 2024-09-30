class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public Base(){
        System.out.println("I m a constructor");
    }
}
class Derived extends Base{ //extends is used to declare inheritance
    int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }

}

class Animal{
    String sound;
    public void setSound(String s){
        this.sound=s;
    }
    public String getSound(){
        return sound;
    }
}
// class Dog extends Animal{

// }
class Dog extends Animal{
    public void setSound(){
        this.sound="barks";
    }
    public String getSound(){
        return sound;
    }
}
public class Inheritance_34 {
    public static void main(String[] args) {
        Derived d =new Derived();
        d.setX(65); // accessing Base class methods
        System.out.println("x: "+d.getX());
        d.setY(45);
        System.out.println("y: "+d.getY());

        // Java doesn't support multiple inheritance
        Dog dog = new Dog();
        // dog.setSound("Barks");
        dog.setSound();
        System.out.println("dog "+ dog.getSound());

        Animal cat = new Animal();
        cat.setSound("meows");
        System.out.println("cat " +cat.getSound());

    }
    
}