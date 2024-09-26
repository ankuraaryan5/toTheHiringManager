import java.util.Scanner;

public class Marks_4 {
    public static void main(String[] args) {
        System.out.println("enter marks obtained in s1 ");
        Scanner a = new Scanner(System.in);
        int s1 = a.nextInt();
        System.out.println("enter marks obtained in s2 ");
        int s2 = a.nextInt();
        System.out.println("enter marks obtained in s3 ");
        int s3 = a.nextInt();
        System.out.println("enter marks obtained in s4 ");
        int s4 = a.nextInt();
        System.out.println("enter marks obtained in s5 ");
        int s5 = a.nextInt();
        float per = ((float) (s1+s2+s3+s4+s5)/500)*100;
        System.out.println("total obtained percentage is " + per);
    }
}