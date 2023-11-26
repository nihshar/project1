// Hotel.java (Subclass of TravelEntity)
package Makemytrip;

public class Hotel  {
    private String hotelName;
    private int availableRooms;

    public Hotel(String hotelName, int availableRooms) {
        super();
        this.hotelName = hotelName;
        this.availableRooms = availableRooms;
    }

    public Hotel(String hotelName2, String checkInDate, String checkOutDate) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", availableRooms=" + availableRooms +
                '}';
    }
}
