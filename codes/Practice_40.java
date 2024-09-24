abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("writing");
    }

    @Override
    void refill() {
        System.out.println("refilling");
    }

    void changeNib() {
        System.out.println("changing nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("jumping");
    }

    void bite() {
        System.out.println("biting");
    }
}

interface basicAnimal {
    void sleep();

    void eat();
}

class Human extends Monkey implements basicAnimal {
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

}

abstract class telePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class smartPhone extends telePhone {
    @Override
    void ring() {
        System.out.println("ringing");
    }

    @Override
    void lift() {
        System.out.println("lifting");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting");
    }

    void network() {
        System.out.println("connecting to internet");
    }
}
interface tvRemote{
    void power();
    void changeChannel();
}
interface smartTVRemote extends tvRemote{
    @Override
    default void power() {
        System.out.println("turning on power");
    }
    @Override
    default void changeChannel() {
        System.out.println("changing channel");
    }
    void changeOTT();
}

class TV implements tvRemote{
    @Override
    public void changeChannel() {
        System.out.println("changing channel");
    }
    @Override
    public void power() {
        System.out.println("turning on tv");
    }
    // @Override
    // public void changeOTT(){
        // this is a smartTV method so we can't implement it here
    // }
}
public class Practice_40 {
    public static void main(String[] args) {
        // question 1 and 2
        // FountainPen pen = new FountainPen();
        // pen.changeNib();
        // question 3
        // Human human= new Human();
        // human.bite();human.eat();human.jump();human.sleep();
        // question 4
        // Monkey monkey= new Human();
        // monkey.bite();
        // monkey.jump();
        // basicAnimal bro = new Human();
        // bro.eat();
        // bro.sleep();
        // smartPhone sm = new smartPhone(); // direct smartPhone object
        // sm.disconnect(); // Calls smartPhone's disconnect (no polymorphism here)
        // sm.lift(); // Calls smartPhone's lift (no polymorphism here)
        // sm.network(); // Calls smartPhone-specific method (no polymorphism here)
        // telePhone tp = new smartPhone(); // tp is of type telePhone, but holds a smartPhone object
        // tp.disconnect(); // Calls smartPhone's disconnect (polymorphism in action)
        // // tp.network(); // Error: telePhone doesn't have network(), even though tp is a
        // // smartPhone
        TV tv = new TV();
        tv.power();
        tv.changeChannel();
    }
}
