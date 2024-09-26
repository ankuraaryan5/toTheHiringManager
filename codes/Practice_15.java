import java.util.Scanner;

public class Practice_15 {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks in sub1");
        m1=sc.nextByte();

        System.out.println("enter your marks in sub2");
        m2=sc.nextByte();

        System.out.println("enter your marks in sub3");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your % is "+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congrats! you have been promoted");
        }
        else{
            System.out.println("sorry, you have not been promoted");
        }
    }
}

