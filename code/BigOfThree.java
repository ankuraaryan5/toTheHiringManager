import java.util.Scanner;
public class BigOfThree {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = Sc.nextInt();
        System.out.print("enter second number: ");
        int b = Sc.nextInt();
        System.out.print("enter third number: ");
        int c = Sc.nextInt();
        if ((a==b)&&(b==c)) {
            System.out.println("these are same numbers ");
        }
        else if ((a>=b)&&(a>=c)) {
            System.out.println(a+" is the greater number");
        }
        else if ((b>=a)&&(b>=c)) {
            System.out.println(b+" is the greater number");
        }
        else{
            System.out.println(c+" is the greater number");
        }
    }    
}
