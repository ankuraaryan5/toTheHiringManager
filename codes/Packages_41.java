package newPackage;
class aClass {
    int x = 5;
    int y = 6;
    int a;
    int b;
    public aClass(){
        a= this.x;
        b= this.y;
    }
    void getVar(int a,int b){
        System.out.println(a + b);
    }
}

public class Packages_41 {
    public static void main(String[] args) {
        System.out.println("Creating a package");
        aClass a = new aClass();
    }
}
