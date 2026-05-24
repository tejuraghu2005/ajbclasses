package day8;
class Triangle1 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");

            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

            if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}