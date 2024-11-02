package Shape;

public class Rectangle extends Shape_ex5{
    Rectangle(int dim1, int dim2){
        super(dim1,dim2);
    }
    public int area(){
        return this.dim1 * this.dim2;
    }
}
