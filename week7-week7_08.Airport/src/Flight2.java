
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Flight2 {

    private String departure;
    private String destination;
    private HashMap<String, String> flight;

    public Flight2() {
        this.flight = new HashMap<String, String>();

    }

    public String getDeparture(String departure) {
        return this.departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination(String destination) {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void addFlight(String departures, String destinations) {
        flight.put(departures, destinations);

    }

    public String toString() {
        return "(" + this.departure + "-" + this.destination + ")";
    }
}
