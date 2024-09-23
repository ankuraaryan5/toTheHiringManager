abstract class Parent{   // if a class includes abstract method it must be declared abstract
    public Parent(){
        System.out.println("i m default constructor");

    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet(); // a class with an abstract method is called an abstract class
    abstract public void greetAgain();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greetAgain(){
        System.out.println("Good Night");
    }
}

abstract class ChildAgain extends Parent{
    public void greetNew(){
        System.out.println("Good Afternoon");
    }
}
public class Abstract_36 {
    public static void main(String[] args) {
        // Parent p = new Parent();// we cannot make an object from an abstract class
        Child c = new Child(); // to implement the methods of an abstract class we have to make a subclass 
        // c.sayHello();
        // c.greet();   
        // if a subclass isn't able to implement methods of its parent class it must be abstract class
        // ChildAgain c = new ChildAgain(); // this is also an abstract class
    }
}
