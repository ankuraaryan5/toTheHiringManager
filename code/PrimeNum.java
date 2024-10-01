import java.util.*;;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime=true;
        System.out.print("enter the number ");
        
        int a = sc.nextInt();
        if (a==0||a==1||a==2) {
            System.out.println(a+" is not a prime number");
            return;
        }
        for(int i=2; i<a;i++){
            if (a%i==0) {
                System.out.println(a+" is not a prime number");
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a +" is a prime number");
        }
    }
}
