import java.util.Scanner;

public class Loops_16 {
    public static void main(String[] args) {
        int i=1;
        while (i<=3){
            System.out.println(i);
            i++;
        }
//        while (i>=3){
//            System.out.println(i);
//            i++;
//        }
//        infinite loop
        int b =10;
        do {
            System.out.println(b);
            b++;
        }
        while(b<5);

        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int j=1;
        System.out.println("first "+n+" natural numbers are");
        do {

            System.out.println(j);
            j++;
        }
        while (j<n);
        System.out.println("first "+n+" odd numbers are");
        for (int c=0; c<n;c++){
            System.out.println(2*c+1);
        }
    }
}

