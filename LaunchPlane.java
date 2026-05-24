package day10;

class plane                                    // parent class
{
    void takeoff()
    {
        System.out.println("plane is taking off");
    }

    void fly()
    {
        System.out.println("plane is flying");
    }

    void land()
    {
        System.out.println("plane is landing");
    }
}

class cargoplane extends plane
{
    void fly()
    {
        System.out.println("cargoplane is flying in low heights");
    }

    void carrycargo()
    {
        System.out.println("cargoplane carries cargo");
    }
}

class passengerplane extends plane
{
    void fly()
    {
        System.out.println("passengerplane is flying at medium height");
    }

    void carrypassengers()
    {
        System.out.println("passengerplane carries passengers");
    }
}

class flighterplane extends plane
{
    void fly()
    {
        System.out.println("flighterplane is flying at great heights");
    }

    void carryweapons()
    {
        System.out.println("flighterplane is carrying weapons");
    }
}

public class LaunchPlane
{
    public static void main(String[] args)
    {
        cargoplane cp = new cargoplane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carrycargo();

        passengerplane pp = new passengerplane();
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.carrypassengers();

        flighterplane fp = new flighterplane();
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryweapons();
    }
}