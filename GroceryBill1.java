package day8;

import java.util.Scanner;

public class GroceryBill1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter membership (1 = member, 0 = non-member): ");
        int member = sc.nextInt();

        double subtotal = qty * price;

        double discount = 0;
        if (member == 1) {
            discount = subtotal * 0.10;
        }

        double afterDiscount = subtotal - discount;

        double gst;
        if (afterDiscount > 500) {
            gst = afterDiscount * 0.05;
        } else {
            gst = afterDiscount * 0.12;
        }

        double total = afterDiscount + gst;

        System.out.println("\nItem: " + item);
        System.out.printf("Subtotal: Rs %.2f\n", subtotal);
        System.out.printf("Discount: Rs %.2f\n", discount);
        System.out.printf("GST: Rs %.2f\n", gst);
        System.out.printf("Final Total: Rs %.2f\n", total);
    }
}