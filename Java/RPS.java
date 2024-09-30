import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        // 1 == rock
        // 2 == paper
        // 3 == scissor
        System.out.println("choose any number between 1 to 3");
        Scanner sc = new Scanner(System.in);
        int userIn= sc.nextInt();
        Random random = new Random();
        int compIn= random.nextInt(0,3);
        System.out.println("computer chose: " + compIn);
        if (userIn==compIn) {
            System.out.println("draw");
        }
        else if (userIn == 0 && compIn==2 || userIn == 1 && compIn == 0 || userIn == 2 && compIn== 1 ) {
            System.out.println("you won");
        }
        else{
            System.out.println("computer won");
        }
    }
    
}