
public class Train {

    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private double fare;
    private int availableSeats;

    // Constructor
    public Train(int trainNumber, String trainName,
                 String source, String destination,
                 double fare, int availableSeats) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.availableSeats = availableSeats;
    }

    // Display train details
    public void displayTrain() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: Rs. " + fare);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Book a seat
    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    // Cancel a seat
    public void cancelSeat() {
        availableSeats++;
    }

    // Getter methods
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

