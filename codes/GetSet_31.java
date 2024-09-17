class MyEmployee{
    private int id; //private is a access modifier
    private String name;

    // Why did we make these variables private?
    // To control the access of these variables, now we cannot access these variables directly.


    // we cannot directly access these variables outside of this class so we need to make some getter and setter methods
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

class Circle {
    private int radius;
    private double area;
    
    public void setRadius(int r){
        radius=r;
        setArea();
    }
    private void setArea(){
        area=Math.PI*radius*radius;
    }
    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return area;
    }
}

public class GetSet_31 {
    public static void main(String[] args) {
        MyEmployee Ankur = new MyEmployee();
        Ankur.setName("Ankur");
        Ankur.setId(23);
        System.out.println("We have a new Employee joining us : "+ Ankur.getName());
        System.out.println("His employee id is : "+ Ankur.getId());

        Circle c= new Circle();
        c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}
