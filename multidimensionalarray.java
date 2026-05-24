package day9;
import java.util.Scanner;

public class multidimensionalarray {

	public static void main(String[] args) {
		
		      Scanner s = new Scanner(System.in);

		      int age[][][] = new int[2][2][5];

		      for(int i=0; i<age.length; i++)
		      {
		        for(int j=0; j<age[i].length; j++)
		         {
		            for(int k=0; k<age[i][j].length; k++)
		             {
		                System.out.println("Enter the age of student "+ (k+1) + " Batch " + (j+1) + " Region " + (i+1));
		              age[i][j][k] = s.nextInt();
		             }
		          }
		       }
		       System.out.println("The ages are : " );
		        for(int i=0; i<age.length; i++)
		      {
		        for(int j=0; j<age[i].length; j++)
		         {
		            for(int k=0; k<age[i][j].length; k++)
		             {
		               System.out.println(age[i][j][k]);
		             }
		          }
		       }
		   }
		}