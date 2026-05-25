package day10;

abstract class Plane
{
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane
{
    void takeoff()
    {
        System.out.println("Cargo plane is taking off on a long sized runway");
    }

    void fly()
    {
        System.out.println("Cargo plane is flying at low height");
    }

    void land()
    {
        System.out.println("Cargo plane is landing on long sized runway");
    }
}

class PassengerPlane extends Plane
{
    void takeoff()
    {
        System.out.println("Passenger plane is taking off from a medium sized runway");
    }

    void fly()
    {
        System.out.println("Passenger plane is flying at medium height");
    }

    void land()
    {
        System.out.println("Passenger plane is landing on medium sized runway");
    }
}

class FighterPlane extends Plane
{
    void takeoff()
    {
        System.out.println("Fighter plane is taking off from a short sized runway");
    }

    void fly()
    {
        System.out.println("Fighter plane is flying at great height");
    }

    void land()
    {
        System.out.println("Fighter plane is landing on short sized runway");
    }
}

public class PlaneDemo
{
    public static void main(String args[])
    {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.land();

        System.out.println();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.land();

        System.out.println();

        FighterPlane fp = new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.land();
    }
}