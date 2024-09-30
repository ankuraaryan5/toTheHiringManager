public class varargs_26 {
    static int sum(int ... arr){
        int res=0;
        for (int a:arr){
            res=res+a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2, 3, 4 is: "+ sum(2,3,4));
        System.out.println("Sum of 2, 3, 4, 5 is: "+ sum(2,3,4,5));
    }
}
