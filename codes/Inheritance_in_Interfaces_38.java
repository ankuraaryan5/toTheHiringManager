interface Sample{
    void meth1();
    void meth2();
}

interface Sample2 extends Sample{
    void meth3();
    void meth4();
}

class SampleClass implements Sample2{
    // here we are Sample2 so do we need do implement meth1 and meth2?
    // Yes, because Sample2 is inheriting from Sample where meth1 and meth2 are present. If we don't implement them we will get an error
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_in_Interfaces_38 {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
