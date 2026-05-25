package day10;

// Abstract class
abstract class Vaccine {

    int age;
    String nationality;
    boolean firstDoseDone = false;

    // Constructor
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // First Dose method
    void firstDose() {

        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("Your First dose Successfully Done. Now you have to pay 250 Rs");
            firstDoseDone = true;
        } else {
            System.out.println("You are not eligible for first dose");
        }
    }

    // Second Dose method
    void secondDose() {

        if (firstDoseDone) {
            System.out.println("Your Second Dose Successfully Done");
        } else {
            System.out.println("Take first dose before second dose");
        }
    }

    // Abstract method
    abstract void boosterDose();
}


// Implementation class
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Your Booster dose Successfully Done");
    }
}


// Main class
public class Vaccination {

    public static void main(String[] args) {

        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}