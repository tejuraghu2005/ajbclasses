package day9;
import java.util.Scanner;

public class onedimensionalarray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int age[] = new int[5];   
        
      
        System.out.println("Enter 5 ages:");
        for (int i = 0; i < 5; i++) {
            age[i] = s.nextInt();
        }
        
     
        System.out.println("Ages are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(age[i]);
        }
        
        s.close();
    }
}