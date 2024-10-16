import java.util.Scanner;
public class FrequencyOfElement{
    static int frequency(int [] arr, int k){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {34, 23, 65, 24, 34, 63, 67};
        System.out.println("enter the element you want to search for");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("frequency of "+k+" is: "+frequency(arr, k));
    }
}
