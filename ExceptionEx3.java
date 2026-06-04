package day11; //Checked Exceptions 

public class ExceptionEx3 { 
    public static void main(String[] args) { 
        for(int i = 1; i <= 5; i++) { 
            System.out.println(i); 
            try {
                Thread.sleep(2000); // Pauses for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        } 
    } 
}