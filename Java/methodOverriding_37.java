class A{
    private int a;
    public void meth1(){
        System.out.println("i m method 1 of class A");
    }
    public void meth2(){
        System.out.println("i m method 2 of class A");
    }
}
class B extends A{
    @Override// this notation is not necessary but recommended because it gives a clarity as if the method is actually getting overrided or not
    // if the method is not getting overrided then this notation will generate an error 
    public void meth1(){ // here we are overriding method 1 of class A
        System.out.println("i m method 1 of class B");
    }
    
}
public class methodOverriding_37 {
    public static void main(String[] args) {
        A a= new A();
        a.meth1();
        B b = new B();
        b.meth1();
    }
}
