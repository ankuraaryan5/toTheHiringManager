import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int [] arr= {45, 32, 65, 87, 46, 45};
        // searching an element
        System.out.print("enter the element to search for: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a) {
                System.out.println(a + " found at "+i+" position");
                flag=true;
            }    
        }
        if (!flag) {
            System.out.println("couldn't find the element");
        }

        // insertion
        System.out.println("enter the position of element to insert/replace");
        int k=sc.nextInt();
        System.out.println("enter the new element to insert");
        int j = sc.nextInt();
        if (k >= arr.length || k < 0) {
            System.out.println("Position is out of bounds");
        } else {
            arr[k] = j; // Replacing the element at position k
            System.out.println("Array after replacement:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
