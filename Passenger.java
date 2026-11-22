
public abstract class Passenger {

    private int passengerId;
    private String name;
    private int age;

    // Constructor
    public Passenger(int passengerId, String name, int age) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateFare(double baseFare);
}

