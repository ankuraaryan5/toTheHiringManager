import java.util.Scanner;

public class Practice_28 {
//    static void table(int n){
//        System.out.println("here is the table for "+ n);
//        for (int i=1; i<=10;i++){
//            System.out.format("%d * %d = %d\n", n,i,n*i);
//        }
//    }
//    static void pattern(int n){
//        for (int i=n;i>0; i--){
//            for (int j=0; j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int sum0fn(int n){
//        if (n==1)
//            return 1;
//        return n+sum0fn(n-1);
//    }
//    static void pattern(int n){
//        for (int i=0;i<n;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int fib(int n){
////        if (n==1){
////            return 0;
////        }
////        else if (n==2){
////            return 1;
////        }
//        if (n==1||n==2){
//            return n-1;
//        }
//        else
//            return fib(n-1)+fib(n-2);
//    }
//    static void pattern_rec(int n){
//        if (n>0){
//            pattern_rec(n-1);
//            for (int i=0; i<n;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        //Problem 1
//        System.out.println("enter the number for which you want to generate the table ");
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        table(a);
        //Problem 2
//        pattern(7);
        //Problem 3
//        System.out.println(sum0fn(3));
        //Problem 4
//        pattern(5);
        //Problem 5
//        System.out.println(fib(5));
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(fib(i));
//        }
        //Problem 6
//        System.out.println(avg(6));
        //Problem 7
//        pattern_rec(5);
        //Problem 9
        System.out.print("Enter the temp: ");
        Scanner sc =new Scanner(System.in);
        float temp= sc.nextInt();
        float res = (temp*9/5)+32;
        System.out.println("temp in fahrenheit is "+res);
    }
}
