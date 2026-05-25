package day10;

// Superclass
class HillStations {

    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

// Manali class
class Manali extends HillStations {

    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

// Mussoorie class
class Mussoorie extends HillStations {

    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}

// Gulmarg class
class Gulmarg extends HillStations {

    @Override
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}

// Main class
public class HillStationDemo {

    public static void main(String[] args) {

        // Calling superclass methods
        HillStations hs = new HillStations();

        hs.location();
        hs.famousFor();

        // Runtime polymorphism
        hs = new Manali();
        hs.location();
        hs.famousFor();

        hs = new Mussoorie();
        hs.location();
        hs.famousFor();

        hs = new Gulmarg();
        hs.location();
        hs.famousFor();
    }
}