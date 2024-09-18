import org.w3c.dom.css.Rect;

class Cylinder{
    private int radius;
    private int height;
    private double area;
    public void setRadius(int r){
        this.radius=r;
        calArea();
    }
    public void setHeight(int h){
        this.height=h;
        calArea();
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double calArea(){
        return area=Math.floor((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
    }
    public Cylinder(int r, int h){
        this.height=h;
        this.radius=r;
    }
}

class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        this.length=4;
        this.width=5;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public Rectangle(int l,int w){
        this.length=l;
        this.width=w;
    }

}

class Sphere{
    private int radius;
    private double area;
    public Sphere(){
        this.radius=5;
    }
    public double calArea(){
        return area = Math.floor(4*Math.PI*radius*radius);
    }
}
public class Practice_33 {
    public static void main(String[] args) {
        // //problem 1
        // Cylinder cy= new Cylinder();
        // cy.setHeight(90);
        // cy.setRadius(15);
        // System.out.println(cy.getHeight());
        // System.out.println(cy.getRadius());
        // //problem 2
        // System.out.println(cy.calArea());
        // problem 3
        // Cylinder cy = new Cylinder(90,15);
        // System.out.println(cy.getHeight());
        // System.out.println(cy.getRadius());
        // problem 4
        // Rectangle rectangle= new Rectangle(6,21);
        // System.out.println(rectangle.getLength());
        // System.out.println(rectangle.getWidth());
        // problem 5
        Sphere sphere= new Sphere();
        System.out.println(sphere.calArea());
    }    
}
