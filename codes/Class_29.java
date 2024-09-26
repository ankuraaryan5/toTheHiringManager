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

