import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr= new int[10];
        int capacity = arr.length;
        Scanner sc = new Scanner(System.in);
        int position=arr.length-1;
        System.out.println("enter the element to insert");
        int element=sc.nextInt();
        System.out.print("Before Insertion: ");
        for (int i = 0; i < capacity; i++){
            System.out.print(arr[i] + " ");
        }
        int n = insertAtEnd(arr, position, element, capacity);
        System.out.print("\n After Insertion: ");
        for (int i = 0; i < capacity; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int insertAtEnd(int[] arr, int position, int element, int capacity){
        if (position >= capacity)
            return position;
        arr[position] = element;
        return (position + 1);
    }
}
