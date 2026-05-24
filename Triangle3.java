package day8;

class Triangle3 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 10;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}