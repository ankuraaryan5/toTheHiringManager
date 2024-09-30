class MyEmployee {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int n) {
        salary = n;
        return salary;
    }

    public String setName(String s) {
        name = s;
        return name;
    }
    // What are constructors?
    // constructors are the methods in java with same name as className and no return type
    // these are of two types: 1. default, 2. parameterized
    public MyEmployee(){
        //it is a default constructor
        salary=45000;
        name="Ankur";
    }

    public MyEmployee(int S, String n){
        // we can also set parameters to the constructors so this is parameterized constructor
        salary=S;
        name=n;
    }
    // we can also overload a constructor
    public MyEmployee(int S){
        salary=S;
    }    
}

public class Constructors_32 {
    public static void main(String[] args) {
        // MyEmployee ankur = new MyEmployee();
        // ankur.setName("Ankur");
        // ankur.setSalary(100000);
        // MyEmployee ankur = new MyEmployee(100000, "ankur");
        MyEmployee ankur = new MyEmployee(100000);
        System.out.println(ankur.getName());// this will return null for line 48 because we have overloaded the default constructor here and are only setting the salary of employee
        System.out.println(ankur.getSalary());
    }
}
