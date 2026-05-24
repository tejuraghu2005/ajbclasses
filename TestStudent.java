package day7;
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Teju", 85);
        Student s2 = new Student("Aishu", 90);

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}