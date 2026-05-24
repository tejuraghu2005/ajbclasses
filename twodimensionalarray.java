package day9;
import java.util.Scanner;

public class twodimensionalarray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int age[][] = new int[5][2];   
        
       
        System.out.println("Enter ages of 5 students for 2 batches:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Student " + (i+1) + ", Batch " + (j+1) + ": ");
                age[i][j] = s.nextInt();
            }
        }
        
        System.out.println("\nAges of students:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(age[i][j] + " ");
            }
            System.out.println(); 
        }
        
        s.close();
    }
}