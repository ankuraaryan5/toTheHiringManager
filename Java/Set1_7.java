import java.util.Scanner;

public class Set1_7 {
    public static void main(String[] args) {
//        qn. 1
        float a = 8/4 * 9/2;
        float b = 7/4f * 9/2f;
        System.out.println(a);
        System.out.println(b);
//        qn 2
        char grade = 'b';
        grade = (char)(grade+8);
        System.out.println(grade);

        grade = (char) (grade-8);
        System.out.println(grade);

        //qn 3
        Scanner sc = new Scanner(System.in);
        System.out.println("input your number");
        int c = sc.nextInt();
        System.out.println(c>9);
//        qn 4
        int v =sc.nextInt();
        int u = sc.nextInt();
        int s = sc.nextInt();

        int d = (int) ((v*v - u*u)/(2*a*s));
        System.out.println(d);
//        qn 5

        int m= 7*49/7 + 35/7;
        System.out.println(m);
    }
}