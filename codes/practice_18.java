import java.util.Scanner;

public class practice_18 {
    public static void main(String[] args) {
        System.out.print("enter the value of n");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
//        for (int i=n; i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        int i=0;
//        int sum=0;
//        while(i<n){
//            sum=sum+(2*i);
////            System.out.println(i);
//            i++;
//        }
//        System.out.println(sum);

//        int i=1;
//        while(i<=10){
//            System.out.println(i*n);
//            i++;
//        }
//        int i=10;
//        while(i>=1){
//            System.out.println(n*i);
//            i--;
//        }
//        int i=n-1;
//        while(i>0){
//            n=n*i;
//            i--;
//        }
//        System.out.println(n);
        int sum=0;
        for(int i=1; i<=10;i++){
           sum=sum+(n*i);

        }
        System.out.println(sum);
    }
}

