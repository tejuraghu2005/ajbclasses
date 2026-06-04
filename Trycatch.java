package day11;

import java.util.Scanner;

public class Trycatch{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Division by Zero
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            int result = num / divisor;
            System.out.println(result);

            // Array Index Out of Bounds
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println(arr[index]);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index is out of bounds.");
        }
    }
}