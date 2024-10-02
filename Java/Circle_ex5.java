package Shape;
public class Circle_ex5 extends Shape{
    public Circle_ex5(int d1){
        super(d1, -1);
    }
    public int getArea(){
        return (int) (Math.PI)*this.dim1*this.dim1;
    }
}
