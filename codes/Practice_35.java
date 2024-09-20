class Circle{
    public int radius;
    public Circle(int r){
        this.radius=r;
    }
    public int getArea(){
        return (int) (Math.PI*radius*radius);
    }
}
class Cylinder extends Circle{
    int height;
    public Cylinder(int r, int h){
        super(r);
        this.height=h;

    }
    public int volume(){
        return (int) (Math.PI*this.radius*this.radius*this.height);
    }
}
public class Practice_35 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(3, 5);
        System.out.println("volume of cylinder is "+cy.volume());
    }
}
