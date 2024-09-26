import java.util.Scanner;

public class Methods_24 {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else if (x<y){
            z=x*y;
        }
        else {
            z=x-y+1;
        }
        return z;
    }
//    int logicB(int x, int y){
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else if (x<y){
//            z=x*y;
//        }
//        else {
//            z=x-y+1;
//        }
//        return z;
//    }
    public static void main(String[] args) {
        // the basic difference between a method and a function is that
        // a method is a function which is inside a class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a");
        int a = sc.nextInt();
        System.out.println("enter the value for b");
        int b = sc.nextInt();
        int c =logic(a,b);
//        Methods_24 obj = new Methods_24();
//        c= obj.logicB(a,b);
        System.out.println(c);
    }
}
