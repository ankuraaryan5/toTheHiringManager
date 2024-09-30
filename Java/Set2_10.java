import java.util.Scanner;

public class Set2_10 {
    public static void main(String[] args) {
        String a= "Dear <|name|>, Thanks a lot";
        System.out.println(a);
        System.out.println("input your name");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(a.replace("<|name|>", name));


    }
}