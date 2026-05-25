package day9;

class Plane
{
    void takeoff()
    {
        System.out.println("Plane is taking off");
    }

    void fly()
    {
        System.out.println("Plane is flying");
    }

    void land()
    {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane
{
    void fly()
    {
        System.out.println("CargoPlane is flying in low heights");
    }

    void carryCargo()
    {
        System.out.println("CargoPlane carries cargo");
    }
}

class PassengerPlane extends Plane
{
    void fly()
    {
        System.out.println("PassengerPlane is flying at medium height");
    }

    void carryPassengers()
    {
        System.out.println("PassengerPlane carries passengers");
    }
}

class FighterPlane extends Plane
{
    void fly()
    {
        System.out.println("FighterPlane is flying at great heights");
    }

    void carryWeapons()
    {
        System.out.println("FighterPlane is carrying weapons");
    }
}

public class LaunchPlane
{
    public static void main(String[] args)
    {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carryCargo();

        System.out.println();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.carryPassengers();

        System.out.println();

        FighterPlane fp = new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    }
}