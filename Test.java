package day7;

class Employee
{
    int age = 101;
    String name = "XYZ";
    double salary = 15000.76;
}

public class Test {

    public static void main(String[] args) {

        Employee e = new Employee();
        System.out.println(e.age);
        System.out.println(e.name);
        System.out.println(e.salary);
    }
}