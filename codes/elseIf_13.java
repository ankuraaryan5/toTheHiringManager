import java.util.Scanner;

public class elseIf_13 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter you age");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced");
        } else if (age>45) {
            System.out.println("you are semi-experienced");
        } else if (age>30) {
            System.out.println("you are semi-semi-experienced");
        }
        else {
            System.out.println("you are not experienced");
        }
    }
}
