package day3;

public class operators {

	public static void main(String[] args) {
		
		System.out.println("------Arithmetic Operators------");
		
		int num1 = 30;
		int num2 = 40;
		System.out.println("Addition" + (num1 + num2));
		System.out.println("Substraction" + (num1 - 12));
		System.out.println("Multiplication" + (num2 * 3));
		System.out.println("Division" + (num2 / 10));
		System.out.println("Modulus" + (num2 % 3));
		
		System.out.println("------Assignment Operators------");
		
		int x = 10;
		x += 5;//x = x+5
		System.out.println("Value of x:" + x);
		x -= 3;//x = x-3
		System.out.println("Value of x:" + x);
		x /= 2;//x = x/2
		System.out.println("Value of x:" + x);
		x *=3;//x = x*3
		System.out.println("Value of x:" + x);
		
		System.out.println("------Comparison Operators------");
		
		int a = 10;
		int b = 20;
		
		System.out.println(a<b);//True
		System.out.println(a<=5);//False
		System.out.println(b>a);//True
		System.out.println(b>=50);//False
		System.out.println(a==b);//False		
		System.out.println(a!=b);//True
		
		System.out.println("------Logical Operators------");
		
		int p = 1;
		int q = 2;
		boolean result = p<q && p==1;
		System.out.println(result);//True
		System.out.println(p<=4 || q==10);//True
		System.out.println(!true);//False
		System.out.println(!false);//True
		
		
		
		
		
		
				
	}
}
		
		

	


