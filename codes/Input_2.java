public class One {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// all me previous codes are here, ididn' want to push them one by one because i m lazy 


// package com.example;
// import java.util.Scanner;
public class Input_2 {
    public static void main(String[] args) {
        System.out.println("Taking Inputs");
        Scanner a = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int num1 = a.nextInt();
//        System.out.println("enter number 2");
//        int num2 = a.nextInt();
//        int sum = num2+num1;
//        System.out.println(sum);
//        boolean b1 = a.hasNextInt();
//        System.out.println(b1);
//        String str = a.next();
//        System.out.println(str);
        String fullLine= a.nextLine();
        System.out.println(fullLine);
    }
}

// package com.example;
// the values stored inside a variable is called literal
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

// package com.example;

// import java.util.Scanner;

public class Marks_4 {
    public static void main(String[] args) {
        System.out.println("enter marks obtained in s1 ");
        Scanner a = new Scanner(System.in);
        int s1 = a.nextInt();
        System.out.println("enter marks obtained in s2 ");
        int s2 = a.nextInt();
        System.out.println("enter marks obtained in s3 ");
        int s3 = a.nextInt();
        System.out.println("enter marks obtained in s4 ");
        int s4 = a.nextInt();
        System.out.println("enter marks obtained in s5 ");
        int s5 = a.nextInt();
        float per = ((float) (s1+s2+s3+s4+s5)/500)*100;
        System.out.println("total obtained percentage is " + per);
    }
}

// package com.example;

public class Precedence_5 {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        int b = 6/5 - 34*2;
        System.out.println(a);
        System.out.println(b);
        //Precedence & Associativity

    }
}

// package com.example;

public class Resulting_Data_type_6 {
    public static void main(String[] args) {
        int a = 153 + 43;
        System.out.println(a);
        byte x = 5;
        int y =3;
        int z = x + y;
        System.out.println(z);
        float b = a + 34.0f;
        System.out.println(b);
        System.out.println(a++); // first i is used then incremented
//        a++;
//        System.out.println(++a); // first i is incremented then used
        System.out.println(a);
    }
}


// package com.example;

// import java.util.Scanner;

public class Set1_7 {
    public static void main(String[] args) {
//        qn. 1
        float a = 8/4 * 9/2;
        float b = 7/4f * 9/2f;
        System.out.println(a);
        System.out.println(b);
//        qn 2
        char grade = 'b';
        grade = (char)(grade+8);
        System.out.println(grade);

        grade = (char) (grade-8);
        System.out.println(grade);

        //qn 3
        Scanner sc = new Scanner(System.in);
        System.out.println("input your number");
        int c = sc.nextInt();
        System.out.println(c>9);
//        qn 4
        int v =sc.nextInt();
        int u = sc.nextInt();
        int s = sc.nextInt();

        int d = (int) ((v*v - u*u)/(2*a*s));
        System.out.println(d);
//        qn 5

        int m= 7*49/7 + 35/7;
        System.out.println(m);
    }
}


// package com.example;

public class Strings_8 {
    public static void main(String[] args) {
//        String a = new String("Ankur");
        String a ="ankur";
        System.out.print("my name is ");
        System.out.println(a);
        int b =5;
        float c = 5.6f;
        System.out.printf("The value of b is %d and the value of c is %f \n", b,c);
        System.out.format("The value of b is %d and the value of c is %.1f", b,c);
    }
}


// package com.example;

public class String_Methods_9 {
    public static void main(String[] args) {
        String name = "Ankur";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("cg"));
        System.out.println(name);
        String new_name= "   ankur   ";
        System.out.println(new_name.length());
        System.out.println(new_name.trim());
        System.out.println(new_name);
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('a','A'));
        System.out.println(name.startsWith("ank"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf('w',4));
        System.out.println(name.equals("ankur"));
        System.out.println(name.equals("ankurs"));
        System.out.println(name.equalsIgnoreCase("ankur"));
    }
}


// package com.example;

// import java.util.Scanner;

public class Set2_10 {
    public static void main(String[] args) {
        String a= "Dear <|name|>, Thanks a lot";
        System.out.println(a);
        System.out.println("input your name");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(a.replace("<|name|>", name));


    }
}

// package com.example;

// import java.util.Scanner;

public class Conditionals_11 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("you can drive");
        }
        else {
        System.out.println("you can't drive");
        }
    
    }
}


// package com.example;

public class Logical_12 {
    public static void main(String[] args) {
        System.out.println("Run for AND");
        boolean a = true;
        boolean b = false;
//        boolean b =true;
        if (a&&b) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("Run for OR");
//        boolean a1= true;
        boolean a1= false;
//        boolean b1=false;
        boolean b1= true;
        if (a1||b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}


// package com.example;

// import java.util.Scanner;

public class elseIf_13 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter you age");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced");
        } else if (age>45) {
            System.out.println("you are semi-experienced");
        } else if (age>30) {
            System.out.println("you are semi-semi-experienced");
        }
        else {
            System.out.println("you are not experienced");
        }
    }
}


// package com.example;

// import java.util.Scanner;

public class Switch_14 {
    public static void main(String[] args) {
//        int age;
//        System.out.println("enter your age");
//        Scanner sc = new Scanner(System.in);
//        age= sc.nextInt();
//        switch(age){
//            case 18:
//                System.out.println("your are going to become adult!");
//                break;
//            case 23:
//                System.out.println("you are going to join a job");
//                break;
//            case 60:
//                System.out.println("you are going to retire");
//                break;
//            default:
//                System.out.println("enter correct age");
//        }
//        System.out.println("thanks for running the code");
        String var= "raaa";
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        var = sc.next();
        switch (var){
            case "c":
                System.out.println("you entered C");
                break;
            case "raaa":
                System.out.println("you entered R");
                break;
            case "p":
                System.out.println("you entered P");
                break;
            default:
                System.out.println("good luck");
        }
    }
}


// package com.example;

// import java.util.Scanner;

public class Practice_15 {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks in sub1");
        m1=sc.nextByte();

        System.out.println("enter your marks in sub2");
        m2=sc.nextByte();

        System.out.println("enter your marks in sub3");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your % is "+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congrats! you have been promoted");
        }
        else{
            System.out.println("sorry, you have not been promoted");
        }
    }
}


// package com.example;

// import java.util.Scanner;

public class Loops_16 {
    public static void main(String[] args) {
        int i=1;
        while (i<=3){
            System.out.println(i);
            i++;
        }
//        while (i>=3){
//            System.out.println(i);
//            i++;
//        }
//        infinite loop
        int b =10;
        do {
            System.out.println(b);
            b++;
        }
        while(b<5);

        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int j=1;
        System.out.println("first "+n+" natural numbers are");
        do {

            System.out.println(j);
            j++;
        }
        while (j<n);
        System.out.println("first "+n+" odd numbers are");
        for (int c=0; c<n;c++){
            System.out.println(2*c+1);
        }
    }
}


// package com.example;

public class Break_and_continue_17 {
    public static void main(String[] args) {
        //break and continue using loops
        for (int i=0; i<5; i++){
            System.out.println(i);
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
        }
        for (int j=0; j<5; j++){
//            System.out.println(j);
            if (j==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(j);
        }
    }
}


// package com.example;

// import java.util.Scanner;

public class practice_18 {
    public static void main(String[] args) {
        System.out.print("enter the value of n");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
//        for (int i=n; i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        int i=0;
//        int sum=0;
//        while(i<n){
//            sum=sum+(2*i);
////            System.out.println(i);
//            i++;
//        }
//        System.out.println(sum);

//        int i=1;
//        while(i<=10){
//            System.out.println(i*n);
//            i++;
//        }
//        int i=10;
//        while(i>=1){
//            System.out.println(n*i);
//            i--;
//        }
//        int i=n-1;
//        while(i>0){
//            n=n*i;
//            i--;
//        }
//        System.out.println(n);
        int sum=0;
        for(int i=1; i<=10;i++){
           sum=sum+(n*i);

        }
        System.out.println(sum);
    }
}

// package com.example;

// import java.util.Scanner;

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


// package com.example;

public class MulDimArr_22 {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println(flats[0][2]);
        for (int i =0; i<flats.length; i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}


// package com.example;

// import java.util.Scanner;

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


// package com.example;

// import java.util.Scanner;

public class Methods_24 {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else if (x<y){
            z=x*y;
        }
        else {
            z=x-y+1;
        }
        return z;
    }
//    int logicB(int x, int y){
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else if (x<y){
//            z=x*y;
//        }
//        else {
//            z=x-y+1;
//        }
//        return z;
//    }
    public static void main(String[] args) {
        // the basic difference between a method and a function is that
        // a method is a function which is inside a class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a");
        int a = sc.nextInt();
        System.out.println("enter the value for b");
        int b = sc.nextInt();
        int c =logic(a,b);
//        Methods_24 obj = new Methods_24();
//        c= obj.logicB(a,b);
        System.out.println(c);
    }
}


// package com.example;

public class Method_Overloading_25 {
    static void tellJoke(){
        System.out.println("What do you call an alligator detective? An investi-gator.");
    }
    static void tellJoke(int a){
        System.out.println(a+ " What do you call an alligator detective? An investi-gator.");
    }
//    static int tellJoke(int a){
//        System.out.println(a+ " What do you call an alligator detective? An investi-gator.");
//    }
//  method overloading cannot happen by changing return type of a method, it can happen only by changing/adding parameters to a method
    public static void main(String[] args) {
        tellJoke();
        tellJoke(3000); //arguments are actual
    }
}


// package com.example;

public class varargs_26 {
    static int sum(int ... arr){
        int res=0;
        for (int a:arr){
            res=res+a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2, 3, 4 is: "+ sum(2,3,4));
        System.out.println("Sum of 2, 3, 4, 5 is: "+ sum(2,3,4,5));
    }
}


// package com.example;

public class Recursion_27 {
    static int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        else{
            n=n*fact(n-1);
        }
        return n;
    }
    static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("value of factorial " +x +" is: "+fact(x));
        int y=5;
        System.out.println(y + "th Fibonacci Number: " + fib(y));
    }
}


// package com.example;

// import java.util.Scanner;

public class Practice_28 {
//    static void table(int n){
//        System.out.println("here is the table for "+ n);
//        for (int i=1; i<=10;i++){
//            System.out.format("%d * %d = %d\n", n,i,n*i);
//        }
//    }
//    static void pattern(int n){
//        for (int i=n;i>0; i--){
//            for (int j=0; j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int sum0fn(int n){
//        if (n==1)
//            return 1;
//        return n+sum0fn(n-1);
//    }
//    static void pattern(int n){
//        for (int i=0;i<n;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int fib(int n){
////        if (n==1){
////            return 0;
////        }
////        else if (n==2){
////            return 1;
////        }
//        if (n==1||n==2){
//            return n-1;
//        }
//        else
//            return fib(n-1)+fib(n-2);
//    }
//    static void pattern_rec(int n){
//        if (n>0){
//            pattern_rec(n-1);
//            for (int i=0; i<n;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        //Problem 1
//        System.out.println("enter the number for which you want to generate the table ");
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        table(a);
        //Problem 2
//        pattern(7);
        //Problem 3
//        System.out.println(sum0fn(3));
        //Problem 4
//        pattern(5);
        //Problem 5
//        System.out.println(fib(5));
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(fib(i));
//        }
        //Problem 6
//        System.out.println(avg(6));
        //Problem 7
//        pattern_rec(5);
        //Problem 9
        System.out.print("Enter the temp: ");
        Scanner sc =new Scanner(System.in);
        float temp= sc.nextInt();
        float res = (temp*9/5)+32;
        System.out.println("temp in fahrenheit is "+res);
    }
}


// package com.example;

class Employer{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public int Salary(){
        return salary;
    }
}

public class Class_29 {
    public static void main(String[] args) {
        System.out.println("Inside custom class");
        Employer Ankur= new Employer();
        Employer Jack = new Employer();
        Ankur.id=12;
        Ankur.name="Ankur";
        Ankur.salary=3400;
        Ankur.printDetails();
        System.out.println(Ankur.Salary());
        Jack.id=13;
        Jack.name="Jack";
        Jack.salary=4300;
        Jack.printDetails();
        System.out.println(Jack.Salary());
    }
}


// package com.example;

class Employee{
    int salary;
    String name;
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int setSalary(int n){
        salary = n;
        return salary;
    }
}

public class Practice_30 {
    public static void main(String[] args) {
        System.out.println("1");
        Employee Anku = new Employee();
        Anku.name="Ankur";
        Anku.salary=100000;
        System.out.println(Anku.getName());
        System.out.println(Anku.getSalary());
        Anku.setSalary(340000);
        System.out.println(Anku.getSalary());
//        Ankur.getSalary();
    }
}


