import java.util.Scanner;

public class Factorial {
    public int fact(int n){
        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Factorial factorial = new Factorial();
        System.out.println("factorial of "+n+" is: "+factorial.fact(n));
    }
}