package Cal;

import java.util.Scanner;

class Calculator{
    public int a;
    public int b;

    Calculator(int a,int b){
        this.a=a;
        this.b=b;
        int sum =a+b;
        System.out.println(sum);
    }

}

class ScCalculator extends Calculator{
    
    ScCalculator(int a, int b){
        super(a, b);
    }
    public int SumFN(){
        System.out.println("a: "+this.a);
        System.out.println("b: "+this.b);
        int sum = a+b;
        return sum;
    }
}

class userMsg{
    userMsg(String s){
        System.out.println(s);
    }
}

public class Practice_44 {
    public static void main(String[] args) {
        //Problem 1
        // Calculator c = new Calculator(2,3);
        ScCalculator sc = new ScCalculator(2,3);
        sc.SumFN();

        // Problem 2
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your string");
        String s = scn.nextLine();
        userMsg u = new userMsg(s);

    }
}
