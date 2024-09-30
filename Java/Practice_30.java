class Employee {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int n) {
        salary = n;
        return salary;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("ringing");
    }

    public void vibrate() {
        System.out.println("vibrating");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

}

class Rectangle {
    int l, b;

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }
}
class tommyVecetti{
    public void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing");
    }
}
class Circle{
    int radius;
    public int area(){
        return (int) (3.14*radius*radius);
    }
    public int perimeter(){
        return (int) (2*3.14*radius);
    }
}
public class Practice_30 {
    public static void main(String[] args) {
        System.out.println("1");
        Employee Anku = new Employee();
        Anku.name = "Ankur";
        Anku.salary = 100000;
        System.out.println(Anku.getName());
        System.out.println(Anku.getSalary());
        System.out.println(Anku.setSalary(340000));
        System.out.println(Anku.getSalary());
        // Problem 2
        CellPhone phone = new CellPhone();
        phone.ring();
        phone.vibrate();

        // Problem 3
        Square square = new Square();
        square.side = 5;
        System.out.println("area of the square is : " + square.area());
        System.out.println("perimeter of the square is :" + square.perimeter());

        // Problem 4
        Rectangle r = new Rectangle();
        r.l = 4;
        r.b = 5;
        System.out.println("area of the rectangle is : " + r.area());
        System.out.println("perimeter of the rectangle is :" + r.perimeter());
        // Problem 5
        tommyVecetti bro = new tommyVecetti();
        bro.hit();
        bro.run();
        bro.fire();
        //Problem 6
        Circle c = new Circle();
        c.radius=5;
        System.out.println("area of the circle is : "+ c.area());
        System.out.println("perimeter of the circle is : "+ c.perimeter());

    }

}
