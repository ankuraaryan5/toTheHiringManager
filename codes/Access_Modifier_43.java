package Access;
class C1{
    public int x=4;
    protected int y =9;
    int z= 9;
    private int a= 43;  
    public void meth1()    {
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
        System.out.println("a: "+a);// can access a private member inside the class
    }
}

// class C2 extends C1{

// }
public class Access_Modifier_43 {
    public int t = 43;
    protected int s = 42;
    int h = 54;
    private int f =0;
    public void meth2(){
        System.out.println(t);
        System.out.println(s);
        System.out.println(h);
        System.out.println(f);
    }
    
    public static void main(String[] args) {
        
        C1 c = new C1();
        c.meth1();

        System.out.println("x: "+c.x);
        System.out.println("y: "+c.y);
        System.out.println("z: "+c.z);
        // System.out.println("a: "+c.a); // can't access a private member from outside the class

        Access_Modifier_43 a = new Access_Modifier_43();
        // a.meth2();

    }   
}
