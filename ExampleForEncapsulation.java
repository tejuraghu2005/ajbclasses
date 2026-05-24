package day9;

class Car{
	private String name;
	private int mileage;
	private int cost;
	
	public void setData(String x,int y,int z)
	{
		name = x;
		mileage = y;
		cost = z;
	}
}

public class ExampleForEncapsulation {

	public static void main(String[] args) {
	    Car c = new Car();
	    c.setData("Maruthi 600", 60, 2000000);

	}

}
