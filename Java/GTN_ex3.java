import java.util.Random;
import java.util.Scanner;

class Game{
    private int chances=0;
    private int actualNum;
    public Game(int a){
        actualNum=a;
    }
    public boolean guessNum(int g){
        if (actualNum<g) {
            System.out.println("guess a smaller number");
            chances++;
            return false;
        }
        else if (actualNum>g) {
            System.out.println("guess a bigger number");
            chances++;
            return false;
        }
        else{
            System.out.println("you took "+ chances+ " chances to guess");
            return true;
        }
    }
}
public class GTN_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int actualNum= random.nextInt(0,100);
        System.out.println("guess the number");
        Game game = new Game(actualNum);
        boolean gameOver=false;
        while (!gameOver) {
            int guessNum= sc.nextInt();
            gameOver = game.guessNum(guessNum);
        }
    }
}
