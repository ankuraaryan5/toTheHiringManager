import java.util.Scanner;

public class Practice_23 {
    public static void main(String[] args) {
//         question 1
//        float[] arr= {2.5f, 3.5f, 8.9f, 3.4f, 0.8f};
//        float sum=0;
//        float avg=0;
//        int i=0;
//        while (i<arr.length){
//            sum=sum+arr[i];
//            i++;
//        }
//        avg=sum/ arr.length;
//        System.out.println("sum =" + sum);
//        System.out.println("avg = "+avg);
//      question 2
//        int [] arr={3,4,5,2,6,8};
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the number you are looking for");
//        int j=sc.nextInt();
//        for (int i=0; i< arr.length; i++){
//            if (j==arr[i]){
//                System.out.println(j+" is found at position " + i);
//                return;
//            }
//        }
//        System.out.println(j + "cannot be found");
//          question 3
//        int [] arr ={45, 32,57, 98, 45};
//        int sum=0;
//        for (int students:arr){
//            sum=sum+students;
//        }
//        int avg = sum/ arr.length;
//        System.out.println("avg = "+avg);
//        System.out.println("sum = "+sum);
//        question 4
//        int [][] arr =new int[2][3];
//        arr[0][0]=2;
//        arr[0][1]=3;
//        arr[0][2]=4;
//        arr[1][0]=5;
//        arr[1][1]=6;
//        arr[1][2]=2;
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                sum=sum+arr[i][j];
//            }
//        }
//        System.out.println(sum);
//        question 5
//        int [] arr ={43, 52, 65, 34, 23};
//        int l =arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i=0; i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr){
//            System.out.print(element + " ");
//        }
        //question 6
//        int [] arr={43, 25, 83, 54, 43};
//        int max=0;
////        for (int i=0; i< arr.length; i++){
////            if (arr[i]>=max){
////                max=arr[i];
////            }
////        }
//        for(int i:arr){
//            if (i>=max){
//                max=i;
//            }
//        }
//        System.out.println(max);
//        question 7
//        int [] arr={43, 42, 54, 92, 12};
//        int min=Integer.MAX_VALUE;
//        for (int i:arr){
//            if (i<=min){
//                min=i;
//            }
//        }
//        System.out.println(min);
//        question 8
        int [] arr={32, 45, 21, 53, 12};
        boolean sorted=true;
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
