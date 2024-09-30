public class Logical_12 {
    public static void main(String[] args) {
        System.out.println("Run for AND");
        boolean a = true;
        boolean b = false;
//        boolean b =true;
        if (a&&b) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("Run for OR");
//        boolean a1= true;
        boolean a1= false;
//        boolean b1=false;
        boolean b1= true;
        if (a1||b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
