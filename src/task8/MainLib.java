package task8;

import com.skillbox.airport.Airport;

public class MainLib {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().size());
    }
}
