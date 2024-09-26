import java.util.Scanner;

public class Switch_14 {
    public static void main(String[] args) {
//        int age;
//        System.out.println("enter your age");
//        Scanner sc = new Scanner(System.in);
//        age= sc.nextInt();
//        switch(age){
//            case 18:
//                System.out.println("your are going to become adult!");
//                break;
//            case 23:
//                System.out.println("you are going to join a job");
//                break;
//            case 60:
//                System.out.println("you are going to retire");
//                break;
//            default:
//                System.out.println("enter correct age");
//        }
//        System.out.println("thanks for running the code");
        String var= "raaa";
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        var = sc.next();
        switch (var){
            case "c":
                System.out.println("you entered C");
                break;
            case "raaa":
                System.out.println("you entered R");
                break;
            case "p":
                System.out.println("you entered P");
                break;
            default:
                System.out.println("good luck");
        }
    }
}
