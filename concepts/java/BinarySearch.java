import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,4, 5, 6, 78, 87, 98, 121, 134, 231, 342,654};
        System.out.print("enter the element you want to search ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = binSearch(arr, x);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    public static int binSearch(int[] arr, int x){
        int min=arr[0];
        int max = arr.length-1;
        while (min<=max) {
            int mid= min+(max-min)/2;
            if (arr[mid]==x) {
                return mid;
            }
            else if (arr[mid]<x) {
                min=mid+1;
            }
            else {
                max=mid-1;
            }
        }
        return -1;
    }
}