import java.util.Scanner;

public class Arrays_21 {
    public static void main(String[] args) {

        int [] marks = {34, 54, 65, 32, 65};
        System.out.println(marks[3]);
        System.out.println(marks.length);
        Scanner sc = new Scanner(System.in);
        String [] student = new String[5];
        for(int i=0; i<student.length; i++){
           System.out.println("enter name: ");
           student[i]=sc.nextLine();
        }
        for(int j=0; j<student.length; j++){
            System.out.print(student[j] + " ");
        }
    }
}
