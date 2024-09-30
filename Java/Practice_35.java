class Circle{
    public int radius;
    public Circle(){
        System.out.println("I am just living");
    }
    public Circle(int r){
        this.radius=r;
    }
    public int getArea(){
        return (int) (Math.PI*radius*radius);
    }
}
class Cylinder extends Circle{
    private int height;
    public Cylinder(int r, int h){
        super(r);
        this.height=h;
    }
    public int volume(){
        return (int) (Math.PI*this.radius*this.radius*this.height);
    }
}

class Rectangle{
    public int length;
    public int breadth;
    public int area;
    public Rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public int getArea(){
        return area = length*breadth;
    }
}
class Cuboiod extends Rectangle{
    private int height;
    public Cuboiod(int l, int b,int h){
        super(l, b);
        this.height=h;

    }
    public int getVolume(){
        // return (int) (getArea()*height);
        return (int) (this.length*this.breadth*height);
    }
}
public class Practice_35 {
    public static void main(String[] args) {
        // Circle circle = new Circle(5);
        // System.out.println("area of circle is: "+ circle.getArea());
        // Cylinder cy = new Cylinder(3, 5);
        // System.out.println("volume of cylinder is "+cy.volume());

        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.getArea());
        Cuboiod c = new Cuboiod(1, 3, 5);
        System.out.println("volume of cuboid is:"+c.getVolume());
    }
}
