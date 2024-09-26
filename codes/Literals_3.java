public class Literals_3 {
    public static void main(String[] args) {
        byte age =23;
        long age2= 344444444444L;// by default, it is considered as integer, so we use L to
        // specify it as long data type
        char a ='A';
        float f1= 5.5f; // we need to add f with the literal to confirm it is a
        // floating point number... otherwise it will be considered as double by default
        double d1 = 5.6;
        boolean A = false;
        System.out.println(A);
        System.out.println(age);
        String str ="ankur";
        System.out.println(str);
    }
}