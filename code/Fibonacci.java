import java.util.Scanner;

public class Fibonacci {
    public int fib(int n) {
        if (n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number upto which you want the fibonacci series: ");
        int n = sc.nextInt();
        Fibonacci fib = new Fibonacci();
        for(int i=0;i<n;i++){
            System.out.print(fib.fib(i)+" ");
        }
    }
}
