package Makemytrip;

public class Flight {
	
	    String flightNumber;
	    String source;
	    String destination;
	    public int availableSeats;

	    public Flight(String flightNumber, String source, String destination, int availableSeats) {
	        this.flightNumber = flightNumber;
	        this.source = source;
	        this.destination = destination;
	        this.availableSeats = availableSeats;
	    }

	    @Override
	    public String toString() {
	        return "Flight{" +
	                "flightNumber='" + flightNumber + '\'' +
	                ", source='" + source + '\'' +
	                ", destination='" + destination + '\'' +
	                ", availableSeats=" + availableSeats +
	                '}';
	    }
	}

