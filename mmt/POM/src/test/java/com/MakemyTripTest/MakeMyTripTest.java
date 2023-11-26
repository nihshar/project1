package com.MakemyTripTest;

import Makemytrip.Flight;
import Makemytrip.Passenger;
import Makemytrip.MakeMyTripMain;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeMyTripTest {

    private MakeMyTripMain makeMyTrip;

    @Before
    public void setUp() {
        makeMyTrip = new MakeMyTripMain();
    }

    @Test
    public void testBookFlightTickets() {
        // Assuming a flight with 50 available seats
        Flight flight = new Flight("ABC123", "CityA", "CityB", 50);
        makeMyTrip.flights.add(flight);

        // Assuming a passenger with a passport number
        Passenger passenger = new Passenger("John Doe", "ABC123456");
        
        // Add passenger to the list
        

        // Book tickets for the flight
        makeMyTrip.bookFlightTickets(flight);

        // Check if the available seats are updated correctly
        assertEquals(49, flight.availableSeats);
    }

    // Additional test methods can be added for other functionalities

    @After
    public void tearDown() {
        // Clean up resources if needed
    }
}
