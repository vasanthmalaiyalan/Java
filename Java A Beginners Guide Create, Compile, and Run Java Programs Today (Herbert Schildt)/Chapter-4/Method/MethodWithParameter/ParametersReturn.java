class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    // method with parameter + return
    int range(int extraFuel) {
        return (fuelcap + extraFuel) * mpg;
    }

    // method with multiple parameters
    boolean canCarry(int people, int LuggageWeight) {
        if (people <= passengers && LuggageWeight <= 100)
              return true;
        else
             return false;      
    }
}

public class ParametersReturn {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // assign values
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // using parameter + return
        int range1 = minivan.range(4); // extra fuel = 4
        int range2 = sportscar.range(2); // extra fuel = 2

        System.out.println("Minivan range: " + range1);
        System.out.println("Sportscar range: " + range2);

        // using multiple parameters
        if(minivan.canCarry(5, 80))
            System.out.println("Minivan can carry passengers and luggage");

        if(sportscar.canCarry(3, 50))
            System.out.println("Sportscar can carry passengers and luggage");
        else
           System.out.println("Sports cannot carry that load");        
    }
}