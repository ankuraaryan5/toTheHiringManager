public class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 2, 9, 19 };
        int lg = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lg) {
                lg = arr[i];
                position = i;
            }
        }
        System.out.println("largest element in the array is " + lg + " at " + position + " place");
    }
}