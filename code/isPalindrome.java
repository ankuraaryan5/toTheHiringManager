import java.util.Scanner;

public class isPalindrome {
    // public boolean isPalindrome(String str){
    //     String newStr="";
    //     char ch;
    //     for (int i = 0; i < str.length(); i++) {
    //         ch=str.charAt(i);
    //         newStr=ch+newStr;
    //     }
    //     if (newStr.equals(str)) {
    //         System.out.println("1 "+newStr);
    //         return true;
    //     }
    //     else{
    //         System.out.println("2 "+newStr);
    //     }
    //     System.out.println(str.length());
    //     System.out.println(newStr.length());
    //     return false;
    // }

    public boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            if (str.charAt(i)==str.charAt(str.length()-i-1)) {
                return true;
            }
            // this is a better version
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String str = sc.nextLine();
        isPalindrome p = new isPalindrome();
        if (p.isPalindrome(str)) {
            System.out.println("this is a Palindrome");    
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
