public class Recursion_27 {
    static int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        else{
            n=n*fact(n-1);
        }
        return n;
    }
    static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("value of factorial " +x +" is: "+fact(x));
        int y=5;
        System.out.println(y + "th Fibonacci Number: " + fib(y));
    }
}

