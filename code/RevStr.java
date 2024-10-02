import java.util.*;
import java.lang.*;
import java.io.*;
public class RevStr{
    public static void main(String[] args) {
        String str;
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        System.out.println("your string was "+str);
        String revString="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            revString=ch+revString;
        }
        System.out.println("reversed String is "+revString);
    }
}