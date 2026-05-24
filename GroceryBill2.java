package day8;

import java.util.Scanner;

public class GroceryBill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = sc.next();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter membership (1 = member, 0 = non-member): ");
        int member = sc.nextInt();

        double subtotal = qty * price;
        double discount = (member == 1) ? subtotal * 0.10 : 0;
        double afterDiscount = subtotal - discount;

        double gstRate;
        if (afterDiscount > 500) {
            gstRate = 0.05;
        } else {
            gstRate = 0.12;
        }

        double gst = afterDiscount * gstRate;
        double total = afterDiscount + gst;

        // Detailed Output
        System.out.println("\nInput: " + item + ", " + qty + ", " + price + ", " + member);
        System.out.printf("Subtotal = %.2f\n", subtotal);

        if (member == 1) {
            System.out.printf("Member discount = %.2f\n", discount);
        } else {
            System.out.println("No discount");
        }

        System.out.printf("After discount = %.2f\n", afterDiscount);

        if (afterDiscount > 500) {
            System.out.printf("%.2f > 500, so 5%% GST = %.2f\n", afterDiscount, gst);
        } else {
            System.out.printf("%.2f <= 500, so 12%% GST = %.2f\n", afterDiscount, gst);
        }

        System.out.printf("Total = %.2f\n", total);

        sc.close();
    }
}