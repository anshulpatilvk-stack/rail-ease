
public class RegularPassenger extends Passenger {

    public RegularPassenger(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateFare(double baseFare) {
        return baseFare;
    }
}

