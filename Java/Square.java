package Shape;
public class Square extends Shape_ex5{
    Square(int dim1){
        super(dim1, -1);
    }
    public int area(){
        return (int)(Math.PI*dim1*dim1);
    }
}
