package day5;

import java.util.Scanner;

public class Matrimony {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender == 'm' || gender == 'M') {
            if (age >= 21) {
                System.out.println("He can get married");
            } else {
                System.out.println("Please wait, you are not yet 21");
            }
        } 
        else if (gender == 'f' || gender == 'F') {
            if (age >= 18) {
                System.out.println("She can get married");
            } else {
                System.out.println("Please wait, you are not yet 18");
            }
        } 
        else {
            System.out.println("Invalid gender input");
        }

        sc.close();
    }
}