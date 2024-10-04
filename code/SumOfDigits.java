import java.util.Scanner;;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("enter your number ");
        int n =sc.nextInt();
        int sum=0;
        int digit=0;
        System.out.print("sum of digits of "+n+" is: ");
        while (n>0) {
            digit=(n%10);
            sum=sum+digit;
            n=n/10;
        }
        System.out.print(sum);
    }
}