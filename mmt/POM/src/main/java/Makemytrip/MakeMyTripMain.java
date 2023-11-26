package Makemytrip;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeMyTripMain {
    
	public static ArrayList<Flight> flights = new ArrayList<>();
    private static ArrayList<Train> trains = new ArrayList<>();
    private static ArrayList<Hotel> hotels = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("welcome to makemyTrip website");
        
        System.out.println("what operation would you like to perform :");

        while (true) {
            System.out.println("1. Add Passenger");
            System.out.println("2. Search Flights and Trains");
            System.out.println("3. Book Tickets");
            System.out.println("4. Book Train Ticket");
            System.out.println("5. Book Hotel");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPassenger();
                    break;
                case 2:
                    searchFlightsAndTrains();
                    break;
                case 3:
                    bookTickets();
                    break;
                case 4:
                    bookTrainTicket();
                    break;
                case 5:
                    bookHotel();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void addPassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter passport number: ");
        String passportNumber = scanner.nextLine();

        Passenger passenger = new Passenger(name, passportNumber);
        System.out.println("Passenger added successfully: " + passenger);
    }

    private static void searchFlightsAndTrains() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source city: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination city: ");
        String destination = scanner.nextLine();

        // Assuming a simple flight and train list for demonstration
        flights.add(new Flight("ABC123", source, destination, 50));
        trains.add(new Train("11111", source, destination, 100));

        System.out.println("Available flights and trains:");
        System.out.println("Flights:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        System.out.println("Trains:");
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    private static void bookTickets() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the flight to book tickets: ");
        int flightChoice = scanner.nextInt();

        if (flightChoice >= 0 && flightChoice < flights.size()) {
            Flight flight = flights.get(flightChoice);
            bookFlightTickets(flight);
        } else {
            System.out.println("Invalid choice. Please enter a valid number for the flight.");
        }
    }

    public static void bookFlightTickets(Flight flight) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets to book: ");
        int numTickets = scanner.nextInt();

        if (numTickets > 0 && numTickets <= flight.availableSeats) {
            flight.availableSeats -= numTickets;
            System.out.println("Flight tickets booked successfully!");
        } else {
            System.out.println("Invalid number of tickets or not enough available seats.");
        }
    }

    private static void bookTrainTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the train to book tickets: ");
        int trainChoice = scanner.nextInt();

        if (trainChoice >= 0 && trainChoice < trains.size()) {
            Train train = trains.get(trainChoice);
            bookTrainTickets(train);
        } else {
            System.out.println("Invalid choice. Please enter a valid number for the train.");
        }
    }

    private static void bookTrainTickets(Train train) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets to book: ");
        int numTickets = scanner.nextInt();

        if (numTickets > 0 && numTickets <= train.availableSeats) {
            train.availableSeats -= numTickets;
            System.out.println("Train tickets booked successfully!");
        } else {
            System.out.println("Invalid number of tickets or not enough available seats.");
        }
    }


    private static void bookHotel() {
        
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter hotel name: ");
        String hotelName = sc.nextLine();
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = sc.nextLine();
        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = sc.nextLine();

        Hotel hotel = new Hotel(hotelName, checkInDate, checkOutDate);
        hotels.add(hotel);
        System.out.println("Hotel booked successfully: " + hotel);
    }

	
	
}
