// Train.java (Subclass of TravelEntity)
package Makemytrip;

public class Train  {
    private String trainNumber;
    private String source;
    private String destination;
    int availableSeats;

    public Train(String trainNumber, String source, String destination, int availableSeats) {
        super();  // Set name to a combination of source and destination for simplicity
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber='" + trainNumber + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
