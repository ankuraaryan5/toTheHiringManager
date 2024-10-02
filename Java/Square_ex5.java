package Shape;
public class Square_ex5 extends Shape{
    public Square_ex5(int d1){
        super(d1, -1); // -1 means this value doesn't exist
    }
    public int getArea(){
        return this.dim1*this.dim1;
    }
}
